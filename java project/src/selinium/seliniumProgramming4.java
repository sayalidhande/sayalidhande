package selinium;
import org.openqa.selenium.By;
//For practice:
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seliniumProgramming4 {



	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rediff.com/");
		 driver.findElement(By.linkText("Enterprise Email")).click();
		 driver.findElement(By.partialLinkText("vid")).click();

}
}
