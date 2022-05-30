package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightBooking {

	public static void main(String[] args) throws InterruptedException  { 
		
		System.setProperty("webdriver.chrome.driver", "D:\\New Folder\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.goibibo.com/");
		 Thread.sleep(2000);
		 
		 //from flight
		 driver.findElement(By.xpath("//div[@class='sc-hiCibw dGZLZw']")).click();
		 WebElement fromcity=driver.findElement(By.xpath("//input[@type='text']"));
		 fromcity.sendKeys("Pune,India");
		 fromcity.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(2000);
		 fromcity.sendKeys(Keys.ENTER);
		 
		 //to flight
		 driver.findElement(By.xpath("//div[@class='sc-hiCibw hIEqKD']")).click();
		 WebElement tocity=driver.findElement(By.xpath("//input[@type='text']"));
		 tocity.sendKeys("Mumbai,India");
		 tocity.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(2000);
		 tocity.sendKeys(Keys.ENTER);
		 
		 //for date
		 driver.findElement(By.xpath("//div[@aria-label='Tue Jun 21 2022']")).click();
		 driver.findElement(By.xpath("//span [@class='fswTrvl__done']")).click();
		 driver.findElement(By.xpath("//a [@class='sc-dtMgUX daltrV']")).click();
		 driver.findElement(By.xpath("//span [@class='sc-fHeRUh jHgPBA']")).click();
		 
		 
		 
	}
	

}
