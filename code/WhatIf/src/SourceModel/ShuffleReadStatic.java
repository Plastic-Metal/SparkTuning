package SourceModel;

/**  
 * @author wenyanqi 
 * 
 */
public class ShuffleReadStatic {
	
	//shuffle read�������Ƿ���mapSideCombine
	public boolean mapSideCombine;
	
	//shuffle read������ byPassMergeSort
	public boolean byPassMergeSort;
	
	public boolean spillEnabled;
	
	//shuffle read��ȡ���������б������ݵı���
//	public long dsLocalBytesRadio;   //��ʱû�õ�
	
	//Shuffle����������ѹ���ʣ���ѹ��֮ǰ��ѹ�������������ֵ
//	public long dsShuffleCompressRatio; //��ʱû�õ�
	
	//spill����������ѹ���ʣ���ѹ��֮ǰ��ѹ�������������ֵ
	//public long dsSpillCompressRatio;
	
	//spill combineǰ������¼�ı���
	public double dsSpillCombRecsSel;  //profile���������
	
	//merge��combineǰ���¼����
	public double dsMergeCombRecsSel;   //profile���������
	
	
	public double csSpillPerRecsCost; //profile���������

	
	public double csMergeReadPerRecsCost;  //profile���������
	
	
	//TimSortһ�λ��ѵ�ʱ��
	public double csTimSortCost;  //profile���������
		
	//��merge��ʱ�򣬶������򻨷ѵ�ʱ��
	public double csQueueSortCost;  //profile���������
	
	//merge������combine��ʱ��
	public double csMergeCombCost;  //profile���������
	
	//��spill������combineһ����¼��ʱ��
	public double csSpillCombCost;  //profile���������
		
	//shuffle read һ����¼�Ļ���ʱ��
	public double csShuffleReadPerRecsCost;  //profile���������
	
	//shuffle read spill��һ��record���ڴ��С
	public long objectSize;

}
