package SeleniumPratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class is having different generic methods related to Browser
 * @author AB38463
 *
 */

public class BrowserUtiliy {
	
	WebDriver driver;
	
	/**
	 * This method is used to initialize webdriver on the basis of given browser name.
	 * @param browserName
	 * @return This method return webdriver reference
	 */
	public WebDriver launchBrowser(String browserName) {
		System.out.println("launch the browser:"+ browserName);
		
		switch(browserName) {
		case "chrome":
		    WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.err.println("Browser is not found : "+ browserName);
		}
		return driver;
	}
	
	/**
	 * This method is used to enter the url in Browser
	 * @param url
	 */
	public void launchUrl(String url) {
		System.out.println("url is : "+ url);
		if(url.isEmpty()) {
			System.out.println("url is blank : "+url);
			return;
		}
		driver.get(url);
	}
	
	/**
	 * This method is used to enter the title in Browser
	 * @return
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	/**
	 * This method is used to enter the pageUrl in Browser
	 * @return
	 */
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	/**
	 * This method is used to quit from the Browser
	 */
	public void quitBrowser() {
		driver.quit();
	}
	
	/**
	 * This method is used to close the Browser
	 */
	public void closeBrowser() {
		driver.close();
	}


}
