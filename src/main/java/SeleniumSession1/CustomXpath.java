package SeleniumSession1;

import org.openqa.selenium.By;

public class CustomXpath {

	public static void main(String[] args) {
//		Xpath is not an attribute its an locator or its an address of the element which present inside the html DOM.
		
//		2 types of xpath are available
//		1. absolute xpath : absolute address of the elemnet inside the DOM (now its not used)
//		/html/body/div[2]/div/div[3]/form/div/input[1]
		
//		2. custom/relative xpath : using property & other things create own xpaths
//		//htmltag[@attr='value']
//		//input[@name='username']
		
//      if want to use 2 attributes
//		//htmltag[@attr1='value' and @attr2='value']
//		//input[@id = 'username' and @type = 'email']
//		we can use 3 attribute also
//		//htmltag[@attr1='value' and @attr2='value' and @attr3='value']
//		//button[@data-test-id = 'password-login-button' and @aria-disabled = 'true' and @id = 'loginBtn']
		
//		for buuton
//		//button[@data-test-id = 'password-login-button']

		By email = By.xpath("//input[@name='username']");
		By userName = By.xpath("//input[@id = 'username' and @type = 'email']");
		By loginBtn = By.xpath("//button[@data-test-id = 'password-login-button']");
		
//		if id or anything is dynamic in nature then in that condition we use contains() function
//		//htmltag[contains(@id,'test')]
//		//input[contains(@id,'email')]
		
//		one attribute with contains & another one without contains
//		//htmltag[contains(@id,'value') and @name = 'value']
//		//input[contains(@id,'email') and @type='text']
		
//		we can use contains() with two attribute also
//		//input[contains(@id,'email') and contains(@type,'text')]
		
//		//input[@id='input-email']
//		//*[@id='input-email']
//		Both are correct (43,44)[good  is use 43 instead of 44 because with 43 specific input field will come & with 44 all 'input-email' will reflect
		
	   By.className("form-control private-form__control login-email"); //this one is wrong because with className we can't use 3 classes together
	   By.xpath("//input[@class='form-control private-form__control login-email']"); //with xpath we can use 3 classes together
	   By.className("login-email"); //with className we can use only one unique class
	   
//	   Text() function in xpath : whenever we dont have any id or anything but only text is available then in that condition we use Text() function
//	   //htmltag[text()='value']
//	 //h2[text()='Refreshing business software that your teams will love']
	   
//	   we can use text() function with some other attributes
//	   //tag[text()='value' and @attr='value']
//	   //a[text()='Customers' and @href='/customers/']
	   
//	   Text() with contains()
//	   tag[contains(text(),'value')]
//	   //h2[contains(text(),'Refreshing')]
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		

	}

}
