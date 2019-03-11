package selenuim_lesson;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

public class ²Ý¸å2Test {
	static ²Ý¸å2 ou=new ²Ý¸å2();
	@BeforeClass
	public static void setUp() throws Exception {
		ou.open();
	}
    
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		ou.add();
		String title=ou.driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table/tbody/tr[4]/td[1]")).getText();
		assertEquals("cs3", title);
	}
	@Test
	public void testAdd1() {
		//fail("Not yet implemented");
        String type=ou.driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table/tbody/tr[4]/td[3]/div")).getText();
        assertEquals("dsds", type);
	}
}
