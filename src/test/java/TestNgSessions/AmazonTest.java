package TestNgSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{
	
	@Test(priority = 1)
	public void  titleTest  () {
		
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
	
	

}
