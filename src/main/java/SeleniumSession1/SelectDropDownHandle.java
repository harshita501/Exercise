package SeleniumSession1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		
//		select -- html tag
//		use Select class in Selenium (only applicable for "select" html tag).
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By Industry = By.id("Form_submitForm_Industry");
		By Country = By.id("Form_submitForm_Country");
		
//		Hard coded:
//		WebElement element_Industry = driver.findElement(Industry);
//		WebElement element_Country = driver.findElement(Country);
//		
//		Select select = new Select(element_Industry);
//		select.selectByIndex(5);
//		select.selectByVisibleText("Education");
//		select.selectByValue("health");
//		
//		Select select1 = new Select(element_Country);
//		select1.selectByValue("India");
		
//		Using Methods:
		doSelectByVisibleText(Industry, "Education");
		doSelectByVisibleText(Country, "India");

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public static void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

}











