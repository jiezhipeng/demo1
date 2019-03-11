package selenuim_lesson;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class 多窗口 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
String url="https://www.sina.com.cn/";
System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get(url);
//Set<Cookie> s=driver.manage().getCookies();//缓存
//System.out.println(s);
String ds=driver.getWindowHandle();
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/div[10]/div[1]/div[1]/ul[1]/li[1]/a/b")).click();
Set<String> handle=driver.getWindowHandles();//把所有的窗口句柄赋给一个集合
for(String h:handle){//增强for循环
	if(h.equals(ds)){
   continue;
	}
	else{
		driver.switchTo().window(ds);//跳转到当前页面
		driver.findElement(By.xpath("/html/body/div[9]/div/div[1]/form/div[1]/h3")).click();
		driver.findElement(By.xpath("/html/body/div[9]/div/div[1]/form/div[1]/div[2]/ul/li[2]")).click();
driver.findElement(By.name("SerchKey")).click();
Thread.sleep(3000);
driver.findElement(By.name("SerchKey")).sendKeys("王者荣耀");
driver.findElement(By.name("SearchSubButton")).click();
		break;
	}
}
	}
}
