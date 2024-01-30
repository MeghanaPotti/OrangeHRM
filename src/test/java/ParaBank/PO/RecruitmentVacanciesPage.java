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
		
	By recruitmentMenu = By.xpath("By adminMenu = By.xpath(\"//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Admin']\");");	
	By vacanciesFilter = By.xpath("//*[contains(text(),'Vacancies')]");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
