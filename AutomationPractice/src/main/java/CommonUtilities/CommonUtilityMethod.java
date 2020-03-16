package CommonUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonUtilityMethod {

    public WebDriver driver;

    public CommonUtilityMethod(WebDriver driver) {
        this.driver = driver;
    }


    public boolean enterTextOnDesiredArea(By by, String data) {
        try {
            Thread.sleep(3000);
            WebElement generic_WebL = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            if (generic_WebL.isDisplayed()) {
                generic_WebL.clear();
                generic_WebL.sendKeys(data);
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean clickDesiredLink(By by) {
        try {
            Thread.sleep(2000);
            WebElement generic_WebL = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            generic_WebL.getAttribute("title");
            generic_WebL.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean clickOnLinkOrButton(By by) {
        try {

            WebElement generic_WebL = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            generic_WebL.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean selectFromDropDown(By by, String value) {
        try {
            Thread.sleep(1000);
            Select selectRule = new Select((new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(by)));
            selectRule.selectByVisibleText(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean verifyElementIsVisible(By webElement) {
        try {

            Thread.sleep(3000);
            WebElement generic_WebL = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(webElement));
            if (generic_WebL.isDisplayed()) {
                //  generic_WebL.click();
                return true;
            } return false;

        } catch (Exception e) {
            return false;
        }
    }
}



