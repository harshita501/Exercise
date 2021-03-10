package SeleniumSession1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementWithList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		List<WebElement> linkList = driver.findElements(By.xpath("//div[@class='list-group']/a"));
		
		for(int i=1;i<linkList.size();i++) {
			linkList.get(i).click();
			driver.navigate().back();
			linkList = driver.findElements(By.xpath("//div[@class='list-group']/a"));
			
		}

	}

}
