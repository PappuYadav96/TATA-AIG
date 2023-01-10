package TESTNGPractice;
import org.testng.annotations.Test;
public class DependsOnMethod {

	@Test
	public void startApp()
	{
		System.out.println("Starting app");


	}
	@Test(dependsOnMethods="startApp")
	public void loginApp()
	{
		System.out.println("Login to app");
	}
	@Test(dependsOnMethods="loginApp")
	public void logoutapp() {
		System.out.println("Logout app");

	}
}
