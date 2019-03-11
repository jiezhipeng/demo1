package selenuim_lesson;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ≤›∏Â3Test {
	@DataProvider
	public Object[][] user(){
		return new Object[][]{
		{"zhangtao","12"},{"lishi","22"}
		};
		
	}
//  @Parameters("test")
//  @Test
//  public void f(String test) {
//	  int a=0;
//	  Assert.assertEquals(5, a);
//	  test="123";
//	  System.out.println(test);
//  }
//  @Test(dependsOnMethods="f")//f1“¿¿µ”⁄f
//  public void f1() {
//	  System.out.println("test1");
//  }
  @Test(dataProvider="user")
  public void f2(String name,String age) {
	  System.out.println(name+" "+age);
  }
//  @BeforeMethod
//  public void beforeMethod() {
//	  System.out.println("2");
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//	  System.out.println("3");
//  }

//  @BeforeClass
//  public void beforeClass() {
//	  System.out.println("4");
//  }
//
//  @AfterClass
//  public void afterClass() {
//	  System.out.println("5");
//  }
//
//  @BeforeTest
//  public void beforeTest() {
//	  System.out.println("6");
//  }
//
//  @AfterTest
//  public void afterTest() {
//	  System.out.println("7");
//  }
//
//  @BeforeSuite
//  public void beforeSuite() {
//	  System.out.println("8");
//  }
//
//  @AfterSuite
//  public void afterSuite() {
//	  System.out.println("9");
//  }

}
