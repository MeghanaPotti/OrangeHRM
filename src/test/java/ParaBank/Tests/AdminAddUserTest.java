package ParaBank.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ParaBank.utils.WebActions;

public class AdminAddUserTest extends LoginTest{
	
	public void adminAddUserTest(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	@Test
	
	public void adminNewUser(String employeeName, String userName, String password) {
		
		System.out.println("Validating add new user page");
		AdminAddUserTest newUser = new AdminAddUserTest();
		
		newUser.adminNewUser("Charlie Carter", "Admin", "@Admin123");
		WebActions.waitForPageToLoad(driver);	
		captureScreenshot("adminNewUser");
		
		
	}

}
