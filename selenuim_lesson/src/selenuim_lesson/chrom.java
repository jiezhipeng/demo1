package selenuim_lesson;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://www.v2ex.com/";
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
//		WebElement ll=driver.findElement(By.id("kw"));//��ȡidΪkw��Ԫ�أ���λ���ٶ�����򣩸�ֵ��ll
//		ll.sendKeys("selenium");//��ll����λ���ٶ������������selenium
//		WebElement hh=driver.findElement(By.xpath("//*[@id="SecondaryTabs"]/a[1]"));
//		hh.sendKeys("selenium");
//		WebElement ww=driver.findElement(By.id("su"));
//		ww.click();//���
		WebElement hh=driver.findElement(By.xpath("//*[@id=\"SecondaryTabs\"]/a[1]"));
		hh.click();
		List<WebElement> elements1=driver.findElements(By.className("page_normal"));
		String af=elements1.get(3).getText();
		if(af.equals("5")){
		elements1.get(3).click();
		List<WebElement> elements2=driver.findElements(By.className("count_livid"));
		String la=elements2.get(1).getText();
		System.out.println(la);
		}
		else{
			System.out.println("δ�ҵ���");
		}

	}

}
