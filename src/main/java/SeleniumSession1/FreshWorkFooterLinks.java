package SeleniumSession1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreshWorkFooterLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		By footerLinks = By.xpath("//div[@class='footer-main']//a");
		getAllFooterLinks(footerLinks);
		
		
		//div[@class='footer-main']//a"));
//		System.out.println(footerLinks.size());
//		List<WebElement> footerLinks = driver.findElements(By.xpath("//div[@class='footer-main']//a"));
//		System.out.println(footerLinks.size());
//		for(WebElement e : footerLinks ) {
//			String text = e.getText();
//			String url = e.getAttribute("href");
//			System.out.println(text +"------"+ url);
//		}

	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static void getAllFooterLinks(By locator) {
		List<WebElement> footerLinks = getElements(locator);
		System.out.println(footerLinks.size());
		for(WebElement e : footerLinks ) {
			String text = e.getText();
			String url = e.getAttribute("href");
			System.out.println(text +"------"+ url);
		}
		
	}

}
