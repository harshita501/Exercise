package SeleniumSession1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptionsHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry = By.id("Form_submitForm_Industry");
//    	By country = By.id("Form_submitForm_Country");
		
		//Hard coded
//		don't use this line we can directly use while creating the Select class object(check line no. 30)
//		WebElement element_industry = driver.findElement(industry);
//		WebElement element_country = driver.findElement(country);
//		Select select_indus = new Select(driver.findElement(industry));
//		List<WebElement> indusOptions = select_indus.getOptions();
//		System.out.println(indusOptions.size());
//		for(WebElement e : indusOptions) {
//			System.out.println(e.getText());
//		}
    	
//		By method
		List<String> indusList= getDropDownOptionList(industry);
		System.out.println(indusList.contains("Electronics"));
	
	}
	
//	WAF to get the list of drop down values(text):
//	param : By locator
//	return : List<String>
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<String> getDropDownOptionList(By locator) {
		Select select = new Select(getElement(locator));
		List<String> optionTextList = new ArrayList<String>();
		List<WebElement> optionsList = select.getOptions();
		System.out.println(optionsList.size());
		for(WebElement e : optionsList) {
			optionTextList.add(e.getText());
		}
		return optionTextList;
	}
	
	

}
