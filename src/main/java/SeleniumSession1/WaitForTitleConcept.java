package SeleniumSession1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForTitleConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
//		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.titleContains("Rediff"));
//		System.out.println(driver.getTitle());
		
//		String title = waitForTitleContains(5, "India");
//		System.out.println(title);
		
		driver.findElement(By.linkText("Fashion")).click();
		if(waitForTitle(5, "Fashion")) {   //right now its shows error because title get changed
			System.out.println("landed on fashion page....");
		}

	}
	
	public static String waitForTitleContains(int timeOut, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();	
	}
	
	public static String waitForTitleIs(int timeOut, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
		
	}
	public static Boolean waitForTitle(int timeOut, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.titleIs(title));
	}

}
