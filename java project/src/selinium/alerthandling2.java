package selinium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerthandling2 {


		
public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			 //sign in is not link thats why not taken here link text
			 driver.findElement(By.name("proceed")).click();
			 Alert alert=driver.switchTo().alert();
			 //alert.accept();
			 System.out.println(alert.getText());
			 driver.close();
	}

}
