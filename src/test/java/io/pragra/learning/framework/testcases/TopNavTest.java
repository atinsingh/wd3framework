package io.pragra.learning.framework.testcases;

import io.pragra.learning.framework.drivermanager.DriverManager;
import io.pragra.learning.framework.pages.DownloadPage;
import io.pragra.learning.framework.pages.TopNavbar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TopNavTest {
    WebDriver driver = DriverManager.getDriver();
    TopNavbar topNavbar;
    DownloadPage page;
    @BeforeSuite
    public void setup(){
        driver.get("https://zoom.us");
        topNavbar = new TopNavbar(driver);
    }

    @Test
    public void testDownload() {
        DownloadPage downloadPage = topNavbar.clickOnDown();
        WebElement downloadMsg = downloadPage.getDownloadMsg();
        Assert.assertEquals("Download Center",downloadMsg.getText());
    }
}
