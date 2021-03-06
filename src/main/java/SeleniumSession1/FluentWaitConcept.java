package SeleniumSession1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://crmpro.com/");
		By username = By.name("username");
		
//		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
//		.pollingEvery(Duration.ofSeconds(2))
//		.ignoring(StaleElementReferenceException.class)
//		.ignoring(NoSuchElementException.class);
//		
//		WebElement userName_ele = wait.until(ExpectedConditions.presenceOfElementLocated(username));
		waitForElementWithFluentWait(username, 10, 2).sendKeys("harshita@gmail.com");
	

	}
	
	public static WebElement waitForElementWithFluentWait(By locator, int timeOut, int pollingTime) {
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(StaleElementReferenceException.class)
				.ignoring(NoSuchElementException.class);
				
				return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
