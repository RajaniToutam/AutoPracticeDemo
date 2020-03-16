package LoginPO;

import SetUp.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPO extends BasePage {

    public LoginPO(WebDriver driver) {
        super(driver);
    }
    ////////////Locator's////////////////////
    public By Email_xpath = By.xpath("//input[@id = 'email_create']");
    public By SubmitBtn_xpath = By.xpath("//button[@id = 'SubmitCreate']");
    public By FirstName_xpath = By.xpath("//input[@id = 'customer_firstname']");
    public By LastName_xpath = By.xpath("//input[@id = 'customer_lastname']");
    public By Email1_xpath = By.xpath("//input[@id = 'email']");
    public By Password_xpath = By.xpath("//input[@id = 'passwd']");
    public By DayDrpDw_xpath = By.xpath("//select[@id = 'days']");
    public By MonthDrpDw_xpath = By.xpath("//select[@id = 'months']");
    public By YearDrpDw_xpath = By.xpath("//select[@id = 'years']");
    public By FirstName1_xpath = By.xpath("//input[@id = 'firstname']");
    public By LastName1_xpath = By.xpath("//input[@id = 'lastname']");
    public By Comapny_xpath = By.xpath("//input[@id = 'company']");
    public By Address_xpath = By.xpath("//input[@id = 'address1']");
    public By City_xpath = By.xpath("//input[@id = 'city']");
    public By State_xpath = By.xpath("//select[@id = 'id_state']");
    public By Country_xpath = By.xpath("//select[@id = 'id_country']");
    public By HPhone_xpath = By.xpath("//input[@id = 'phone']");
    public By MPhone_xpath = By.xpath("//input[@id = 'phone_mobile']");
    public By Alias_xpath = By.xpath("//input[@id = 'alias']");
    public By SubmitACC_xpath = By.xpath("//button[@id = 'submitAccount']");



    public boolean enterEmail(String Email) {
        try {

            WebElement enterEmail = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Email_xpath));
            enterEmail.sendKeys(Email);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean ClickSubmitBtn() {
        try {

            WebElement ClickSubmitBtn = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(SubmitBtn_xpath));
            //clickAddEmployees.getAttribute("title");
            ClickSubmitBtn.click();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            return true;
        } catch (Exception e) {
            return false;
        }
    }




//a[text() = 'Women']

//raj=2020

}