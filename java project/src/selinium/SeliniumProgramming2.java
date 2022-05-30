package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumProgramming2 {


		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://www.rediff.com/");
			 driver.findElement(By.linkText("Rediffmail")).click();
			 driver.findElement(By.partialLinkText("mon")).click();
			 
			 

			 

	}

}
