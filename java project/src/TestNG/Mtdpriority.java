package TestNG;

import org.testng.annotations.Test;
//display mtds always in alphabetical order & passed cases randomly.
//@Test is called test cases
//no priority 1st display after display priority mtd
public class Mtdpriority {
	@Test(priority=2)
	public void a() {
		System.out.println("I am in a mtd");
	}
	@Test 
	public void b() {
		System.out.println("I am in b mtd");
	}
	@Test
	public void c() {
		System.out.println("I am in c mtd");
	}
	@Test (priority=1)
	public void d() {
		System.out.println("I am in d mtd");
	}
	

}
