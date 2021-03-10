package SeleniumSession1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleFooterLinks {
	static WebDriver driver;

	public static void main(String[] args) {
//		with this program i am trying to get the footer links by created own x-path.
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		By footerLinks = By.xpath("//div[@class='KxwPGc AghGtd']/a");
		dolinkclick(footerLinks,"Business");
		
//		right now i have created hard coded program for this scenario 
		
//		List<WebElement> footerLinks = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
//		System.out.println(footerLinks.size());
//		for(WebElement e : footerLinks) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("Business")) {
//				e.click();
//				break;
//			}
//		}
	
	}
//	now i am creating generic method or utility for above code 
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void dolinkclick(By locator,String value) {
		List<WebElement> footerLinks = getElements(locator);
		System.out.println("total links : "+footerLinks.size());
        for(WebElement e : footerLinks) {
		String text = e.getText();
        System.out.println(text);
		if(text.equals(value)) {
			e.click();
			break;
		}
	}
		
	}
	

}
