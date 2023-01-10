package TESTNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependson_Fail {
@Test
	public void startApp() {
	
	Assert.assertEquals(12, 13);   // it is used to fail the test script
		System.out.println("Starting app");
	}

	@Test(dependsOnMethods = "startApp")
	public void loginApp() {
	System.out.println("Login to app");	
	}
	@Test(dependsOnMethods = "loginApp")
	public void logout() {
		System.out.println("Logout app");
	}
}
