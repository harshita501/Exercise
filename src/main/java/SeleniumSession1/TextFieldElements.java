package SeleniumSession1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextFieldElements {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		By loginLink = By.linkText("Login");
		By registrationForm = By.xpath("//input[@class='form-control']");
		
		ElementUtil elementUtil = new ElementUtil(driver);
//		we can use any one of them for validation.
		if(elementUtil.doIsDisplayed(loginLink)) {
			System.out.println("login is present");
		}
		if(elementUtil.getElements(loginLink).size()==1) {
			System.out.println("login is present");
			
		}
		
		List<WebElement> formList = elementUtil.getElements(registrationForm);
		if(formList.size()==6) {
			System.out.println("yes all fields are present ");
		}
		for(WebElement e :formList ) {
			e.sendKeys("testing");
		}

	}

}
