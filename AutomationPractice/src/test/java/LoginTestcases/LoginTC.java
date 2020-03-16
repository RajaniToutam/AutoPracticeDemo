package LoginTestcases;

import CommonUtilities.CommonUtilityMethod;
import LoginPO.LoginPO;
import SetUp.BaseTest;
import SetUp.BaseTest_auto;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTC {

    public LoginTC() {
    }

    public WebDriver driver = null;

    public void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //Get Method to open URL in specified browser
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

        // public LoginTC(WebDriver passDriver){ driver = passDriver;    }

        // @Test
        //public void LoginTC() {

            LoginPO loginPO_Obj = new LoginPO(driver);
            // CommonUtilityMethod CommonMethod_Obj = new CommonUtilityMethod(driver);

            //Enter emailID

            String Email = "TestEmail101";
            assertEquals(loginPO_Obj.enterEmail(Email), true, "Opps!! unable to enter email");
            //assertTrue(CommonMethod_Obj.enterTextOnDesiredArea(loginPO_Obj.Email_xpath, "Test123"), "Unable to enter first name");

            assertEquals(loginPO_Obj.ClickSubmitBtn(), true, "Opps!! unable to click submit");
        }
    }

