package TESTNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPractice {

	@Test(priority=1)
	public void LoginInApp() {

		System.out.println("Login Successfully");
		Assert.assertEquals(32, 12);
	}
	@Test(priority=2)
	public void SelectItems() {
		System.out.println("Item Selected");
	}
	@Test(priority=3)
	public void checkout() {
		System.out.println("Item Checkout");
	}

}