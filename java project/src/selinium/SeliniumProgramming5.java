package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumProgramming5 {

	
public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://in.pinterest.com/login/");
			 driver.findElement(By.xpath("//input[@class=\"V86 Hsu tBJ dyH iFc sAJ L4E unP iyn Pve pBj qJc aKM LJB xD4 z-6\"]")).sendKeys("dhandesayali123@gmail.com");
			 driver.findElement(By.xpath("//*[contains(@id,'password')]")).sendKeys("password");

	}

}
