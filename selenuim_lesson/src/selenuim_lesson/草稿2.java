package selenuim_lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ≤›∏Â2 {
    static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public  void open(){
		String url="http://localhost:8080/Exam_ssh/admin.do";
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("name")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.name("B1")).click();
	}
	public void add(){
		driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[1]")).click();
		driver.findElement(By.id("testName")).sendKeys("dsds");
		driver.findElement(By.id("testTime")).sendKeys("100∑÷÷”");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.id("title")).sendKeys("cs3");
		driver.findElement(By.id("choices")).sendKeys("ABCD");
		driver.findElement(By.id("standardAnswer")).sendKeys("A");
		driver.findElement(By.name("submit")).click();
	}
}
