package SeleniumSession1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		
//		this method provides window id's & its called WindowHandles & 'Set' always store unique values only & it stores window & parent id's
		Set<String> handles = driver.getWindowHandles();
		
//		Iterator helps to collect those values from collections which are not maintaining any indexing
		Iterator<String> it = handles.iterator();
		
//		used to move the iterator
		String parentWindowId = it.next();
		System.out.println("parent window id is : "+parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("child window id is : "+childWindowId);
		
//		switching
		driver.switchTo().window(childWindowId);
		System.out.println("child window title is : "+ driver.getTitle());
    	driver.close();  //close child window
    	
    	driver.switchTo().window(parentWindowId);
    	System.out.println("parent window title is : "+ driver.getTitle());
    	
    	driver.quit();
		

	}

}
