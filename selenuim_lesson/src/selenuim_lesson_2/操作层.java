package selenuim_lesson_2;
public class 操作层 extends 元素层 {
	
	public void chaozuo() throws InterruptedException{
//	    a.click();
		Thread.sleep(5000);
		b.click();
		Thread.sleep(5000);
		c.click();
		Thread.sleep(5000);
		d.sendKeys("手动阀");
		Thread.sleep(5000);
		e.click();
		Thread.sleep(5000);
		String j=f.getText();
		Thread.sleep(5000);
		System.out.println(j);
	}
}
