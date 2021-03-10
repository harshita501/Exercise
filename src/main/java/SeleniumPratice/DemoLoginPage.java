package SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoLoginPage {

	public static void main(String[] args) {
		BrowserUtiliy browserutility = new BrowserUtiliy();
		WebDriver driver = browserutility.launchBrowser("chrome");
		browserutility.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		
		if(browserutility.getPageTitle().equals("Account Login")) {
			String title = browserutility.getPageTitle();
			System.out.println("login page title : "+ title);
		}
		else {
			System.out.println("invalid login page title");
		}
		String url = browserutility.getPageUrl();
		System.out.println("login page url : "+ url);
		
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
		ElementUtility elementutility = new ElementUtility(driver);
		elementutility.doSendKeys(email, "tselenium529");
		elementutility.doSendKeys(password, "Samsung@123");
		elementutility.doClick(loginButton);
		
		
		
		
	}
	
}
