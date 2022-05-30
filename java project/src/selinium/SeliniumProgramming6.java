package selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumProgramming6 {

	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 //1st way to open url
			 //driver.get("https://www.facebook.com/login/");
			 //2nd way to open url
			 String Url="https://www.facebook.com/login/";
			 driver.get(Url);
			 
			 //1st way get title
			 System.out.println(driver.getTitle());
			 //2nd way to get title
			// String Title=driver.getTitle();
			// System.out.println(Title);
			//Printing title & length
			 int Titlelength=driver.getTitle().length();
			 System.out.println("Title of the page is:"+Url);
			 System.out.println("length of the Title is:"+Titlelength);
			 
			 String actualUrl = driver.getCurrentUrl();
			 if(actualUrl.equals(Url)) {
				 System.out.println("varification successful");}
			 else {
			
				 System.out.println("verification not successful");}
			 
			System.out.println("actualUrl:"+Url);
			System.out.println("expectedUrl:"+Url);
			
			String PageSource= driver.getPageSource();
			int pagelength =driver.getPageSource().length();
			System.out.println(pagelength);
			driver.close();
		
		
		
		}
			
			
			
	

			}
			 

	

	
