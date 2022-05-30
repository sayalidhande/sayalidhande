package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumProgramming3 {

	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://www.facebook.com/login/");
			 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dhandesayali123@gmail.com");
			// driver.findElement(By.xpath("//*[contains(@type,'password')]")).sendKeys("sayali@123");
			 driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("sayali@123");

	}

}
