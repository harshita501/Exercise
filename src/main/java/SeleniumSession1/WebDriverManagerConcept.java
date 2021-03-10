package SeleniumSession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); //launch chrome
		driver.get("http://www.google.com/"); //enter the url
		String title = driver.getTitle(); //get the title
		System.out.println("page title is : "+ title);
		
		//Verification point or check point or actual vs expected
		if(title.equals("Google")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		System.out.println(driver.getCurrentUrl());
		driver.quit();//close the browser

	}

}
