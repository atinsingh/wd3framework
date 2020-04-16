package io.pragra.learning.framework.testcases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.pragra.learning.framework.config.Config;
import io.pragra.learning.framework.drivermanager.DriverManager;
import io.pragra.learning.framework.listener.ScreenshotListeners;
import io.pragra.learning.framework.reports.Reports;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(ScreenshotListeners.class)
public class DummyTest {
    ExtentReports reports = Reports.getReports();
    WebDriver driver = DriverManager.getDriver();
    ExtentTest test;

    @BeforeSuite
    public void setUp() {
        test = reports.createTest("Dummy test");
    }

    @Test(enabled = false)
    public void testProperty(){
        Object property = Config.getProperty("chrome.exe.path");
        System.out.println(property);
        Assert.assertEquals("C:\\Users\\harleen\\Desktop\\chromedriver_win32\\chromedriver.exe",(String)property);
    }

    @Test(enabled = false)
    public void nokeyProperty(){
        Object property = Config.getProperty("AwesomeWork");
        System.out.println(property);
    }
    @Test
    public void testZoomHome() throws InterruptedException {
        ExtentTest testZoom = reports.createTest("testZoom");
        driver.get("https://zoom.us");
        WebElement signin = driver.findElement(By.className("signin"));
        signin.click();
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("atin@pragra.co");
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("*********");

        Thread.sleep(1000);
        testZoom.log(Status.PASS, "Zoom Loaded Succesfully");
    }

    @Test
    public void testFacebook() {
        DriverManager.getDriver().get("https://facebook.com");
        test.log(Status.FAIL, "Facebook Loaded Succesfully");
        test.log(Status.WARNING, "Not VeryGood");
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        reports.flush();
       DriverManager.getDriver().quit();
    }
}
