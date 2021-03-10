package TestNgSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTestBM {
	
WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
	}
	
	@Test(priority = 1)
	public void titleTest () {
		String title = driver.getTitle();
		System.out.println("title is :"+ title);
		Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	}
	
//	@Ignore
	@Test(priority = 2, enabled = true)
	public void urlTest() {
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
	}
	
	@Test(priority = 3)
	public void logoTest() {
		Assert.assertTrue(driver.findElement(By.cssSelector("#nav-logo")).isDisplayed());
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
