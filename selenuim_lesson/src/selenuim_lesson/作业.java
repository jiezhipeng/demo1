package selenuim_lesson;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ×÷Òµ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://mail.163.com/";
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
        File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//½ØÍ¼
        try{
        	FileUtils.copyFile(file,new File ("E:/test.jpg"));
        }catch(IOException e){
        	e.printStackTrace();
        }
	}

}
