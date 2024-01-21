package ParaBank.Tests;

import org.testng.annotations.Test;

import ParaBank.PO.LoginPage;
import ParaBank.utils.WebActions;

public class LoginTest extends BaseClass {

	@Test
	public void loginTest() {
		System.out.println("This is a login test method");
		LoginPage loginPage = new LoginPage(driver);

        // Example usage
        loginPage.login("Practise", "Practise");
        WebActions.waitForPageToLoad(driver);	
		captureScreenshot("loginTest");
		
	}
}
