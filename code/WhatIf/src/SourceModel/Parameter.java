package SourceModel;

public class Parameter {
	
	//spark.reducer.maxSizeInFlight,Ĭ��48M����MΪ��λ
	public static int pMaxSizeInFligh = 48;  //Ŀǰ��������
	
	//spark.shuffle.spill Ĭ��Ϊtrue
	public static boolean pShuffleSpill = true;  //������
	
	//spark.shuffle.compress Ĭ��Ϊtrue
	public static boolean pShuffleCompress = true;  //������
	
	//spark.shuffle.spill.compress Ĭ��Ϊtrue
	public static boolean pShuffleSpillCompress = true;   //�����ԣ����߸ı��������Ҫ����profile
	
	//spark.shuffle.sort.bypassMergeThreshold Ĭ��Ϊ200
	public static int pBypassMergeThreshold = 666;   //����  �൱����ʵֻ������Ч����һ����taskNum��һ���Ǳ�taskNumС
	
	//Spark.io.compression.codec Ĭ��ֵΪsnappy   ���ɱ�
	public static String pCompressionCodec = "snappy";   //����̶�ѹ����ʽ
	
	//spark.shuffle.manager Ĭ��ֵΪsort
	public static String pShuffleManager = "sort";  
	
	//spark.shuffle.memoryFraction Ĭ��Ϊ0.2
	public static double pMemoryFraction = 0.1;  //0.1-0.9
	
	//spark.shuffle.safetyFraction Ĭ��Ϊ0.8
	public static double pSafetyFraction = 0.5;  //0.1-0.9
	
	//spark.serializer Ĭ��Ϊjava���л���ʽ    ���ɱ�
	public static String pSerializer = "java";//����̶����л���ʽ
	
	//spark.file.transferTo Ĭ��Ϊfalse   //���ɱ�
	public static boolean pFileTransferTo = false;  //�ٶ��̶���false
	
	//spark.executor.cores Ĭ��Ϊ1 
	public static int pExecutorCores = 4;  //1-10
	
	//spark.storage.memoryMapThreshold Ĭ��Ϊ2M,��λ��M
	public static long pMemoryMapThreshold = 2;  //û�õ�
	
	//spark.akka.frameSize 10M
	public static double pakkaFrameSize = 10;  //û�õ�
	
	//spark.default.parallelism 
//	public static firstStageTaskNum
	
	//���� ��combine֮ǰ��combine֮���record���һ��
	//���裺mapCombineΪfalseʱ��byPassMergeSortһ��Ϊtrue
	//���裺profile��Ӧ�ó�����һ���ᷢ��spill
	
	//����������+�����ļ��Ĵ�С��������֪
	public static long dReadJarFileSize = 10;
	//����������ļ���С
	public static long dInputBytes = 0;
	//Ĭ�ϵ�executor ��memory������
	public static double executorMemory = 0;

	public static int stageSize = 26;
	
}
