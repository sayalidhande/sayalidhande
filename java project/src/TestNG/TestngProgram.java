package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngProgram {
	
	public class TestNG {		
		WebDriver driver;
	    // Saving the expected title of the Webpage
	    String title = "ToolsQA - Demo Website For Automation";
	    
	   
	    @Test
	    public void starting_point(){
	    	System.out.println("This is the starting point of the test");
	    	//Initialize Chrome Driver
	    	//driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
	    	 driver = new ChromeDriver();
	    	 driver.get("https://demoqa.com/");
	    }
	
	
	
	@Test(groups = {"demo"})
	public void checkTitle()  {
		String testTitle="Free QA automation tool for everyone";
		String originalTitle =driver.getTitle();
		Assert.assertEquals(originalTitle, testTitle);
		
	}
	@Test(groups = { "demo" })	
    public void click_element() {	
       driver.findElement(By.xpath("//h5[contains(text(),'Elements')]")).click();
        System.out.println("Home Page heading is displayed");	
    }
	}
}

