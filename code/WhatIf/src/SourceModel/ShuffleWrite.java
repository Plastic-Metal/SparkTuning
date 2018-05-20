package SourceModel;

/**  
 * @author wenyanqi 
 * 
 */
public class ShuffleWrite {
	
	//shufflewrite�������Ƿ���mapSideCombine
	public boolean mapSideCombine;
	
	//shufflewrite������ byPassMergeSort
	public boolean byPassMergeSort;
	
	public boolean spillEnabled;
	
	//shuffle write�׶ε���ʱ��
	public long cShuffleWriteTime;
	
	//partition���ѵ�ʱ��
	public long cPartitionPhaseTime;
	
	//combine���ѵ�ʱ��
	public long cCombPhaseTime;
	
	//sort���ѵ�ʱ��
	public long cSortPhaseTime;
	
	//spill���ѵ�ʱ��
	public long cSpillPhaseTime;
	
	//merge read���ѵ�ʱ��
	public long cMergeReadTime;
	
	//merge sort���ѵ�ʱ��
	public long cMergeSortTime;
	
	//merge combine���ѵ�ʱ��
	public long cMergeCombTime;
	
	//merge write���ѵ�ʱ��
	public long cMergeWriteTime;
	
	
	//spill�Ĵ���
	public long dnumsSpills;
	
	//spill֮��ļ�¼��
	public long dSpillRecs;
	
	//ÿ��spill��ȥ�ļ�¼��
	public long dPerSpillRecs;
	
	//spill��buffer�Ĵ�С
	public long dSpillBufferSize;
	
	//spill��ȥ���ļ���С
	public long dSpillFileSize;
	
	//combine֮��ļ�¼��
	public long dCombRecs;
	
	//shuffle write���ܼ�¼��
	public long dShuffleWriteRecs;
	
	//shuffle write�����ֽ���
	public long dShuffleWriteBytes;
	
	//shuffle write��spill������һ��records��ռ���ڴ��С
	public long objectSize;

}
