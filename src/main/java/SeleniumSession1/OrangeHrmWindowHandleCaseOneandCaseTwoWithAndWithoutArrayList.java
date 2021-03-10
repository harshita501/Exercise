package SeleniumSession1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmWindowHandleCaseOneandCaseTwoWithAndWithoutArrayList {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
//		Thread.sleep(1000);
		
    	List<WebElement> windowList = driver.findElements(By.xpath("//div[@id='social-icons']/a"));
		
//		Set<String> handles = driver.getWindowHandles();
//		Iterator<String> it = handles.iterator();
//		
//		String parentWindowId = it.next();
//		System.out.println("parent window id is : "+parentWindowId);
//		
//		String linkDinWindowId = it.next();
//		System.out.println("linkDinWindowId window id is : "+linkDinWindowId);
//		
//		String facebookWindowId = it.next();
//		System.out.println("facebookWindowId window id is : "+facebookWindowId);
//		
//		String twitterWindowId = it.next();
//		System.out.println("twitterWindowId window id is : "+twitterWindowId);
//		
//		String youtubeWindowId = it.next();
//		System.out.println("youtubeWindowId window id is : "+youtubeWindowId);
//		
//		driver.switchTo().window(linkDinWindowId);
//		System.out.println("title of linkdin is : "+ driver.getTitle());
//		driver.close();
//		
//		driver.switchTo().window(facebookWindowId);
//		System.out.println("title of facebook is : "+ driver.getTitle());
//		driver.close();
//		
//		driver.switchTo().window(twitterWindowId);
//		System.out.println("title of twitter is : "+ driver.getTitle());
//		driver.close();
//		
//		driver.switchTo().window(youtubeWindowId);
//		System.out.println("title of youtube is : "+ driver.getTitle());
//		driver.close();
//		
//		driver.switchTo().window(parentWindowId);
//		System.out.println("title of parentWindow is : "+ driver.getTitle());
//		driver.quit();
    	
    	for(WebElement e : windowList) {
    		e.click();
    		Thread.sleep(4000);
    		Set<String> handles = driver.getWindowHandles();
    		
    		List<String>handleslist= new ArrayList<String>(handles);
    		
    		Iterator<String> it = handleslist.iterator();
    		String parentWindowId = it.next();
//    		System.out.println("parentWindowId is : "+parentWindowId);
    		String childWindowId = it.next();
//    		System.out.println("childWindowId is : "+childWindowId);
    		driver.switchTo().window(childWindowId);
    		System.out.println("title of childWindowIds : "+driver.getTitle() );
//    		driver.close();
    		driver.switchTo().window(parentWindowId);
//    		System.out.println("title of parentWindow is : "+ driver.getTitle());
    	}
    	
    	System.out.println("title of parentWindow is : "+ driver.getTitle());
	}

}
