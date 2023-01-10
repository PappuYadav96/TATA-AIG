package AssertionDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {


	@Test
	public void testsoft() {

		SoftAssert as= new SoftAssert();
		System.out.println("Test1 Started");

		as.assertEquals(12, 13);
		System.out.println("Test Complted");
		as.assertAll();





	}









}
