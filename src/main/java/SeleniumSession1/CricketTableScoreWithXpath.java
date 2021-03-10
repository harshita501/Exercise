package SeleniumSession1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketTableScoreWithXpath {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/pakistan-women-in-sa-2020-21-1244840/south-africa-women-vs-pakistan-women-3rd-t20i-1244848/full-scorecard");
		
//		String xpathVal = "//a[text()='Muneeba Ali']/parent::td/following-sibling::td[@class='text-left']";
//		String wicketTakerName = driver.findElement(By.xpath(xpathVal)).getText();
		
//		System.out.println(getWicketTackername("Muneeba Ali"));
//		System.out.println(getWicketTackername("Nida Dar"));
		
//		List<WebElement> scoreList = driver.findElements(By.xpath("//a[text()='Muneeba Ali']/parent::td/following-sibling::td"));
//		for(int i=1;i<scoreList.size();i++) {
//			System.out.println(scoreList.get(i).getText());
//		}
		System.out.println(getWicketTackername("Muneeba Ali"));
		System.out.println(getPlayerScoreCard("Muneeba Ali"));
		
		System.out.println(getWicketTackername("Nida Dar"));
		System.out.println(getPlayerScoreCard("Nida Dar"));
	
	}
	public static String getWicketTackername(String playerName) {
		String xpathVal = "//a[text()='"+playerName+"']/parent::td/following-sibling::td[@class='text-left']";
		String wicketTakerName = driver.findElement(By.xpath(xpathVal)).getText();
		return wicketTakerName;
	}
	
	public static List<String> getPlayerScoreCard(String playerName) {
	List<String> scoreCardList = new ArrayList<String>();	
	List<WebElement> scoreList = driver.findElements(By.xpath("//a[text()='"+playerName+"']/parent::td/following-sibling::td"));
	for(int i=1;i<scoreList.size();i++) {
	scoreCardList.add(scoreList.get(i).getText());
		}
	return scoreCardList;
	}
	
	

}
