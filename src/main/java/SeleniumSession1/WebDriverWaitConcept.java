package SeleniumSession1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		ElementUtil eleUtil = new ElementUtil(driver);
		By email = By.id("input-email");
		By password = By.id("input-password");
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement emailEle = wait.until(ExpectedConditions.presenceOfElementLocated(email));
//		emailEle.sendKeys("test@gmail.com");
		
//		waitForPresenceOfElement(email, 10).sendKeys("test@gmail.com");
//		eleUtil.getElement(password).sendKeys("admin123");
		
//		By rightSideList = By.cssSelector(".list-group a");
//		waitForVisibilityOfElements(rightSideList, 10).stream().forEach(ele -> System.out.println(ele.getText()));
		
		By forgotPassword = By.xpath("//div[@class = 'list-group']/a[3]");
		clickWhenReady(forgotPassword, 10);
		
		if(waitForUrlToBe(3, "forgotten")){
			System.out.println("right url....");
			
		}

	}
	
	public static WebElement waitForPresenceOfElement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
	    return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
 /**
 * An expectation for checking that an element, known to be present on the DOM of a page, is visible. 
 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
 * @param locator
 * @param timeOut
 */
	public static WebElement waitVisibleOfElement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		WebElement ele = driver.findElement(locator);
		return wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	
	public static List<WebElement> waitForVisibilityOfElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		
	}
	
	/**
	 * An expectation for checking an element is visible and enabled such that you can click it.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementToBeClickable(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
	    return wait.until(ExpectedConditions.elementToBeClickable(locator));
		
	}
	public static void clickWhenReady(By locator, int timeOut) {
		waitForElementToBeClickable(locator, timeOut).click();
	}
	public static String getElementAttribute(By locator, int timeOut, String name) {
		return waitForElementToBeClickable(locator, timeOut).getAttribute(name);
	}
	public static boolean waitForElementTextToBe(By locator, int timeOut, String value) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
	    return wait.until(ExpectedConditions.textToBe(locator, value));
		
	}
	public static boolean waitForUrlToBe(int timeOut, String urlValue) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
	    return wait.until(ExpectedConditions.urlContains(urlValue));	
	}
	
	/**
	 * An expectation for checking if the given element is selected
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static boolean waitForElementToBeSelected(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
	    return wait.until(ExpectedConditions.elementToBeSelected(locator));	
	}
	
	public static void waitForFrameToBeAvailable(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
	     wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));	
	}
	
	public static void waitForFrameToBeAvailable(int frameIndex, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
	     wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));	
	}

}










