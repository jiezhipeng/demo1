package selenuim_lesson;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ื๗าต4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url="http://www.taobao.com/";
		System.setProperty("webdriver.firfox.bin","E:\\firefox\\firefox.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(url);
		String hand=driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[2]/div[1]/a[1]")).click();
		Set<String> window=driver.getWindowHandles();
		for(String h:window){
		if(h.equals(hand)){
			continue;
		}
		else{
			driver.switchTo().window(h);
			Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"J_QRCodeLogin\"]/div[5]/a[1]")).click();
            Thread.sleep(3000);
            driver.findElement(By.name("TPL_username")).sendKeys("1111111");
            Thread.sleep(3000);
            driver.findElement(By.name("TPL_password")).sendKeys("2222222");
            Thread.sleep(3000);
            WebElement qidian=driver.findElement(By.id("nc_1_n1z"));
            Thread.sleep(3000);
            (new Actions(driver)).dragAndDropBy(qidian,300,300).build().perform();
            Thread.sleep(3000);
            driver.findElement(By.id("J_SubmitStatic")).click();
			break;
		}
		}
	}

}
