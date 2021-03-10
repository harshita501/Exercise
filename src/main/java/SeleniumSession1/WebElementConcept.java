package SeleniumSession1;

//import javax.swing.text.html.CSS.Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
    	driver.get("https://demo.opencart.com/index.php?route=account/login");
//		driver.get("https://crmpro.com/");
//		driver.get("https://www.freshworks.com/");
		
//		locators
//		create the webelement --> perform the action(click,send keys,get the text)
		
//		 1. id : Its a unique attribute
		
//		a. 1st Approach
//		driver.findElement(By.id("input-email")).sendKeys("harshita@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@gmail.com");
		
//		b. 2nd Approach
//       Advantage with this approach is that i can use emailID.sendKeys("harshita@gmail.com") with other name again n again
//      & no need to right WebElement emailID = driver.findElement(By.id("input-email")); again n again.
		
//		WebElement emailID = driver.findElement(By.id("input-email"));
//		emailID.sendKeys("harshita@gmail.com");
//		
//		WebElement password = driver.findElement(By.id("input-password"));
//		password.sendKeys("test@gmail.com");
		
//		c. 3rd Approach
//		Using by locators:
//		
//		Advantage with this approach is that will create by-locators or object-repository & which one is required will use through WebElement.
//		& while create the by locators selenium is not active or not with server so no exception will occur if server will down.
		
//		By email = By.id("input-email");
//    	By password = By.id("input-password");
//		
//		WebElement emailid = driver.findElement(email);
//		WebElement pwd = driver.findElement(password);
//		
//		emailid.sendKeys("daksh@gmail.com");
//		pwd.sendKeys("daksh@123");
		
//		d. 4th Approach
//		getElement(email).sendKeys("vimal@gmail.com");
//		getElement(password).sendKeys("test@123");
		
//		e. 5th Approach
//		doSendKeys(email,"harshita@gmail.com");
//		doSendKeys(password,"test@123");

    	
//   	2. name : Its not a unique attribute
//    	driver.findElement(By.name("username")).sendKeys("test@gmail.com");
    	
//    	3. classname : not recommended if class name is not unique
//    	driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");
    	
//    	4. xpath : It is a locator not an Attribute.It is a address of the element in HTML DOM.
//    	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("test@gmail.com");
//    	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
    	
//    	5. css selector : It is a locator not a Attribute.
//    	driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(1)")).sendKeys("test@gmnail.com");
//    	driver.findElement(By.cssSelector("#loginForm > div > div > input")).click();
    	
//    	6. linktext : only for links : htmltag = <a>
//    	driver.findElement(By.linkText("Login")).click();
//    	driver.findElement(By.linkText("Order History")).click();
    	
//    	7. PartialLinkTest : Only for links
//    	driver.findElement(By.partialLinkText("About")).click();
    	
//    	8. tagName : Its represents with <h1>,<h2>,<h3> in html tags
//    	String h2Header = driver.findElement(By.tagName("h2")).getText();
//    	System.out.println(h2Header);
    
		
		By email = By.id("input-email");
    	By password = By.id("input-password");
    	By loginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]");
    	
    	doSendKeys(email, "vimal_pant7@yahoo.co.in");
    	doSendKeys(password, "D@k$h@18");
    	doClick(loginButton);
		
    	
	}
	
	public static WebElement getElement(By locators) {
		return driver.findElement(locators);
	}
	
	public static void doSendKeys(By locators, String value) {
		getElement(locators).sendKeys(value);
	}
	public static void doClick(By locators) {
		getElement(locators).click();
	}
	
	
	
	
	
	
	
	
	

}
