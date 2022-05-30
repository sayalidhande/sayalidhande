package selinium;
//navigation
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumProgramming8 {

	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://www.facebook.com/login/");
			 driver.navigate().to("https://in.pinterest.com/login/");
			 driver.navigate().back();
			 driver.navigate().forward();
			 driver.navigate().refresh();
			 driver.quit();
	}

}
