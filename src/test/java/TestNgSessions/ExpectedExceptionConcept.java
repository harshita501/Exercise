package TestNgSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	String name = "tom";

	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void loginTest() {
		System.out.println("login to app");
	int i = 9/0;
		ExpectedExceptionConcept obj = null;
		System.out.println(obj.name);
	}

}
