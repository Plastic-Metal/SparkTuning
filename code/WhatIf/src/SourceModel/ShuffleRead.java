package SourceModel;

/**  
 * @author wenyanqi 
 * 
 */
public class ShuffleRead {
	
	//shuffle read�������Ƿ���mapSideCombine
	public boolean mapSideCombine;
	
	//shuffle read������ byPassMergeSort
	public boolean byPassMergeSort;
	
	public boolean spillEnabled;
	
	//shuffle read�������Ƿ�sort
	public boolean sort;
	
	//shuffle read�׶ε���ʱ��
	public long cShufflereadTime;
	
	//combine���ѵ�ʱ��
	public long cCombPhaseTime;
	
	//spill������sort���ѵ�ʱ��
	public long cSortPhaseTime;
	
	//spill���ѵ�ʱ��
	public long cSpillPhaseTime;
	
	//merge read���ѵ�ʱ��
	public long cMergeReadTime;
	
	//merge sort���ѵ�ʱ��
	public long cMergeSortTime;
	
	//merge combine���ѵ�ʱ��
	public long cMergeCombTime;
	
	//merge read���ѵ�ʱ��
	public long cMergereadTime;
	
	//shuffle read��ȡ���ݵ�ʱ��
	public long cShuffleReadFetchTime;
	
	//shuffle Read��sort���ѵ�ʱ��
	public long cSortTime;
	
	//shuffle read�ı��������ֽ�
	public long dShuffleReadLocalBytes;
	
	//shuffle read��Զ�������ֽ���
	public long dShuffleReadRemoteBytes;
	
	//shuffle read�����е�record��
	public long dShuffleReadRecs;
	
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
	
	//shuffle read�����ֽ���
	public long dShuffleReadBytes;
	
	//shuffle read��spill������һ��records��ռ���ڴ��С
	public long objectSize;

	
}
