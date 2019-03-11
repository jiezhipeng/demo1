package selenuim_lesson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.openqa.selenium.io.FileHandler;

public class 草稿1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(ou(4,2));
//		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\3.txt"));
//        //创建文件3.txt
//		oos.writeObject("123");
//		FileOutputStream out=new FileOutputStream("E:\\5.txt");
//		String str="啊实打实的";
//		byte[] b=str.getBytes();
//		for(int i=0;i<b.length;i++){
//       out.write(b[i]);			
//		}
//		FileHandler.copy(new File("E:\\记录"), new File("E:\\记录1"));
//        FileHandler.copy(new File("E:\\记录1"), new File("E:\\记录2"),"txt");
//        FileHandler.createDir(new File("E:\\记录3"));//只能创建文件夹     
//        FileHandler.copy(new File("E:\\记录2\\1.txt"),new File("E:\\记录3\\2.txt"));
        //copy到记录3时不会自动创建记录3所以用createDir创建记录3
//        FileHandler.delete(new File("E:\\记录1"));
//        FileHandler.delete(new File("E:\\记录2"));
//        FileHandler.delete(new File("E:\\记录3"));
	}
public static int ou(int a,int b){
	int c=0;
	c=a/b;
	return c;
}
}
