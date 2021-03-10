package SeleniumSession1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
//		driver.findElement(By.xpath("//a[text()='8']")).click();
		
//		selectDate("15");
		
		By calendar = By.cssSelector(".ui-datepicker-calendar tr a");
		
//	 List<WebElement> dayList = driver.findElements(By.cssSelector(".ui-datepicker-calendar tr a"));
//	 for(WebElement e : dayList) {
//		 if(e.getText().equals("20")) {
//			 e.click();
//			 break;
//		 }
		selectDate(calendar, "25");
		
		
		Thread.sleep(5000);
		driver.quit();
	 }
	 
	public static void selectDate(String day) {
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
	}
	
	public static void selectDate(By locator, String day) {
		boolean flag = false;
		 List<WebElement> dayList = driver.findElements(locator);
		 for(WebElement e : dayList) {
			 if(e.getText().equals(day)) {
				 System.out.println("right date..."+day);
				 e.click();
				 flag=true;
				 break;
			 }
		 }
		 if(!flag) {
			 System.out.println("wrong date   : "+day);
		 }
		
	}

}
