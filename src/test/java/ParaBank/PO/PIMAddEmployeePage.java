package ParaBank.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ParaBank.utils.WebActions;

public class PIMAddEmployeePage {

	public WebDriver localDriver;
	private final WebActions app;

		public PIMAddEmployeePage(WebDriver driver) {
			localDriver=driver;
		    PageFactory.initElements(driver, this);
		    this.app = new WebActions(driver);
		}
	
		By usernameInput = By.name("username");
		By passwordInputLogin = By.name("password");
		By loginButton = By.xpath("//*[text()=' Login ']");	
		
		By pimMenu = By.xpath("//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='PIM']");
		By addEmployee = By.xpath("//*[contains(text(),'Add Employee')]");
		By employeeFirstName = By.xpath("//*[@name='firstName']");
		By employeeMiddleName = By.xpath("//*[@name='middleName']");	
		By employeeLastName = By.xpath("//*[@name='lastName']");
		By saveButton = By.xpath("//*[@type='submit']");
	
		public void login(String username, String password, WebDriver driver) {
	    	 System.out.println("Navigating to the login page: https://opensource-demo.orangehrmlive.com/");
	         driver.get("https://opensource-demo.orangehrmlive.com/");
	         WebActions.waitForPageToLoad(driver);
	         app.sendKeys(usernameInput, username);
	         app.sendKeys(passwordInputLogin, password);
	         app.click(loginButton);
	         app.waitForSeconds(5);
	    }
		
		public void addEmployee(String employeeFirstName, String employeeMiddleName, String employeeLastName) {
			
			app.click(pimMenu);
			app.click(addEmployee);
			app.sendKeys(addEmployee, employeeFirstName);
			app.sendKeys(addEmployee, employeeMiddleName);
			app.sendKeys(addEmployee, employeeLastName);
			app.click(saveButton);
			
		}
	
}
