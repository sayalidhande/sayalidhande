package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://formstone.it/");
			 Thread.sleep(2000);
			 driver.findElement(By.linkText("Checkbox")).click();
			// driver.findElement(By.xpath("//label[@for='checkbox-1']")).click();
			 driver.findElement(By.xpath("//label[@for='checkbox-2']")).click();
			
			 driver.close();
			 


	}

}
