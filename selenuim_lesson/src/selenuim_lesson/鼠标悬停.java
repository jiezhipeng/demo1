package selenuim_lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class 鼠标悬停 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="file:///E:/测试/day2/selenium_html/dragAndDrop.html";
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		WebElement element =driver.findElement(By.xpath("//*[@id=\"drag\"]"));
		WebElement target = driver.findElement(By.xpath("/html/body/h1"));
		for(int i=100;i>0;i--){
		(new Actions(driver)).dragAndDropBy(element,0,0).build().perform();//鼠标悬停，箭头跟随移动鼠标
		}
	}

}
