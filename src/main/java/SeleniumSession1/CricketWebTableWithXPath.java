package SeleniumSession1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketWebTableWithXPath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/pakistan-women-in-sa-2020-21-1244840/south-africa-women-vs-pakistan-women-3rd-t20i-1244848/full-scorecard");
		
//		List<WebElement> allRows = driver.findElements(By.xpath("//div[@class='card content-block match-scorecard-table']"));
//		for(WebElement e : allRows) {
//			List<WebElement> columns = e.findElements(By.tagName("td"));
//			
//			for(WebElement column : columns) {
//				System.out.println(column.getText());
//			}
//		}
		
		List<WebElement> highScore = driver.findElements(By.xpath("//td[contains(@class,'batsman-cell text-truncate')]/parent::tr"));
		System.out.println(highScore.size());
		
		for(int i=0; i<highScore.size(); i++)
		{
			
			System.out.println(highScore.get(i).getText());
		}
		

	}
}
