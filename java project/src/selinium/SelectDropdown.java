package selinium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SelectDropdown {


public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://www.facebook.com/");
			 
			 driver.findElement(By.linkText("Create New Account")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.name("firstname")).sendKeys("Avantika");
			 driver.findElement(By.name("lastname")).sendKeys("Rathod");
			 driver.findElement(By.name("reg_email__")).sendKeys("dhandesayali123@gmail.com");
			 driver.findElement(By.name("reg_passwd__")).sendKeys("sonalika@123");
			 //driver.findElement(By.xpath("//select[@name='birthday_day']")).click();
			
			 
			 WebElement birthday=driver.findElement(By.xpath("//select[@name='birthday_day']"));
			 Select select=new Select(birthday);
			 select.selectByIndex(0);
			 //select.selectByVisibleText("1");
			 //select.selectByValue("1");
			
			// System.out.println( select.getFirstSelectedOption().getText());
			 
			 WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
			 Select select1=new Select(month);
			 select1.selectByIndex(11);
			 System.out.println(select.getFirstSelectedOption().getText());
			
			 
			 WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
			 Select select2=new Select(year);
			 select2.selectByValue("1993");
			 
			 List<WebElement>dropdown=select1.getOptions();
			 System.out.println(dropdown.size());
			 for(int i=0;i<dropdown.size();i++) {
				 String dropdownValues=dropdown.get(i).getText();
				 if(dropdownValues.equalsIgnoreCase("Dec")) {
					 dropdown.get(i).click();
				 }
			 }
			 
			 
			 
			 
			 
			 
	}

}
