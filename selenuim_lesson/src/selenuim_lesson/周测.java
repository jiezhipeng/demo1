package selenuim_lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ÷‹≤‚ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url="http://www.baidu.com/";
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"u1\"]/a[7]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__footerULoginBtn\"]")).click();
		Thread.sleep(3000);
	    driver.findElement(By.name("userName")).sendKeys("");
	    Thread.sleep(3000);
	    driver.findElement(By.name("password")).sendKeys("");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__submit\"]")).click();
	}

}
