package selenuim_lesson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.openqa.selenium.io.FileHandler;

public class �ݸ�1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(ou(4,2));
//		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\3.txt"));
//        //�����ļ�3.txt
//		oos.writeObject("123");
//		FileOutputStream out=new FileOutputStream("E:\\5.txt");
//		String str="��ʵ��ʵ��";
//		byte[] b=str.getBytes();
//		for(int i=0;i<b.length;i++){
//       out.write(b[i]);			
//		}
//		FileHandler.copy(new File("E:\\��¼"), new File("E:\\��¼1"));
//        FileHandler.copy(new File("E:\\��¼1"), new File("E:\\��¼2"),"txt");
//        FileHandler.createDir(new File("E:\\��¼3"));//ֻ�ܴ����ļ���     
//        FileHandler.copy(new File("E:\\��¼2\\1.txt"),new File("E:\\��¼3\\2.txt"));
        //copy����¼3ʱ�����Զ�������¼3������createDir������¼3
//        FileHandler.delete(new File("E:\\��¼1"));
//        FileHandler.delete(new File("E:\\��¼2"));
//        FileHandler.delete(new File("E:\\��¼3"));
	}
public static int ou(int a,int b){
	int c=0;
	c=a/b;
	return c;
}
}
