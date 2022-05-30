package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://money.rediff.com/gainers");
		 
		 List<WebElement> allcompanies =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		 System.out.println("All companies:"+allcompanies.size());
		 
		 List<WebElement> totalcurrentprice= driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		 System.out.println("Total current price:"+totalcurrentprice.size());
		 
		 String expectedcompany="NDA Securities";
		 for(int i=0;i<=allcompanies.size();i++) {
			 if(allcompanies.get(i).getText().equalsIgnoreCase(expectedcompany)) {
				 System.out.println(allcompanies.get(i).getText()+":"+totalcurrentprice);
				 allcompanies.get(i).click();
				 break;
			 }
		 
	}
	}}

