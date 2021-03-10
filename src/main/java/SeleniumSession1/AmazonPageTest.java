package SeleniumSession1;

public class AmazonPageTest {
	
	public static void main(String[] args) {
		
		String browserName = "chrome";
		
		BrowserUtil browserUtil = new BrowserUtil(); 
		
		browserUtil.launchBrowser(browserName);
		browserUtil.launchUrl("http://www.amazon.com");
		String title = browserUtil.getPageTitle();
		if(title.contains("Online Shopping")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorect title");
		}
		if(browserUtil.getPageUrl().contains("amazon")){
			System.out.println("pointing to correct url....");
		}
		browserUtil.closeBrowser();
	
	}

}
