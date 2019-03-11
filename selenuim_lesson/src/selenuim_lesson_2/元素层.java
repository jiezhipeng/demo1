package selenuim_lesson_2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ÔªËØ²ã extends ·Ö²ã {
//	  WebElement a;
	  WebElement b;
	  WebElement c;
	  WebElement d;
	  WebElement e;
	  WebElement f;
	 public  void find() throws InterruptedException {
			// TODO Auto-generated method stub
//		 a=driver.findElement(By.className("mnav"));
		 Thread.sleep(5000);
		 b=driver.findElement(By.xpath("/html/body/div[7]/div/div[1]/form/div[1]/h3"));
		 Thread.sleep(5000);
		 c=driver.findElement(By.xpath("/html/body/div[7]/div/div[1]/form/div[1]/div[2]/ul/li[5]"));
		 Thread.sleep(5000);
		 d=driver.findElement(By.xpath("/html/body/div[8]/div/div[1]/form/div[3]/input"));
		 Thread.sleep(5000);
		 e=driver.findElement(By.xpath("/html/body/div[8]/div/div[1]/form/input"));
		 Thread.sleep(5000);
		 f=driver.findElement(By.xpath("//*[@id=\"wrap\"]/div/div[1]/div[1]"));
	}

}
