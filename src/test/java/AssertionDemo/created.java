package AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class created {
	@Test(priority=1)
	public void test1() {
		System.out.println("Test2 Started");

	
	}
	@Test(priority=2)
	public void test2() {

		System.out.println("Test1p Started");

	}	
}
