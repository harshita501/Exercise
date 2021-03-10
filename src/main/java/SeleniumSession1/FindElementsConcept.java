package SeleniumSession1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static void main(String[] args) {
//		Find out the total no. of links in page & print the text of each & every link.
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
		System.out.println("List of Links : "+ listOfLinks.size());
		
		for(int i=0;i<listOfLinks.size();i++) {
			String text = listOfLinks.get(i).getText();
			if(!text.isEmpty())
			System.out.println(i+ " " +text);
		}

	}

}
