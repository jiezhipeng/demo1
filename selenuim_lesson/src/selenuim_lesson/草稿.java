package selenuim_lesson;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class �ݸ� {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
String url="http://www.baidu.com/";
System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get(url);
File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//��ͼ
try{
	FileUtils.copyFile(file,new File ("E:/test.jpg"));
}catch(IOException o){
	o.printStackTrace();
}
//WebElement element =driver.findElement(By.xpath("//*[@id=\"drag\"]"));
//WebElement target = driver.findElement(By.xpath("/html/body/h1"));
//for(int i=100;i>0;i--){
//(new Actions(driver)).dragAndDropBy(element,0,0).build().perform();//�����ͣ����ͷ�����ƶ����
//}
//Set<Cookie> s=driver.manage().getCookies();
//System.out.println(s);
//WebElement fdd=driver.findElement(By.name("q"));
//Actions fd=new Actions(driver);
//fd.contextClick(fdd).perform();
//fd.doubleClick(fdd).perform();
//String ds=driver.getWindowHandle();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[10]/div[1]/div[1]/ul[1]/li[1]/a/b")).click();
//Set<String> handle=driver.getWindowHandles();//�����еĴ��ھ������һ������
//for(String h:handle){//��ǿforѭ��
//	if(h.equals(ds)){
//   continue;
//	}
//	else{
//		driver.switchTo().window(ds);//��ת����ǰҳ��
//		driver.findElement(By.xpath("/html/body/div[9]/div/div[1]/form/div[1]/h3")).click();
//		driver.findElement(By.xpath("/html/body/div[9]/div/div[1]/form/div[1]/div[2]/ul/li[2]")).click();
//driver.findElement(By.name("SerchKey")).click();
//Thread.sleep(3000);
//driver.findElement(By.name("SerchKey")).sendKeys("������ҫ");
//driver.findElement(By.name("SearchSubButton")).click();
//		break;
//	}
//}
	}

}
