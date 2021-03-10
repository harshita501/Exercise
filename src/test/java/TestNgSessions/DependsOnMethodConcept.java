package TestNgSessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	@Test
	public void loginTest() {
		System.out.println("login to app");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "loginTest" , priority = 1)
	public void searchTest() {
		System.out.println("search test");
	}
	
	@Test(dependsOnMethods = "loginTest" , priority = 2)
	public void paymentTest() {
		System.out.println("payment Test");
	}

}
