package ParaBank.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ParaBank.utils.WebActions;

public class AdminJobPage {

	public WebDriver localDriver;
	private final WebActions app;

		public AdminJobPage(WebDriver driver) {
			localDriver=driver;
		    PageFactory.initElements(driver, this);
		    this.app = new WebActions(driver);
		}

	By usernameInput = By.name("username");
	By passwordInputLogin = By.name("password");
	By loginButton = By.xpath("//*[text()=' Login ']");	
	
	By adminMenu = By.xpath("//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Admin']");	
	By jobFilter = By.xpath("//span[contains(text(),'Job ')]");
	By jobTitles = By.xpath("//*[contains(text(),'Job Titles')]");
	By recordsCount = By.xpath("//*[@class='orangehrm-header-container']//*[@class='oxd-icon bi-plus oxd-button-icon']");
	By addButton = By.xpath("//*[@class=\"orangehrm-header-container\"]//*[@class=\'oxd-icon bi-plus oxd-button-icon\']");
	By addJobTitlePage = By.xpath("//*[@class=\"oxd-text oxd-text--h6 orangehrm-main-title\" and text()='Add Job Title']");
	By jobTitle = By.xpath("//*[@class=\'oxd-form-row\']//*[@class=\'oxd-input oxd-input--active\']");
	By jobDescription = By.xpath("//*[@placeholder=\'Type description here\']");
	By saveButton = By.xpath("//*[@type='submit']");
	By seniorTester = By.xpath("//*[contains(text(),'Senior Analyst1')]");
	
	 public void login(String username, String password, WebDriver driver) {
    	 System.out.println("Navigating to the login page: https://opensource-demo.orangehrmlive.com/");
         driver.get("https://opensource-demo.orangehrmlive.com/");
         WebActions.waitForPageToLoad(driver);
         app.sendKeys(usernameInput, username);
         app.sendKeys(passwordInputLogin, password);
         app.click(loginButton);
         app.waitForSeconds(5);
    }
	 
	public void adminJob() {
		app.click(adminMenu);
		app.click(jobFilter);
		app.click(jobTitles);
		String totalRecords = app.getText(recordsCount);
		System.out.println("Total records founds are "+totalRecords);
		app.click(addButton);
		app.getText(addJobTitlePage);
		app.sendKeys(jobTitle, "Senior Analyst1");
		app.sendKeys(jobDescription, "Testing abcdefghijk");
		app.click(saveButton);
		app.waitForSeconds(5);
		String givenJobTitle = app.getText(seniorTester);
		System.out.println("Given Job Title is "+givenJobTitle);	
	}
	
}
