package selinium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 
			 driver.get("https://www.facebook.com/");
			
			 List<WebElement> totallinks=driver.findElements(By.tagName("a"));
			 System.out.println("Totallinks on page:"+totallinks.size());
			 driver.close();
			 

		}



	}


