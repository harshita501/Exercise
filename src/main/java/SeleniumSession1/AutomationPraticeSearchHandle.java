package SeleniumSession1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPraticeSearchHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?");
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		Thread.sleep(3000);
		List<WebElement> listOfSuggestion = driver.findElements(By.xpath("//div[@class='ac_results']//li"));
		System.out.println(listOfSuggestion.size());
		for(WebElement e : listOfSuggestion) {
			if(e.getText().equals("Casual Dresses > Printed Dress"));
			e.click();
			break;
			
		}
		

	}

}
