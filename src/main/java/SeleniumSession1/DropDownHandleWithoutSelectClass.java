package SeleniumSession1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelectClass {
	
	 static WebDriver driver;

	public static void main(String[] args) {
		
//		Interview question
//		write a program to select option from drop down menu without using select methods & select class.
		
		 WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
			
			By indusOptions = By.xpath("//select[@id='Form_submitForm_Industry']/option");
			By countryOptions = By.xpath("//select[@id='Form_submitForm_Country']/option");
			
//			Hard coded
//	       List<WebElement> indusList = driver.findElements(indusOptions);
//	       for(WebElement e : indusList) {
//	    	   if(e.getText().equals("Healthcare")) {
//	    		   e.click();
//	    		   break;
//	    	   }
//	       }
			
//			By Method
			doSelectDropDownHandleWithoutSelectClass(indusOptions, "Travel");
			doSelectDropDownHandleWithoutSelectClass(countryOptions, "Cuba");

	}
	public static void doSelectDropDownHandleWithoutSelectClass(By locator,String value) {
		List<WebElement> optionsList = driver.findElements(locator);
	       for(WebElement e : optionsList) {
	    	   if(e.getText().equals(value)) {
	    		   e.click();
	    		   break;
	    	   }
	       }
	}

}
