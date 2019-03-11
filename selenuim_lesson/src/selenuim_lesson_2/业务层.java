package selenuim_lesson_2;
public class 业务层  extends 操作层{
	static 操作层  chaozuo=new 操作层();
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//打开浏览器
		new 分层().open();
		//获取元素
		new 元素层().find();
		//操作
		Thread.sleep(3000);
	   chaozuo.chaozuo();
}
}
