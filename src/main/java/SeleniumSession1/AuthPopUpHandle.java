package SeleniumSession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUpHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		hard coded
//		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
//		Generic
		String username = "admin";
		String password = "admin";
		driver.get("http://"+username + ":"+password + "@"+"the-internet.herokuapp.com/basic_auth");
		
		

	}

}
