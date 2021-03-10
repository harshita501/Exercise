package TestNgSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ClassicCrmTest extends BaseTest {
	
	@Test(priority = 1)
	public void crmtitleTest () {
		
		String title = driver.getTitle();
		System.out.println("title is :"+ title);
		Assert.assertEquals(title, "CRMPRO  - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test(priority = 2)
	public void crmProLogoTest() {
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/img")).isDisplayed());	
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	

}
