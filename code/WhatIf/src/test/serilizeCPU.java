package test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
public class serilizeCPU implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String name="SheepMu";
    private int age=24;
    
    
    public static void main(String[] args)
    {//���´���ʵ�����л�
        try
        {
        	
        	long startTime = System.currentTimeMillis();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\a.txt"));//�����������ļ���Ϊ my.out ��ObjectOutputStream�ܰ�Object�����Byte��
           
            serilizeCPU myTest=new serilizeCPU();
            oos.writeObject(myTest); 
            oos.flush();  //������ 
            System.out.println(System.currentTimeMillis() - startTime);
            oos.close(); //�ر���
            
        } catch (FileNotFoundException e) 
        {        
            e.printStackTrace();
        } catch (IOException e) 
        {
            e.printStackTrace();
        } 
      //  fan();//���������  �����л�  ����
    }
    
    public static void fan()//�����еĹ���
    {    
         ObjectInputStream oin = null;//�ֲ���������Ҫ��ʼ��
        try
        {
            oin = new ObjectInputStream(new FileInputStream("my.out"));
        } catch (FileNotFoundException e1)
        {        
            e1.printStackTrace();
        } catch (IOException e1)
        {
            e1.printStackTrace();
        }      
        serilizeCPU mts = null;
        try {
            mts = (serilizeCPU ) oin.readObject();//��Object��������ת��ΪMyTest����
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }     
         System.out.println("name="+mts.name);    
         System.out.println("age="+mts.age);    
    }
}