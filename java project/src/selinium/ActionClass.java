package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionClass {

	
		public static void main(String[] args) throws InterruptedException  {
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("http://mrbool.com/"); 
			 Thread.sleep(2000);
			 
WebElement CONTENT= driver.findElement(By.xpath("//a[@class='menulink']")).click();
Actions action=new Actions(driver);
moveToElement


	}

}
