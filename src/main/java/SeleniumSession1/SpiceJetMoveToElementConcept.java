package SeleniumSession1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetMoveToElementConcept {
	
    static WebDriver driver;
    
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
//		Hard-Coded
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.linkText("LOGIN / SIGNUP"))).perform();
//		Thread.sleep(2000);
//		act.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).perform();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Member Login")).click();
		
//		By-Locator
		By moveToLogin = By.linkText("LOGIN / SIGNUP");
		By moveToSpiceClub = By.linkText("SpiceClub Members");
		By clickMemberLogin = By.linkText("Member Login");
		
//		By method
		doMoveToLogin(moveToLogin, moveToSpiceClub, clickMemberLogin);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doMoveToLogin(By locator1, By locator2, By locator3) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator1)).perform();
		Thread.sleep(2000);
		act.moveToElement(getElement(locator2)).perform();
		Thread.sleep(2000);
		act.moveToElement(getElement(locator3)).perform();
		getElement(locator3).click();
		
	}
}
