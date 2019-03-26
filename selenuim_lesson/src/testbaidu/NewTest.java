package testbaidu;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	public WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://www.baidu.com");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver",".//Tools//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.findElement(By.id("kw")).sendKeys("selenium");
	  driver.findElement(By.id("su")).click();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
