package SeleniumSession1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCss {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
//		tag[atrr = 'value']
//		input[id ='username'] -- css selector
//		input[type='email']
//		//input[@id='username'] -- xpath
		
//		for class always use .class
//		.login-email
//		for id always use #{id}
//		#username
		
		By email = By.cssSelector("#username");
		
//		if you want 3 class together then the formula is
//		.c1.c2.c3.....cn
//		.form-control.private-form__control.login-email
//		for multiple classes we can use tag also like
//		input.form-control.private-form__control.login-email

		
//		if you want to use html tag then its also possible
//		tag#id = input#username
//		tag.class = input.login-email
		
//		we can use tag & class simultaneously
//		input.login-email#username
		
//		vise-versa also possible
//		input#username.login-email
		
//		if you want to remove tag name its also possible
//		input#username.login-email
		
		By email1 = By.xpath("//input[@class='form-control private-form__control login-email']");
        By email2 = By.className("form-control private-form__control login-email"); //its wrong(we can't use 3 classes with spaces)
        By email3 = By.cssSelector("input.form-control.private-form__control.login-email");
        By email4 = By.className("login-email");
        
//        we can multiple attribute in css
//        tag[atrr1 = 'value'][atrr2 = 'value']
//        input[id='username'][type='email'] -- this is usefull when you dont have the id & class
        
        
//        input[id*='user'] -- contains{css supports contains}
//        input[id*='name']
        
//        one with contains function & another one without contains its also possible
//        input[id*='name'][type='email']
        
//        input[id^='user'] -- starts-with
//        input[id$='name'] -- ends-with
        
//        css does not support 'or'
//        css does not support 'text()' function
        
//        parent to child in xpath
//        //div[@class='private-form__input-wrapper']//input -- direct + indirect child elements
//        //div[@class='private-form__input-wrapper']/input -- only direct child elements
//        //div[@class='page']/div --2 direct child elements
//        //div[@class='page']//div -- 24 direct + indirect child elements
        
//        parent to child in css
//        div.private-form__input-wrapper input
//        div.private-form__input-wrapper > input(70 & 71 both are same)
//        div.page div --24(direct+indirect)
//        div.page > div --2(direct)
        
//        above all the above xpath & css taken from below link
//        https://app.hubspot.com/login?__cf_chl_jschl_tk__=5b23cb510be6f9fa8c860d79ca2d739cc473ba82-1613184566-0-AQo96BAF-P0HRukRCxwcJNYK1JMIqZ1B1NIWQAKMRKokXK1jbmngG_2e55iPxzoluP3V8nP7ZhV9wc2jcyZEO78pwfIs-4SgJkJnYBDhFGtr9WorZ71ODby4i988GS7Kf00WF9wMFrWvK6V0bE9V9QaeWCTRm8qB-tcXJP5eDNrxN2VM97p8nmg8fkIljO--O0MV6Ke8nRkEjg0cG349Ke9iVQqfVLYTLHUv0z8A6_Gag5wplVBc8Guh7cVn5_lCEMu7a6Q5ZF4uSYKHqjv9Ew12dsX1BMBel4TSEoqHsSXZyjlzFfRQpFNsjWMf6W0Bdu_3Gxiuc-Op36l-eeAF3JSlrcVQ9bNA67SlQhDibm-bDGgZeR1nK_MGkvhA2GTtcQ
        
//   ************************************************************************************************************************
//        same parent to child in css
//        ul.footer-nav li a
//        ul.footer-nav > a -- its wrong because a not connected directly
//        ul.footer-nav a
//        ul.footer-nav > li > a
        
//        child to parent not supported in css also parent-ancestor also not supported
        
//        child to grand parent supported in xpath (used hubspot login link for this below xpath)
//        //input[@id='username']/ancestor::form
        
//        preceeding sibling not supported in css but following sibling supported in css.(used hubspot login link for this below css following sibling)
//       div.private-form__input-wrapper + div
        
//        css with not operator
//        form-control private-form__control login-email (just uername field name)
//        form-control private-form__control login-password m-bottom-3 (just password field name)
//        (used hubspot login link for this below css)
//        input.form-control.private-form__control:not(.login-email) (it means that not shows particular username field only)[it shows css for password only]
//        input.form-control.private-form__control:not(#password)(it means that not shows particular password field only0[it shows css for username only]
        
//        comma in css
//        used hubspot login link for this below css
//        input#username, input#password, button#loginBtn, footer.copyright
        By loginForm = By.cssSelector("input#username, input#password, button#loginBtn, footer.copyright");
        List<WebElement> impEleList = driver.findElements(loginForm);
        int impElements = impEleList.size();
        if(impElements==4) {
        	System.out.println("all imp elements are present on the page");
        	for(WebElement e : impEleList) {
        		System.out.println(e.isDisplayed());
        	}
        }
        
//        nth of type function (just like indexing in xpath)(its applicable only for direct element)
//        used freshwork.com login link for this below css
//        ul.footer-nav li:nth-of-type(4)
        
//        ul.nav.navbar-nav.navbar-right li:nth-of-type(3) a
//      ul.nav.navbar-nav.navbar-right li:nth-of-type(3) > a
//        l.nav.navbar-nav.navbar-right a (directly find all the a links)
//         used crmpro login link for this above css (125 & 126 both are same)
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        
        
	}

}
