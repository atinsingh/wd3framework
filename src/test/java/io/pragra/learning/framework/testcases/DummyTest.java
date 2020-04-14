package io.pragra.learning.framework.testcases;

import io.pragra.learning.framework.config.Config;
import io.pragra.learning.framework.drivermanager.DriverManager;
import io.pragra.learning.framework.listener.ScreenshotListeners;
import io.pragra.learning.framework.utils.Utils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ScreenshotListeners.class)
public class DummyTest {
    @Test(enabled = false)
    public void testProperty(){
        Object property = Config.getProperty("chrome.exe.path");
        System.out.println(property);
        Assert.assertEquals("/Users/atinsingh/Downloads/drivers/chromedriver",(String)property);
    }

    @Test(enabled = false)
    public void nokeyProperty(){
        Object property = Config.getProperty("AwesomeWork");
        System.out.println(property);
    }
    @Test
    public void testZoomHome() throws InterruptedException {
        DriverManager.getDriver().get("https://zoom.us");
        Thread.sleep(1000);
    }

    @Test
    public void testFacebook() {
        DriverManager.getDriver().get("https://facebook.com");
        Assert.fail();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
       DriverManager.getDriver().quit();
    }
}
