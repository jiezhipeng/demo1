package selenuim_lesson_2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ·Ö²ã {
	 WebDriver driver;
	
	public  void open() {
		// TODO Auto-generated method stub
String url="https://www.sina.com.cn/";
System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
driver=new ChromeDriver();
driver.get(url);
	}

}
