package selenuim_lesson_2;
public class ������ extends Ԫ�ز� {
	
	public void chaozuo() throws InterruptedException{
//	    a.click();
		Thread.sleep(5000);
		b.click();
		Thread.sleep(5000);
		c.click();
		Thread.sleep(5000);
		d.sendKeys("�ֶ���");
		Thread.sleep(5000);
		e.click();
		Thread.sleep(5000);
		String j=f.getText();
		Thread.sleep(5000);
		System.out.println(j);
	}
}
