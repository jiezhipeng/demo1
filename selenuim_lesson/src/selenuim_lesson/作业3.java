package selenuim_lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class 作业3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url="file:///E:/测试/day2/selenium_html/demo1.html";
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		WebElement user=driver.findElement(By.id("user"));
		user.click();
		Thread.sleep(3000);
		user.sendKeys("意气风发");
		Thread.sleep(3000);
		driver.findElement(By.className("baidu")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.name("select")).click();
		driver.findElement(By.xpath("//*[@id=\"select\"]/select/option[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"radio\"]/input[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"checkbox\"]/input[4]")).click();
		Thread.sleep(3000);
		Boolean submit=driver.findElement(By.className("button")).isEnabled(); 
		if(submit==true){
			driver.findElement(By.className("button")).click();
		}
		driver.findElement(By.className("alert")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.id("load")).sendKeys("E:\\c1.png");
		Thread.sleep(3000);
		String window=driver.getWindowHandle();
		driver.findElement(By.className("open")).click();
		Thread.sleep(3000);
		driver.switchTo().window(window);
		Thread.sleep(3000);
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.className("over"))).perform(); 
		Thread.sleep(3000);
		driver.findElement(By.className("wait")).click();
		Thread.sleep(3000);
	}

}
