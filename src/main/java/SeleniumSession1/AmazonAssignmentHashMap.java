package SeleniumSession1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAssignmentHashMap {

	
		static WebDriver driver;

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.amazon.in/dp/B08T2NNT4S?pf_rd_r=9Z8SXDPGS7GMHC4ZTQSK&pf_rd_p=bab837a7-a21f-4cff-a26a-2e69f3d68ef6");
			
	       Map<String, String> m = getTechnicalDetails();
			for (Map.Entry<String, String> e : m.entrySet()) {
				System.out.println(e.getKey() + " : " + e.getValue());
			}
	      }

		public static Map<String, String> getTechnicalDetails() {

			Map<String, String> technicalDetailsMap = new HashMap<String, String>();

			By technicalData = By.xpath("//table[contains(@id, 'productDetails_techSpec_section_1')]//tr");
			
			List<WebElement> list = driver.findElements(technicalData);
			
			//System.out.println(list.size());
			
			for (int i = 1; i < list.size(); i++) {
	        
			String property = driver.findElement(By.xpath("//table[contains(@id, 'productDetails_techSpec_section_1')]//tr[" + i + "]/th")).getText();
			//System.out.println(property);

			String propertyValue = driver.findElement(By.xpath("//table[contains(@id, 'productDetails_techSpec_section_1')]//tr[" + i + "]/th/following-sibling::td")).getText();
			
			//System.out.println(propertyValue);
		
	        technicalDetailsMap.put(property, propertyValue);
			
			}

			return technicalDetailsMap;
		}
	}


