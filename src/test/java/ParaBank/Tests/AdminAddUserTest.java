package ParaBank.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ParaBank.PO.AdminAddUserPage;
import ParaBank.utils.WebActions;

public class AdminAddUserTest extends LoginTest{
	
	@Test
	public void adminAddUserTest() {
		System.out.println("This is an admin add user method");
		System.out.println("This is an admin add user method");
		AdminAddUserPage newUserPage = new AdminAddUserPage(driver);
		newUserPage.login("Admin", "admin123", driver);
		newUserPage.adminAddNewUser("Admin", "@Admin123");
		WebActions.waitForPageToLoad(driver);
		captureScreenshot("adminAddUserTest");
	}
}
