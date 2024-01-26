package ParaBank.PO;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import ParaBank.utils.WebActions;

public class AdminOrgLocationPage {
	public WebDriver localDriver;
	private final WebActions app;

		public AdminOrgLocationPage(WebDriver driver) {
			localDriver=driver;
		    PageFactory.initElements(driver, this);
		    this.app = new WebActions(driver);
		}
		
		By usernameInput = By.name("username");
		By passwordInputLogin = By.name("password");
		By loginButton = By.xpath("//*[text()=' Login ']");	
		
		By adminMenu = By.xpath("//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Admin']");
		By organization = By.xpath("//*[contains(text(),'Organization ')]");
		By location = By.xpath("//*[contains(text(),'Locations')]");
		By recordsCount = By.xpath("//*[@class='oxd-text oxd-text--span']/parent::div");
		By addButton = By.xpath("//*[@class='oxd-icon bi-plus oxd-button-icon']");
		By addLocationPage = By.xpath("//*[@class='oxd-text oxd-text--h6 orangehrm-main-title']");
		By nameInput = By.xpath("//*[contains(text(),'Name')]/parent::div/following-sibling::div");
		By cityInput = By.xpath("//*[contains(text(),'City')]/parent::div/following-sibling::div");
		By pincodeInput = By.xpath("//*[contains(text(),'Zip/Postal Code')]/parent::div/following-sibling::div");
		By phoneNumberInput = By.xpath("//*[contains(text(),'Phone')]/parent::div/following-sibling::div");
		By addressInput = By.xpath("//*[contains(text(),'Address')]/parent::div/following-sibling::div");
		By stateInput = By.xpath("//*[contains(text(),'State/Province')]/parent::div/following-sibling::div");
		By countryDropdown = By.xpath("//*[contains(text(),'-- Select --')]");
		By save = By.xpath("//*[@type='submit']");
		
		 public void login(String username, String password, WebDriver driver) {
	    	 System.out.println("Navigating to the login page: https://opensource-demo.orangehrmlive.com/");
	         driver.get("https://opensource-demo.orangehrmlive.com/");
	         WebActions.waitForPageToLoad(driver);
	         app.sendKeys(usernameInput, username);
	         app.sendKeys(passwordInputLogin, password);
	         app.click(loginButton);
	         app.waitForSeconds(5);
	    }
		 
		public void adminOrgLocationPage() {
			app.click(adminMenu);
			app.waitForSeconds(5);
			app.click(organization);
			app.click(location);
			String totalRecords = app.getText(recordsCount);
			System.out.println("Total records found are "+totalRecords);
			app.click(addButton);
//			String selectededPage = app.getText(addLocationPage);
//			System.out.println("Selected Page is "+selectededPage);
			app.sendKeys(nameInput, "Gachibowli");
			app.sendKeys(cityInput, "Hyderabad");
			app.sendKeys(pincodeInput, "500032");
			app.sendKeys(phoneNumberInput, "9876543210");
			app.sendKeys(addressInput, "AMB Road");
			app.sendKeys(stateInput, "Telangana");
		
			 String requiredCountry="Albania";
			if(requiredCountry=="Albania") {
				app.clickDownArrow(countryDropdown);
			}
			
			app.click(save);
			app.waitForSeconds(5);
			
		}

		
		
}
