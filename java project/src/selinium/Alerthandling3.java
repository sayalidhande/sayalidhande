package selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling3 {

public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

	}

}
