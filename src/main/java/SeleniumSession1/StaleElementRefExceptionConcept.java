package SeleniumSession1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementRefExceptionConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		WebElement userName = driver.findElement(By.id("input-email"));
		userName.sendKeys("harshita@gmail.com");
		driver.navigate().refresh();
//		After this refresh again use created Webelement to enter another value if you dont use the created webelement then StaleElementRefException will appear
		
		userName = driver.findElement(By.id("input-email"));
		userName.sendKeys("tom@gmail.com");

	}

}
