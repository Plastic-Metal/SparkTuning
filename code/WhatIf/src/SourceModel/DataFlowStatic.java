package SourceModel;

import java.util.HashMap;
import java.util.LinkedList;


/**
 *@author wenyanqi
 * ��ģ�׶��õ������е�dataflowͳ����Ϣ
 */
public class DataFlowStatic extends Statistics{

	
	//HDFS��һ��partition�Ĵ�С��Ĭ��Ϊ128M
	public long dsSplitSize;
	
	public static HashMap<Integer, Long> dsinputBytesList = new HashMap<Integer, Long>();
	
	public static HashMap<Integer, Long> dsShuffleReadBytesList = new HashMap<Integer, Long>();
	
	public static HashMap<Integer, Long> dsShuffleReadRecList = new HashMap<Integer, Long>();
	
}
