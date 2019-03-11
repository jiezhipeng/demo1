package selenuim_lesson;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class 周测TestTest {
	WebDriver driver;
@DataProvider
public  Object[][] user(){
	return new Object[][]{
		{"hujianming","hujianming123"},{"hujianmsdfsfing","hujianming123"}
	};
}
  @Test(dataProvider="user")
  public void f(String username,String pwd) throws InterruptedException {
	  String url="http://localhost:8080/examsys";
	  System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(url);
	  driver.findElement(By.name("username")).sendKeys(username);
	  driver.findElement(By.name("userpass")).sendKeys(pwd);
	  WebElement e=driver.findElement(By.name("usertype"));
	  Select select=new Select(e);
	  select.selectByIndex(2);
	  Thread.sleep(8000);
	  driver.findElement(By.className("tm_btn")).click();
	  Thread.sleep(3000);
	  try{
		  Alert alter=driver.switchTo().alert();
		  String jie=(String)driver.switchTo().alert().getText();
		  System.out.println(jie);
		  Assert.assertEquals("用户不存在", jie);
      }catch(Exception a){
    	  System.out.println("登录成功");
		  return;
      }   
	  System.out.println("登录失败");
  }
}
