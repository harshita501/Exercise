package SeleniumSession1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu");
		
//		Hard coded
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.className("menulink"))).perform();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("COURSES")).click();
		
//		Creating By locator
		By mainMenu = By.className("menulink");
		By menuOptions = By.linkText("COURSES");
		
		
//		Call program using methods
//		doMoveToElement(mainMenu);
//		Thread.sleep(2000);
//		doMoveToElement(menuOptions);
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("COURSES")).click();
		
//		when you want to run this program use line no. 61 in 2nd method.[getElement(locator2).click();]
		doMoveToElement(mainMenu, menuOptions);

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
//	2 level menu & sub menu
	public static void doMoveToElement(By locator) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator)).perform();
	}

//	3 level
	public static void doMoveToElement(By locator1, By locator2) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator1)).perform();
		act.moveToElement(getElement(locator2)).perform();
	}
	
//	3 level with click
	public static void doMoveToElement(By locator1, By locator2, By locator3) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator1)).perform();
		act.moveToElement(getElement(locator2)).perform();
		getElement(locator3).click();
	}

}
