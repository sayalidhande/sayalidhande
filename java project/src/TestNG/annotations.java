package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {
	
	//test case 1
	@Test
	public void testcase1() {
		System.out.println("in test case 1");
		}
	
	//test case 2
		@Test
		public void testcase2() {
			System.out.println("in test case 2");
			}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("in beforeMethod");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("in AfterMethod ");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("in beforeClass");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("in AfterClass");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("in AfterTest");
		}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("in BeforeTest");
		}
	@AfterSuite
	public void afterSuite() {
		System.out.println("in AfterSuite");
		}
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite() {
		System.out.println("in BeforeSuite");
		}
}
