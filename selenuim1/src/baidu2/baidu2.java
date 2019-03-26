package baidu2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baidu2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver",".//Tools//chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://www.baidu.com");
		  Thread.sleep(3000);
		  driver.findElement(By.id("kw")).sendKeys("selenium");
		  Thread.sleep(3000);
		  driver.findElement(By.id("su")).click();
	}

}
