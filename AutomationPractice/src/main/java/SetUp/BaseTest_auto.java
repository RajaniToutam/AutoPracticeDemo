package SetUp;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static com.aventstack.extentreports.MediaEntityBuilder.createScreenCaptureFromPath;

;

public class BaseTest_auto {

    public WebDriver driver = null;
    public BaseTest_auto() {
    }

    public void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //Get Method to open URL in specified browser
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

 /*   @Parameters({"browserName", "url","localDriverPath"})
    @BeforeMethod(alwaysRun = true)
    public void launchBrowser(@Optional("chrome") String browserName, @Optional("http://automationpractice.com/index.php?controller=authentication&back=my-account") String url, @Optional("C:\\chromedriver_win32\\chromedriver.exe") String localDriverPath) throws IOException, InterruptedException{
        this.getLocalDriver(browserName, localDriverPath);


        this.driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
        this.driver.manage().window().maximize();
        this.driver.get(url);
    }

    public WebDriver getLocalDriver(String browserName, String localDriverPath) {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", localDriverPath);
            this.driver = new ChromeDriver();
            this.driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", localDriverPath);
            this.driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("ie")) {
            this.driver = new InternetExplorerDriver();
        }

        return this.driver;
    }
*/
   // @AfterClass(alwaysRun = true)
    //public void terminateReport() {
        driver.quit();

    }




}