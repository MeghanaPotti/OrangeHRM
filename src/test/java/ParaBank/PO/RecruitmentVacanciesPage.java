package ParaBank.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ParaBank.utils.WebActions;

public class RecruitmentVacanciesPage {
	
	public WebDriver localDriver;
	private final WebActions app;

		public RecruitmentVacanciesPage(WebDriver driver) {
			localDriver=driver;
		    PageFactory.initElements(driver, this);
		    this.app = new WebActions(driver);
		}
		
	By usernameInput = By.name("username");
	By passwordInputLogin = By.name("password");
	By loginButton = By.xpath("//*[text()=' Login ']");		
		
	By recruitmentMenu = By.xpath("//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Recruitment']");	
	By vacanciesFilter = By.xpath("//*[contains(text(),'Vacancies')]");
	
//	By jobTitleDropdown = By.xpath("//*[contains(text(),'Job Title')]/parent::div/following-sibling::div//*[@class='oxd-select-text--after']");
	By jobTitleDropdown = By.xpath("//*[contains(text(),'Job Title')]/ancestor::div[contains(@class,'oxd-input-group oxd-input-field-bottom-space')]//*[@class='oxd-select-text--after']");
	By vacancyDropdown = By.xpath("//*[contains(text(),'Vacancy')]/ancestor::div[contains(@class,'oxd-input-group oxd-input-field-bottom-space')]//*[@class='oxd-select-text--after']");
	By hiringManagerDropdown = By.xpath("//*[contains(text(),'Hiring Manager')]/ancestor::div[contains(@class,'oxd-input-group oxd-input-field-bottom-space')]//*[@class='oxd-select-text--after']");
	By statusDropdown = By.xpath("//*[contains(text(),'Status')]/ancestor::div[contains(@class,'oxd-input-group oxd-input-field-bottom-space')]//*[@class='oxd-select-text--after']");
	By searchButton = By.xpath("//*[@type='submit']");
	By recordsFound = By.xpath("//*[@class='oxd-text oxd-text--span']/parent::div");	
	
	public void login(String username, String password, WebDriver driver) {
   	 System.out.println("Navigating to the login page: https://opensource-demo.orangehrmlive.com/");
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebActions.waitForPageToLoad(driver);
        app.sendKeys(usernameInput, username);
        app.sendKeys(passwordInputLogin, password);
        app.click(loginButton);
        app.waitForSeconds(5);
   }
		
	public void validateRecruitmentVacancies() {
		
		app.click(recruitmentMenu);
		app.click(vacanciesFilter);
		
		app.click(jobTitleDropdown);
		String jobTitle="Customer Success Manager";
		if(jobTitle=="Account Assistant") {
			app.clickDownArrow(jobTitleDropdown);
		}
		else if(jobTitle=="Automation Test Engineer") {
			app.clickDownArrow(jobTitleDropdown);
			app.clickDownArrow(jobTitleDropdown);
		}
		else if(jobTitle=="Cheif Executive Officer") {
			app.clickDownArrow(jobTitleDropdown);
			app.clickDownArrow(jobTitleDropdown);
			app.clickDownArrow(jobTitleDropdown);
		}
		else if(jobTitle=="Cheif Financial Officer") {
			app.clickDownArrow(jobTitleDropdown);
			app.clickDownArrow(jobTitleDropdown);
			app.clickDownArrow(jobTitleDropdown);
			app.clickDownArrow(jobTitleDropdown);
		}
		else if(jobTitle=="Cheif Technical Officer") {
			app.clickDownArrow(jobTitleDropdown);
			app.clickDownArrow(jobTitleDropdown);
			app.clickDownArrow(jobTitleDropdown);
			app.clickDownArrow(jobTitleDropdown);
			app.clickDownArrow(jobTitleDropdown);
		}
		else if(jobTitle=="Content Specialist") {
			app.clickDownArrow(jobTitleDropdown);
			app.clickDownArrow(jobTitleDropdown);
			app.clickDownArrow(jobTitleDropdown);
			app.clickDownArrow(jobTitleDropdown);
			app.clickDownArrow(jobTitleDropdown);
			app.clickDownArrow(jobTitleDropdown);
		}
		else if(jobTitle=="Customer Success Manager") {
			app.clickDownArrow(jobTitleDropdown);
			app.clickDownArrow(jobTitleDropdown);
			app.clickDownArrow(jobTitleDropdown);
			app.clickDownArrow(jobTitleDropdown);
			app.clickDownArrow(jobTitleDropdown);
			app.clickDownArrow(jobTitleDropdown);
			app.clickDownArrow(jobTitleDropdown);
		}
		app.clickEnterKey(jobTitleDropdown);
		
		app.click(vacancyDropdown);
		String vacancy = "Senior Support Specialist";
		if(vacancy=="Associate IT Manager") {
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
		}
		else if(vacancy=="Junior Account Assistant") {
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
		}
		else if(vacancy=="Payroll Administrator") {
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
		}
		else if(vacancy=="Sales Representative") {
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
		}
		else if(vacancy=="Senior QA Lead") {
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
		}
		else if(vacancy=="Senior Support Specialist") {
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
		}
		else if(vacancy=="Software Engineer") {
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
			app.clickDownArrow(vacancyDropdown);
		}
		app.clickEnterKey(vacancyDropdown);
		
		app.click(hiringManagerDropdown);
		String hiringManager="Dominic Chase";
		if(hiringManager=="Odis Adalwin") {
			app.clickDownArrow(hiringManagerDropdown);
		}
		else if(hiringManager=="Linda Anderson") {
			app.clickDownArrow(hiringManagerDropdown);
			app.clickDownArrow(hiringManagerDropdown);
		}
		else if(hiringManager=="Dominic Chase") {
			app.clickDownArrow(hiringManagerDropdown);
			app.clickDownArrow(hiringManagerDropdown);
			app.clickDownArrow(hiringManagerDropdown);
		}
		else if(hiringManager=="Paul Collings") {
			app.clickDownArrow(hiringManagerDropdown);
			app.clickDownArrow(hiringManagerDropdown);
			app.clickDownArrow(hiringManagerDropdown);
			app.clickDownArrow(hiringManagerDropdown);
		}
		else if(hiringManager=="Kevin Mathews") {
			app.clickDownArrow(hiringManagerDropdown);
			app.clickDownArrow(hiringManagerDropdown);
			app.clickDownArrow(hiringManagerDropdown);
			app.clickDownArrow(hiringManagerDropdown);
			app.clickDownArrow(hiringManagerDropdown);
		}
		app.clickEnterKey(hiringManagerDropdown);
		
		app.click(statusDropdown);
		String status="Active";
		if(status=="Active") {
			app.clickDownArrow(statusDropdown);
		}
		else if(status=="Closed") {
			app.clickDownArrow(statusDropdown);
			app.clickDownArrow(statusDropdown);
		}
		app.clickEnterKey(statusDropdown);
		
		app.click(searchButton);
		String totalRecords = app.getText(recordsFound);
		System.out.println("Total records found are "+totalRecords);
    	}	
		
}
