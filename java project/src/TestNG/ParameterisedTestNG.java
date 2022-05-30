package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterisedTestNG {
	
	@Test
	@Parameters("myName") 
	public void parameterTest(String myName){
		System.out.println("Parameterised value is:");
		
	}
	
}
