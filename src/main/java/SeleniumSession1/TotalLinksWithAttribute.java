package SeleniumSession1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinksWithAttribute {
	
//	get total links
//	print all the href values of each link (having no blank text):

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 List<WebElement> findLinkList = driver.findElements(By.tagName("a"));
		 System.out.println("total link list : "+findLinkList.size());
		 
		 for(WebElement e : findLinkList) {
			 if(!e.getText().isEmpty()) {
			 String url = e.getAttribute("href");
			 if(url!=null) {
			 System.out.println(url);
		 }

	}

}
}
}