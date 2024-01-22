package ParaBank.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ParaBank.utils.WebActions;

public class LoginPage {

    private final WebDriver driver;
    private final WebActions webActions;

    // Locators
    private final By usernameInput = By.name("username");
    private final By passwordInput = By.name("password");
    private final By loginButton = By.xpath("//*[contains(@type,'submit')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.webActions = new WebActions(driver);
    }

    public void navigateToLoginPage() {
        System.out.println("Navigating to the login page: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void enterUsername(String username) {
        webActions.sendKeys(usernameInput, username);
        System.out.println("Entered username: " + username);
    }

    public void enterPassword(String password) {
        webActions.sendKeys(passwordInput, password);
        System.out.println("Entered password");
    }

    public void clickLoginButton() {
        webActions.click(loginButton);
        System.out.println("Clicked on the Login button");
    }

    public void login(String username, String password) {
        navigateToLoginPage();
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
        webActions.waitForSeconds(5);

    }
    
    public void validateLogin() {
		By dashboardText = By.xpath("//*[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\" and text()='Dashboard']");
		String actualText = webActions.getText(dashboardText);
		String expectedText = "Dashboard";
		
		if(actualText.equals(expectedText)) {
			System.out.println("Login successful");
		}
		else {
			System.out.println("Login failed, actual text is "+actualText+" but expected text is "+expectedText);
		}
	}

   }
