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
//		WebElement ll=driver.findElement(By.linkText("����"));
		WebElement ll=driver.findElement(By.id("kw"));//��ȡidΪkw��Ԫ�أ���λ���ٶ�����򣩸�ֵ��ll
		ll.sendKeys("selenium");//��ll����λ���ٶ������������selenium
		WebElement hh=driver.findElement(By.id("su"));
		hh.click();//���
//		ll.click();//���
//		try{driver.get(url);}
// catch(Exception e){
// 	System.out.println("�Ҳ��������վ:"+e.getMessage());
//	try{driver.get(url);}
//catch(Exception i){
//	System.out.println("=�Ҳ��������վ:"+i.getMessage());
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
