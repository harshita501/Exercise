package SeleniumSession1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassicCRMPROFramehandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("batchautomation");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[2]")));
		driver.findElement(By.linkText("CONTACTS")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Logout')]")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();

	}

}
