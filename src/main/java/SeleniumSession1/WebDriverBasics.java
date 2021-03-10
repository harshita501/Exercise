package SeleniumSession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/AB38463/Downloads/chromedriver");
		
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
