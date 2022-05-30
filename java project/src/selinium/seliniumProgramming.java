package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seliniumProgramming {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/login/");
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Sign up for Facebook")).click();
		 
		 /*driver.findElement(By.id("email")).sendKeys("dhandesayali123@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("silisonu");
		 //driver.findElement(By.linkText("Log In")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Sign up for Facebook")).click();
		 
		 //driver.findElement(By.name("firstname")).click();
		 driver.findElement(By.name("firstname")).sendKeys("anjalina");
		 driver.findElement(By.name("lastname")).sendKeys("shirbhate");
		 driver.findElement(By.name("reg_email__")).sendKeys("dhandesayali321@gmail.com");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("anjali@123");
		 //driver.findElement(By.name("birthday_day")).sendKeys("1");
		 //driver.findElement(By.name("birthday_month")).sendKeys("December");
		 //driver.findElement(By.name("birthday_year")).sendKeys("1993");
		 
		 //1st way of radio button by xpath(perfect select match value)
		// driver.findElement(By.xpath("//input[@value=1]")).click();
		 //driver.findElement(By.xpath("//input[@value=2]")).click();
		 //driver.findElement(By.xpath("//input[@value=-1]")).click();*/
		 
		 //2nd way radio button
		 List<WebElement> radio=driver.findElements(By.xpath("//input[@class='_8esa']"));
		 System.out.println("Total radio buttons:" +radio.size());
		 //radio.get(0).click();
		 //System.out.println(radio.get(0).isDisplayed());
		 //System.out.println(radio.get(0).isEnabled());
		 //System.out.println(radio.get(0).isSelected());
		 Thread.sleep(4000);
		 List<WebElement> radio1=driver.findElements(By.xpath("//label[(@class='_58mt')]"));
		 System.out.println(radio1.size());
		 String ExpectedResult = "Female";
		 for(int i=0;i<radio1.size();i++) {
			 if(radio1.get(i).getText().equalsIgnoreCase(ExpectedResult)) {
				 radio1.get(0).click();
				 System.out.println(ExpectedResult+"clicked");
				 break;
			 }
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 //Thread.sleep(2000);
		 //driver.close();
		

	}

}
