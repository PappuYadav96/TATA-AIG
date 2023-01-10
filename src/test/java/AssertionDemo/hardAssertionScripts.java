package AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssertionScripts {

	@Test
	public void Test1()
	{

		Assert.assertEquals(12, 13);


	}
	@Test
	public void Test2()
	{
		System.out.println("Test Case2 Started");
		Assert.assertEquals(12, 13,"Test Completed");
		System.out.println("Test Case2 Completed");
	}
	@Test
	public void Test3()
	{
		System.out.println("Test Case3 Started");
		Assert.assertEquals("Hello","Hello","Test Script completed");
		System.out.println("Test Case3 Completed");

	}}