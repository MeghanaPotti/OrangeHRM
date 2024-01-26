package ParaBank.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ParaBank.utils.WebActions;

public class AdminAddUserPage{
	
	public WebDriver localDriver;
	public final WebActions app;
  
	public AdminAddUserPage(WebDriver driver) {
		localDriver=driver;
	    PageFactory.initElements(driver, this);
	    this.app = new WebActions(driver);
	}
	
	By usernameInput = By.name("username");
	By passwordInputLogin = By.name("password");
	By loginButton = By.xpath("//*[text()=' Login ']");	
	    
	By adminMenu = By.xpath("//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Admin']");
	By addUserButton = By.xpath("//*[@class='orangehrm-header-container']//*[@type='button']");
	By userRoleDropDown = By.xpath("//*[contains(text(),'User Role')]/parent::div//following-sibling::div");
	By employeeNameInput = By.xpath("//*[@placeholder='Type for hints...']");
	By statusDropDown = By.xpath("//*[contains(text(),'Status')]/parent::div/following-sibling::div");
	By userNameInput = By.xpath("//*[contains(text(),'Username')]/parent::div/following-sibling::div");
	By passwordInput = By.xpath("//*[contains(text(),'Password')]/ancestor::div[contains(@class,'user-password-cell')]//div/following-sibling::div");
	By confirmPasswordInput = By.xpath("//*[contains(text(),'Confirm Password')]/parent::div/following-sibling::div");
	By saveButton = By.xpath("//*[@class='oxd-form-actions']//*[@type='submit']");
	
	 public void login(String username, String password, WebDriver driver) {
    	 System.out.println("Navigating to the login page: https://opensource-demo.orangehrmlive.com/");
         driver.get("https://opensource-demo.orangehrmlive.com/");
         WebActions.waitForPageToLoad(driver);
         app.sendKeys(usernameInput, username);
         app.sendKeys(passwordInputLogin, password);
         app.click(loginButton);
         app.waitForSeconds(5);
    }
	
		public void adminAddNewUser(String employeeName, String userName, String password) {
			app.click(adminMenu);
			app.click(addUserButton);
			app.click(userRoleDropDown);
			
			String userRole="Admin";
			if(userRole=="Admin") {
				 app.clickDownArrow(userRoleDropDown);
			}
			else if(userRole=="ESS") {
				app.clickDownArrow(userRoleDropDown);
				app.clickDownArrow(userRoleDropDown);
			}
	
			app.clickEnterKey(userRoleDropDown);
			app.sendKeys(employeeNameInput, employeeName);   //should write a method to fetch employee name
			app.click(statusDropDown);
			
			String userStatus="Enabled";
			if(userStatus=="Enabled") {
				 app.clickDownArrow(statusDropDown);
			}
			else if(userStatus=="Disabled") {
				app.clickDownArrow(statusDropDown);
				app.clickDownArrow(statusDropDown);
			}
			
			app.clickEnterKey(statusDropDown);
			app.sendKeys(userNameInput, userName);
			app.sendKeys(passwordInput, password);
			app.sendKeys(confirmPasswordInput, password);
			app.click(saveButton);                          // Check created user details in the records and print it
		}				
		
}
