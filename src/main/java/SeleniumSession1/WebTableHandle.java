package SeleniumSession1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
//		(//a[text()='Chitra Automation']/parent::td//following-sibling::td)[position()=5]/a
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("batchautomation");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[2]")));
		driver.findElement(By.linkText("CONTACTS")).click();
//		String xpathVal = "//a[text()='Chitra Automation']/parent::td/preceding-sibling::td/input[@type='checkbox']";
//		driver.findElement(By.xpath(xpathVal)).click();
		
//		selectContact("Chitra Automation");
//		selectContact("David Lewis");
		System.out.println(selectContact("Chitra Automation"));
		
//	String followingXpath = "//a[text()='Chitra Automation']/parent::td//following-sibling::td/span";
//	String text = driver.findElement(By.xpath(followingXpath)).getText();
//	System.out.println(text);

	}
	public static String selectContact(String name) {
		String xpathVal = "//a[text()='"+name+"']/parent::td/preceding-sibling::td/input[@type='checkbox']";
		driver.findElement(By.xpath(xpathVal)).click();
	    String followingXpath = "//a[text()='"+name+"']/parent::td//following-sibling::td/span";
	    String text = driver.findElement(By.xpath(followingXpath)).getText();
//	    System.out.println(text);
	    return text;
	}
	
	

}
