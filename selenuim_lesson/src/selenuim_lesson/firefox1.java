package selenuim_lesson;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://www.baidu.com/";
		System.setProperty("webdriver.firfox.bin","E:\\firefox\\firefox.exe");
//		System.setProperty("webdriver.chrome.driver",".\\drivers\\chrome.exe");
		WebDriver driver=new FirefoxDriver();
//		WebDriver driver=new ChromeDriver();
		driver.get(url);
//		WebElement ll=driver.findElement(By.linkText("新闻"));
		WebElement ll=driver.findElement(By.id("kw"));//获取id为kw的元素（定位到百度输入框）赋值给ll
		ll.sendKeys("selenium");//在ll（定位到百度输入框）中输入selenium
		WebElement hh=driver.findElement(By.id("su"));
		hh.click();//点击
//		ll.click();//点击
//		try{driver.get(url);}
// catch(Exception e){
// 	System.out.println("找不到这个网站:"+e.getMessage());
//	try{driver.get(url);}
//catch(Exception i){
//	System.out.println("=找不到这个网站:"+i.getMessage());
//}
// }
//		finally{
//		String jie=driver.getCurrentUrl();
//      if(jie.equals(url)){
//     	 System.out.println(driver.getTitle());
//      }
//		}
	}
}
