package TestNgSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	/**
	 *     BS--Create User
           BT--connect With DB
           BC--launch browser
                              BM--login to app
                              add to cart test
                              AM--logout

                              BM--login to app
                              Payment test
                              AM--logout

                              BM--login to app
                              search Test....
                              AM--logout

           AC--close browser
           AT--Disconnect with DB
           AS--delete user
	 */
	
	@BeforeSuite
	public void createUse(){
		System.out.println("BS--Create User");
	}
	
	@BeforeTest
	public void connectWithDB() {
		System.out.println("BT--connect With DB");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC--launch browser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("BM--login to app");
	}
	
	@Test(priority = 1)
	public void searchTest() {
		System.out.println("search Test....");
	}
	
	@Test(priority = 3)
	public void addToCartTest() {
		System.out.println("add to cart test");
	}
	
	@Test(priority = 2)
	public void payemntTest() {
		System.out.println("payment test");
	}
	
	
	@AfterMethod
	public void logout() {
		System.out.println("AM--logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC--close browser");
	}
	
	@AfterTest
	public void disconnectWithDB() {
		System.out.println("AT--Disconnect with DB");
	}
	
	@AfterSuite
	public void deleteUser() {
		System.out.println("AS--delete user");
	}
	

}
