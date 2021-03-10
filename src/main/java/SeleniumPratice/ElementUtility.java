package SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtility {
	
	private WebDriver driver;
	
	public ElementUtility(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElement(By locators) {
		return driver.findElement(locators);
	}
	
	public void doSendKeys(By locators , String value) {
		getElement(locators).sendKeys(value);
	}
	
	public void doClick(By locators) {
		getElement(locators).click();
	}
	
	public void doGetElementText(By locators) {
		getElement(locators).getText();
	}
	
	public void doIsDisplayer(By locators) {
		getElement(locators).isDisplayed();
	}
	
}
