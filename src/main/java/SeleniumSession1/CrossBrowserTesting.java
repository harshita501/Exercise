package SeleniumSession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		String browser = "firefox";
		
		if(browser.equals("chrome")) {
	       //System.setProperty("webdriver.chrome.driver","/Users/AB38463/Downloads/chromedriver");
			WebDriverManager.chromedriver().setup();
	       driver = new ChromeDriver();
		}
		
		else if(browser.equals("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "/Users/AB38463/Downloads/geckodriver");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if(browser.equals("safari")) {
			driver = new SafariDriver();
		}
		
		else {
			System.out.println("Invalid browser name");
		}
		
		driver.get("http://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
		

		
	}

}
