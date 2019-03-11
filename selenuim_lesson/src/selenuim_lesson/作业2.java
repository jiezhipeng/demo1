package selenuim_lesson;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ื๗าต2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url="https://www.baidu.com/";
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Boolean login=driver.findElement(By.xpath("//*[@id=\"u1\"]/a[7]")).isDisplayed();
	    if(login==true){
	    	driver.findElement(By.xpath("//*[@id=\"u1\"]/a[7]")).click();
	    	Thread.sleep(3000);
//	    	driver.switchTo().alert(); 
	    	String dl=driver.getWindowHandle();
	    	driver.switchTo().window(dl);
	    	driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__footerULoginBtn\"]")).click();
	    	WebElement username=driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__userName\"]"));
	    	username.click();
	    	Thread.sleep(3000);
	    	username.sendKeys("13979119630");
	    	WebElement pwd=driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__password\"]"));
	    	pwd.click();
	    	Thread.sleep(3000);
	    	pwd.sendKeys("021jie333");
	    	driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__submit\"]")).click();
	    	Set<Cookie> w=driver.manage().getCookies();
	    	System.out.println(w);
	    	for(Cookie l:w){
	    		System.out.println(l.getName());
	    		System.out.println(l.getValue());
	    	}
	    }
	    else{
	    	Set<Cookie> s=driver.manage().getCookies();
	    	System.out.println(s);
	    }
	}

}
