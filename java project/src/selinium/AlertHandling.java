package selinium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {


public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("https:/www.flipkart.com/");
			 //switchto uesd for come to alert window from flipcart 
			 //Alert alert=driver.switchTo().alert();
			 //alert.dismiss();
			 //driver.findElement(By.xpath(""))
			

	}

}
