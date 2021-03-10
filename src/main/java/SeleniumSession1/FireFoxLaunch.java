package SeleniumSession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/AB38463/Downloads/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
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
