package ParaBank.utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public WebActions(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
    }

    public void click(By locator) {
        WebElement element = waitUntilClickable(locator);
        element.click();
        System.out.println("clicked on "+locator);
    }

    public void sendKeys(By locator, String text) {
        WebElement element = waitUntilVisible(locator);
        element.sendKeys(text);
        System.out.println("Entered text is "+text);
    }
    
    public String getText(By locator) {
        WebElement element = waitUntilVisible(locator);
        System.out.println("Fetched text is "+element.getText());
        return element.getText();
    }

    public String getAttributeValue(By locator, String attributeName) {
        WebElement element = waitUntilVisible(locator);
        return element.getAttribute(attributeName);
    }
    
    public String getCssValue(By locator, String propertyName) {
        WebElement element = waitUntilVisible(locator);
        return element.getCssValue(propertyName);
    }
    
    public void clickDownArrow(By locator) {
    	 WebElement element = waitUntilVisible(locator);
    	 element.sendKeys(Keys.ARROW_DOWN);
    }
    
    public void clickEnterKey(By locator) {
   	 WebElement element = waitUntilVisible(locator);
   	 element.sendKeys(Keys.ENTER);
   }
    
    public void waitForVisibilityOfElement(By locator) {
        waitUntilVisible(locator);
    }

    public void waitForElementToBeClickable(By locator) {
        waitUntilClickable(locator);
    }

    private WebElement waitUntilVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    private WebElement waitUntilClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForPageToLoad(WebDriver driver) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver webDriver) {
                return ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete");
            }
        });
    }

    public void waitForSeconds(int seconds) {
	    try {
	        Thread.sleep(seconds*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
    
}

