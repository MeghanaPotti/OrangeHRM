package ParaBank.Tests;

import org.testng.annotations.Test;

import ParaBank.PO.RecruitmentVacanciesPage;
import ParaBank.utils.WebActions;

public class RecruitmentVacanciesTest extends LoginTest{

	@Test
	public void vacanciesSearch() {
		System.out.println("This is an vacancies search method");
		RecruitmentVacanciesPage vacanciesSearchObject = new RecruitmentVacanciesPage(driver);
		vacanciesSearchObject.login(userName, password, driver);
		vacanciesSearchObject.validateRecruitmentVacancies();
		WebActions.waitForPageToLoad(driver);
		captureScreenshot("vacanciesSearch");	
	}
	
}
