package selenuim_lesson;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenuim_lesson.��ҵ5;//�ڲ���ʹ��ou.driverʱ������
public class ��ҵ5Test {
	��ҵ5 ou=new ��ҵ5();
	@Before
	public void setUp() throws Exception {
     ou.open();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLogin() {
		//fail("Not yet implemented");
		ou.login();
		String ti=ou.driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]/div/span/font/strong")).getText();
		assertEquals("��ӭ�������߿���ϵͳ", ti);
	}
	@Test
	public void testLogin1() {
		//fail("Not yet implemented");
     	ou.login();
		String username=ou.driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/p/span/font")).getText();
		assertEquals("jie",username);
	}
}
