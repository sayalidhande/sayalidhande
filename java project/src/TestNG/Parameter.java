package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
@Test
@Parameters({"val1","val2"})
public void Sum(int v1,int v2) {
	int finalSum=v1+v2;
	System.out.println("the final sum of the given values is"+finalSum);
}
}
