package selenuim_lesson;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class ÷‹≤‚Test {
	static int i=1;
	WebDriver driver;
	@DataProvider
	public Object[][] user(){
		return new Object[][]{
		{"asdf","asdfsd"},{"sdajfksjda","4sd56f4asd564"}
		};
		
	}
  @Test(dataProvider="user")
  public void f(String username,String pwd) throws InterruptedException {
		String url="http://www.baidu.com/";
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"u1\"]/a[7]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__footerULoginBtn\"]")).click();
	    driver.findElement(By.name("userName")).sendKeys(username);
	    Thread.sleep(3000);
	    driver.findElement(By.name("password")).sendKeys(pwd);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__submit\"]")).click();
	    Boolean cw=driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__error\"]")).isDisplayed();
	    if(cw==true){
	    	Thread.sleep(3000);
	        File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//ΩÿÕº
	        try{
	        	FileUtils.copyFile(file,new File ("E:/test"+i+".jpg"));
	        	i++;
	        }catch(IOException o){
	        	o.printStackTrace();
	        }       
	       String flase=driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__error\"]")).getText();
	       System.out.println(flase);
	    }
  }

}
