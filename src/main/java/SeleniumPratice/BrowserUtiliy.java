package SeleniumPratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtiliy {
	
	WebDriver driver;
	
	public WebDriver launchBrowser(String browserName) {
		
		System.out.println("Launch browser : "+ browserName);
		
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefix")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("safari")) {
			driver = new SafariDriver();
	}
		else {
			System.out.println("Invalid browser name : "+ browserName);
		}
		return driver;

    }
	
	public void launchUrl(String url) {
		System.out.println("url is : "+url);
		if(url.isEmpty()) {
			System.out.println("url is blank : "+url);
			return;
		}
		driver.get(url);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		 return driver.getCurrentUrl();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}