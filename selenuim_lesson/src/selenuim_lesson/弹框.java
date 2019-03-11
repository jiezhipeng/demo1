package selenuim_lesson;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class 弹框 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url="file:///E:/专业课笔记/表单.html";
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		WebElement hh=driver.findElement(By.xpath("//*[@id=\"cate_item_2\"]/a"));
		Select s=new Select(hh);
		s.selectByIndex(0);
//		driver.switchTo().defaultContent();//退出iframe（回到默认页）
//		driver.switchTo().frame("frame");//进入iframe框架
//		WebElement hh=driver.findElement(By.id("input1"));
//		hh.sendKeys("sdfadfsd");
//		Alert prompt=driver.switchTo().alert();
//		prompt.sendKeys("sdfadfsd");
//		String jie=prompt.getText();
//		Thread.sleep(2000);
//		prompt.accept();
//		System.out.println(jie);
//		WebElement hh=driver.findElement(By.id("confirm"));
//		hh.click();
//		Thread.sleep(3000);
//		Alert alter=driver.switchTo().alert();
//		alter.accept();
	}

}
