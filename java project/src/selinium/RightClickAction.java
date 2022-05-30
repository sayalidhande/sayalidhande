package selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {

		
			
			System.setProperty("webdriver.chrome.driver", "D:\\New Folder\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://demoqa.com/buttons");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			 Actions action =new  Actions(driver) ;
			
			 WebElement Button = driver.findElement(By.id("rightClickBtn"));
			 action.contextClick(Button).perform();
			 System.out.println("right click action done");
			 Thread.sleep(20);
			 
			 WebElement Button1 = driver.findElement(By.id("doubleClickBtn"));
			 action.contextClick(Button1).perform();
			 System.out.println("Double click action done");
			 
			 
			 
			 
			 
			 

	}

}
