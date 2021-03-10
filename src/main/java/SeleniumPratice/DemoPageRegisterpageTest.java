package SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoPageRegisterpageTest {

	public static void main(String[] args) {
		
		BrowserUtiliy browserutility = new BrowserUtiliy();
		WebDriver driver = browserutility.launchBrowser("chrome");
		browserutility.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		String title = browserutility.getPageTitle();
		System.out.println("Register page title : "+title);
		
//		By locators : 
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By reconfirmPassword = By.id("input-confirm");
		By checkbox = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		By continueButton = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By continueLinkButton = By.linkText("Continue");
		
		
		ElementUtility elementUtility = new ElementUtility(driver); 
		elementUtility.doSendKeys(firstName, "selenium");
		elementUtility.doSendKeys(lastName, "test");
		elementUtility.doSendKeys(email, "tselenium529@gmail.com");
		elementUtility.doSendKeys(telephone, "1234567890");
		elementUtility.doSendKeys(password, "Samsung@123");
		elementUtility.doSendKeys(reconfirmPassword, "Samsung@123");
		elementUtility.doClick(checkbox);
		elementUtility.doClick(continueButton);
		elementUtility.doClick(continueLinkButton);
		
		
		browserutility.closeBrowser();
		
	}

}
