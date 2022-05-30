package keyword;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowOpen {

	
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/browser-windows");
			driver.manage().window().maximize();

			driver.findElement(By.id("tabButton")).click();
			driver.findElement(By.id("windowButton")).click();
			driver.findElement(By.id("messageWindowButton")).click();
			
			String mainwindowHandle= driver.getWindowHandle();
			Set<String> allWindowHandles = driver.getWindowHandles();
			Iterator<String> itr = allWindowHandles.iterator();
			
			while (itr.hasNext()) 
			{
				String childWindow = itr.next();
				if (!mainwindowHandle.equalsIgnoreCase(childWindow)) 
					{
				
					driver.switchTo().window(childWindow);
					WebElement text = driver.findElement(By.id("sampleHeading"));
					WebElement text2 = driver.findElement(By.id("sampleHeading"));
					
					System.out.println("Heading of childwindowis" + text.getText());
					System.out.println("Heading of childwindowis" + text2.getText());
					
					
			driver.quit();

	}

			}}}
