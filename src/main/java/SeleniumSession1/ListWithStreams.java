package SeleniumSession1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListWithStreams {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println(linksList.size());
		
//		Sequential Stream
//		Now comparing which one fast through time
		long stTime = System.currentTimeMillis();
		
    	linksList.stream().forEach(ele -> System.out.println(ele.getText()));
		
//		total time taken 4210 : parallel stream
//    	total time taken 4870 : sequential stream
    	
//		linksList.parallelStream().forEach(ele -> System.out.println(ele.getText()));
		long endTime = System.currentTimeMillis();
		System.out.println("total time taken : " + (endTime - stTime));
		
		
//		Applying filters
//		1. stream() - its declare because have to tell that we are using sequential stream or parallel stream
//		2. filter() - its apply because we don't want blank spaces so when you getText don't consider empty
//		              We can use another filter also in which i want only those text were it contains(Amazon)
//		3. map() - its store all fresh values
//		4. collect() - collect all data in the form of list
//		List<String> amazonList = linksList.stream().filter(ele -> !ele.getText().isEmpty())
//				.filter(ele -> ele.getText().contains("Amazon"))
//				.map(ele ->ele.getText()).collect(Collectors.toList());
		
//		whatever fresh list is coming will store in another one
//		amazonList.stream().forEach(ele -> System.out.println(ele));
		
		
		
		
	}

}
