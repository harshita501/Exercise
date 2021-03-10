package SeleniumSession1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleStaleElementWithList {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
//		List<WebElement> listOfFooterElement = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
	
//		Hard coded with for each loop but its not working
//		for(WebElement e : listOfFooterElement) {
//			e.click();
//			driver.navigate().back();
//			listOfElement = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
//		}
		
//		By locator
		By footerLinks = By.xpath("//div[@class='KxwPGc AghGtd']/a");
		
//		Hard coded its working
//		for(int i=0;i<listOfFooterElement.size();i++) {
//			listOfFooterElement.get(i).click();
//			String title = driver.getTitle();
//			System.out.println(title);
//			driver.navigate().back();
//			listOfFooterElement = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
		
//		By Method
		getListOfFooterElement(footerLinks);
		
		}

	public static List<WebElement> getElement(By locator) {
		return driver.findElements(locator);
	}
	
	public static void getListOfFooterElement(By locator) {
		List<WebElement> listOfFooterElement = getElement(locator);
		for(int i=0;i<listOfFooterElement.size();i++) {
			listOfFooterElement.get(i).click();
			String title = driver.getTitle();
			System.out.println("Title of the page: "+title);
			driver.navigate().back();
			listOfFooterElement = getElement(locator);
		}

		
	}
	

}
