package ParaBank.Tests;

import ParaBank.PO.PIMAddEmployeePage;
import ParaBank.utils.WebActions;

public class PIMEmployeeTest extends LoginTest{

	public void newEmployee() {
		System.out.println("This is a new employee add method");
		PIMAddEmployeePage newEmployeePage = new PIMAddEmployeePage(driver);
		newEmployeePage.login(userName, password, driver);
		newEmployeePage.addEmployee("Meghana", "Satya Mani Sri", "Potti");
		WebActions.waitForPageToLoad(driver);
		captureScreenshot("adminJob");	
	}
}
