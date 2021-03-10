package SeleniumSession1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		ChromeDriver driver = new ChromeDriver(co);
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
	

	}

}
