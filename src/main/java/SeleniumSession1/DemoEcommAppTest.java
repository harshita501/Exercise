package SeleniumSession1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoEcommAppTest {

	public static void main(String[] args) {
		
		BrowserUtil browserUtil = new BrowserUtil(); 
		WebDriver driver = browserUtil.launchBrowser("chrome");
		browserUtil.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		String title = browserUtil.getPageTitle();
		System.out.println("login page title : "+title);
		
//		By locators :
		By email = By.id("input-email");
    	By password = By.id("input-password");
    	By loginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]");
    	By yourStoreLink = By.linkText("Your Store");
    	
    	ElementUtil elementUtil = new ElementUtil(driver);
    	elementUtil.doSendKeys(email, "vimal_pant7@yahoo.co.in");
    	elementUtil.doSendKeys(password, "xyz@123");
    	elementUtil.doClick(loginButton);
    	
    	String accPageTitle = browserUtil.getPageTitle();
		System.out.println("acc page title is : "+accPageTitle);
		
		if(elementUtil.doIsDisplayed(yourStoreLink)) 
		 {
			String header = elementUtil.doGetElementText(yourStoreLink);
			System.out.println(header);	
		}
		
		browserUtil.closeBrowser();

	}

}
