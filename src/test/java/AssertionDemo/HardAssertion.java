package AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {


	@Test
	public void test1() {

		Assert.assertTrue(true);
	}
	@Test
	public void test2() {

		Assert.assertTrue(false);

	}	
}
