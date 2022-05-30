package TestNG;

import org.testng.annotations.Test;

public class TestGroup {
	@Test(groups= {"demo"})
	public void a() {
		System.out.println("in Mtd a");
	}
	
	@Test(groups= {"Non-Functional"})
	public void b() {
		System.out.println("in Mtd b");
	}
	
	@Test(groups= {"Functional"})
	public void c() {
		System.out.println("in Mtd c");
	}
	@Test(groups= {"Non-Functional"})
	public void d() {
		System.out.println("in Mtd d");
	}
}
