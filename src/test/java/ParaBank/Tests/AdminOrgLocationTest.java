package ParaBank.Tests;

import org.testng.annotations.Test;

import ParaBank.PO.AdminOrgLocationPage;
import ParaBank.utils.WebActions;

public class AdminOrgLocationTest extends LoginTest{

	@Test
	public void adminNewLocation() {
		
		System.out.println("This is new location adding method");
		AdminOrgLocationPage newLocationPage = new AdminOrgLocationPage(driver);
		newLocationPage.login("Admin", "admin123", driver);
		newLocationPage.adminOrgLocationPage();
		WebActions.waitForPageToLoad(driver);
		captureScreenshot("adminAddUserTest");
		
	}	
	
}
