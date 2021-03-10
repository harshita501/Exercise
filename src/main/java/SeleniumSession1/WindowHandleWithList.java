package SeleniumSession1;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleWithList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		Set<String> handles = driver.getWindowHandles();
		
//		Top casting
		List<String> handlesList = new ArrayList<String>(handles);
		String parentWindowID = handlesList.get(0);
		String childWindowID = handlesList.get(1);
		
		System.out.println(parentWindowID);
		System.out.println(childWindowID);
		
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
