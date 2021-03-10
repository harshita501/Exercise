package SeleniumSession1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		System.out.println(jsUtil.getTitleByJS());
//		
//		jsUtil.refreshBrowserByJS();
//		jsUtil.generateAlert("this is alert");
		
//		System.out.println(jsUtil.getPageInnerText());
		
//		WebElement user = driver.findElement(By.name("username"));
//		WebElement pwd = driver.findElement(By.name("password"));	
//	    WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
//		jsUtil.drawBorder(login);
	    
//	jsUtil.flash(user);
//	user.sendKeys("harshita");
//	
//	jsUtil.flash(pwd);
//	pwd.sendKeys("harshita123");
//	
//	jsUtil.flash(login);
//	
//		WebElement ele = driver.findElement(By.xpath("//div[@class='a-section feed-carousel first-carousel']"));
//		jsUtil.scrollIntoView(ele);
	
		jsUtil.clickElementByJS(driver.findElement(By.linkText("Mobiles")));
		
		
//		Thread.sleep(5000);
//		driver.quit();
		
		
	}

}
