package selenuim_lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ื๗าต5 {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
public  void open(){
	String url="http://localhost:8080/Exam_ssh/login.do";
	System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
}
public void login(){
	driver.findElement(By.name("stuNumber")).sendKeys("333");
	driver.findElement(By.name("stuName")).sendKeys("jie");
	driver.findElement(By.name("B1")).click();
}
}
