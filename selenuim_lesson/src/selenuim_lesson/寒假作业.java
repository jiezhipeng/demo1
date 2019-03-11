package selenuim_lesson;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class 寒假作业 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url="http://flight.qunar.com";
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("searchTypeSng")).click();
		driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[1]/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[1]/div/div[2]/div/div[2]/div[2]/dl/dd/ul/li[13]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[2]/div/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/dl[1]/dd/ul/li[25]/a")).click();
		Thread.sleep(3000);
		WebElement j=driver.findElement(By.name("fromDate"));
		Thread.sleep(3000);
		j.clear();
		Thread.sleep(3000);
		j.sendKeys(getDateAfterToday(7));

		driver.findElement(By.className("btn_search")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);


		 
		driver.findElement(By.xpath("(//div[@class='avt_trans']//p[contains(text(),'每段航班均需缴纳税费')]/ancestor::div//div[@class='a_booking']/a)[3]")).click();
	    driver.findElement(By.xpath("//div[@id='flightbarXI883']//div[@class='t_bk']/a")).click();
				

	}

	public static String getDateAfterToday(int dateAfterToday) {
		Calendar jie = Calendar.getInstance();
		jie.add(Calendar.DATE, +dateAfterToday);
		Date date = jie.getTime();
		SimpleDateFormat z = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(z.format(date));
		return z.format(date);
		}
			}
