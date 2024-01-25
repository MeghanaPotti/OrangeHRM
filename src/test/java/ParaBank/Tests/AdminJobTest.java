package ParaBank.Tests;

import org.testng.annotations.Test;

import ParaBank.PO.AdminJobPage;
import ParaBank.utils.WebActions;

public class AdminJobTest extends LoginTest{

	@Test
	public void adminJob() {
		System.out.println("This is an admin add user method");
		AdminJobPage adminJobpage = new AdminJobPage(driver);
		adminJobpage.login(userName, password, driver);
		adminJobpage.adminJob();
		WebActions.waitForPageToLoad(driver);
		captureScreenshot("adminJob");
	}
		
}
