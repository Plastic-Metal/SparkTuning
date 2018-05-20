package whatif;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
import org.dom4j.Document;  
import org.dom4j.DocumentException;
import org.dom4j.Element;  
  
import org.dom4j.io.SAXReader;  

import SourceModel.Parameter;
import SourceModel.StageInfo;
import SourceModel.TaskInfo;

/**  
 * @author wenyanqi 
 * 
 */
public class handleProfile {

	//String logPath = "D:\\usr\\sparklogs";
	//String logPath = "/usr/sparklogs";
	
	public static File applicationFile = null;
	
	//��¼����stage����Ϣ
	public static ArrayList<StageInfo> stageinfos = new ArrayList<StageInfo>();
	
	//��ȡ���е�stagexml
	public static void readXML(String logPath) {	
		
		File logRoot = new File(logPath);
		
		if(!logRoot.exists()) {
			System.out.println("ERROR: log path:"+logPath+" not exists");
			return ;
		}
		
		//���Ҹ�·���µ����µ��ļ��о��Ƕ�Ӧ��Ҫ������ļ���
		
		long newCreatetime = 0L;
		for(File file: logRoot.listFiles()) {
			if(file.lastModified() > newCreatetime) {
				applicationFile = file;
				newCreatetime = file.lastModified();
			}
		}	
		
		File executorFile = new File(applicationFile,"executor");
		
		if(!executorFile.exists()) {
			System.out.println("ERROR: executor log path:"+executorFile.getAbsolutePath()+" not exists");
			return ;
		}
		
		File[] stageFiles = executorFile.listFiles();
		
		for(int i=0; i<Parameter.stageSize; i++) {
//			String fileTemp = "Stage-" + i +".xml";
			File fileTemp = new File(executorFile, "Stage-" + i +".xml");
			if(fileTemp.isFile()) {
				System.out.println(fileTemp.getAbsolutePath());
				readStageXML(fileTemp);
			}
		}
		
	}
	
	//��ȡһ��stage��xml
	public static void readStageXML(File stagefile) {
		SAXReader reader = new SAXReader();  
		try {
			Document document = reader.read(stagefile);
			StageInfo stageinfo = new StageInfo();
			
			Element root = document.getRootElement();
			stageinfo.stageId = Integer.parseInt(root.attributeValue("id"));	
			System.out.println(stageinfo.stageId);
			stageinfo.isRead = Boolean.parseBoolean(root.element("isRead").getText());
//			stageinfo.isSendResult = Boolean.parseBoolean(root.element("isSendResult").getText());
			stageinfo.isShuffleRead = Boolean.parseBoolean(root.element("isShuffleRead").getText());
			stageinfo.isShuffleWrite = Boolean.parseBoolean(root.element("isShuffleWrite").getText());
			stageinfo.shuffleManager = root.element("ShuffleManager").getText();
			
			
			List<Element> taskElements = root.elements("task");
			
			for(Element taskelement: taskElements) {
				TaskInfo taskinfo = new TaskInfo();
				taskinfo.readTaskXML(taskelement);
				stageinfo.taskinfos.add(taskinfo);	
				 
			}
			stageinfo.shufflewrite_s.mapSideCombine =stageinfo.taskinfos.get(0).shufflewrite.mapSideCombine;
			stageinfo.shufflewrite_s.byPassMergeSort =stageinfo.taskinfos.get(0).shufflewrite.byPassMergeSort;
			stageinfo.shufflewrite_s.spillEnabled =stageinfo.taskinfos.get(0).shufflewrite.spillEnabled;
			
			stageinfo.shuffleread_s.mapSideCombine =stageinfo.taskinfos.get(0).shuffleread.mapSideCombine;
			stageinfo.shuffleread_s.byPassMergeSort =stageinfo.taskinfos.get(0).shuffleread.byPassMergeSort;
			stageinfo.shuffleread_s.spillEnabled =stageinfo.taskinfos.get(0).shuffleread.spillEnabled;
			
			stageinfo.handleStatic();
			stageinfos.add(stageinfo);
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
