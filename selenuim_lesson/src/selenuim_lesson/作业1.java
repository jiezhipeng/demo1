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
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class 作业1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url="https://www.cnblogs.com/";
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"cate_item_2\"]/a"))).perform();
		WebElement hh=driver.findElement(By.xpath("//*[@id=\"cate_content_block_2\"]/div[2]/ul/li[1]/a"));
		hh.click();
		WebElement ww=driver.findElement(By.xpath("//*[@id=\"zzk_q\"]"));
		ww.sendKeys("java");
		WebElement rr=driver.findElement(By.xpath("//*[@id=\"search_block\"]/div[1]/input[2]"));
		rr.click();
		Thread.sleep(10000);
		try{Boolean lala=driver.findElement(By.xpath("//*[@id=\"searchResult\"]/div[2]/div[1]/h3/a")).isDisplayed();
		Assert.assertTrue(lala,"出现了");}
		catch(Exception e){
	        File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//截图
	        try{
	        	FileUtils.copyFile(file,new File ("E:/test.jpg"));
	        }catch(IOException o){
	        	o.printStackTrace();
	        }
    		driver.navigate().back();
    		WebElement title=driver.findElement(By.xpath("//*[@id=\"post_list\"]/div[1]/div[2]/h3/a"));
    		String jie=title.getText();
    		System.out.println(jie);
			return;//报错后后面的代码都不执行
		}

		Boolean lala=driver.findElement(By.xpath("//*[@id=\"searchResult\"]/div[2]/div[1]/h3/a")).isDisplayed();
		Assert.assertTrue(lala,"出现了");
		if(lala==true){
		WebElement number=driver.findElement(By.xpath("//*[@id=\"searchInfo\"]/span[2]"));
		String zhi=number.getText();
		System.out.println(zhi);
		}
		driver.navigate().back();
		WebElement title=driver.findElement(By.xpath("//*[@id=\"post_list\"]/div[1]/div[2]/h3/a"));
		String jie=title.getText();
		System.out.println(jie);
	}

}
