package SeleniumSession1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

    public class SelectDropDownValueWithText {
    	
    static WebDriver driver;
    
	public static void main(String[] args) {
//		Interview question
//		write a program to select option from drop down menu without using select methods use only text.
		
        WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry = By.id("Form_submitForm_Industry");
    	By country = By.id("Form_submitForm_Country");
		
//		Hard-coded
//		Select select_indus = new Select(driver.findElement(industry));
//		List<WebElement> indusList = select_indus.getOptions();
//		for(WebElement e : indusList ) {
//			if(e.getText().equals("Healthcare")){
//			e.click();
//			break;
//		}
//		}
	
		
//		By method
		doSelecyByTextOption(industry,"Healthcare");
		doSelecyByTextOption(country,"India");

	}
	
	public static void doSelecyByTextOption(By locator, String text) {
		Select select = new Select(driver.findElement(locator));
		List<WebElement> optionsList = select.getOptions();
		for(WebElement e : optionsList ) {
			if(e.getText().equals(text)) {
			e.click();
			break;
		}
		
	}

}
}