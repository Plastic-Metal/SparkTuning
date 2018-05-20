package SourceModel;

/**  
 * @author wenyanqi 
 * 
 */
public class ShuffleWriteStatic {
	
	//shufflewrite�������Ƿ���mapSideCombine
	public boolean mapSideCombine;
	
	//shufflewrite������ byPassMergeSort
	public boolean byPassMergeSort;
	
	public boolean spillEnabled;
	
	//Shuffle����������ѹ���ʣ���ѹ��֮ǰ��ѹ�������������ֵ
	public long dsShuffleCompressRatio;  //û���õ�
	
	//spill����������ѹ���ʣ���ѹ��֮ǰ��ѹ�������������ֵ
	public long dsSpillCompressRatio;   //û���õ�
	
	//spill combineǰ������¼�ı���
	public double dsSpillCombRecsSel;  //profile���������
	
	//merge��combineǰ���¼����
	public double dsMergeCombRecsSel;  //profile���������
	
	
 	public double csSpillPerRecsCost;  //profile���������
	
 	public double csMergeWritePerRecsCost ;  //profile���������
	public double csMergeReadPerRecsCost;  //profile���������
	
	//TimSortһ�λ��ѵ�ʱ��
	public double csTimSortCost;  //profile���������
	
	//��merge��ʱ�򣬶������򻨷ѵ�ʱ��
	public double csQueueSortCost;  //profile���������
	
	//merge������combine��ʱ��
	public double csMergeCombCost;   //profile���������
	
	//��һ����¼���з�����ʱ��
	public double csPartitionCost;   //profile���������
	
	//��spill������combineһ����¼��ʱ��
	public double csSpillCombCost;   //profile���������
		
	//shuffle write��������¼�Ŀ��
	public double dsShuffleWriteInputPairWidth;  //profile���������
	
	//shuffle write����ļ�¼���
	public double dsShuffleWriteOutputPairWidth;  //profile���������
	
	//shuffle write spill��һ��record���ڴ��С
	public long objectSize;
}
