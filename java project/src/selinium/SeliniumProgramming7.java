package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumProgramming7 {


		
public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://www.facebook.com/");
			 
			 driver.findElement(By.linkText("Create New Account")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.name("firstname")).sendKeys("Avantika");
			 driver.findElement(By.name("lastname")).sendKeys("Rathod");
			 driver.findElement(By.name("reg_email__")).sendKeys("dhandesayali123@gmail.com");
			 driver.findElement(By.name("reg_passwd__")).sendKeys("sonalika@123");
			 //Gender is a radio button 1st way of select  
			 //driver.findElement(By.xpath("//input[@value=\"1\"]")).click();
			 //2nd way
			 List<WebElement>radio=driver.findElements(By.xpath("//input[@class=\"_8esa\"]"));
			 System.out.println("total no of radio buttons:"+radio.size());
			 //List<WebElement>radio1=driver.findElements(By.xpath(""))
			 
}
}