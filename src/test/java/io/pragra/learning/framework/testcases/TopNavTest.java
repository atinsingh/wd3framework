package io.pragra.learning.framework.testcases;

import io.pragra.learning.framework.drivermanager.DriverManager;
import io.pragra.learning.framework.pages.*;
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
    public void testMainNav(){

    }
    //Test pages-Second Level from Resources
    @Test
    public void testDownload() {
        DownloadPage downloadPage = topNavbar.clickOnDown();
        WebElement downloadMsg = downloadPage.getDownloadMsg();
        Assert.assertEquals("Download Center",downloadMsg.getText());
    }

    @Test
    public void testResources(){
//        VideoTutorialPage videoPage =topNavbar.clickOnVideoTutorial();
//        LiveTrainingPage livePage =topNavbar.clickOnLiveTraining();
//        WebinarsEventsPage webinarPage =topNavbar.clickOnWebinarsEvents();
//        ZoomBlogPage zoomPage=topNavbar.clickOnZoomBlog();
//        FAQPage faqPage=topNavbar.clickOnFAQ();
//        PrivacySecurityPage privacyPage=topNavbar.clickOnPrivacySecurity();
        SecurityResourcePage securityPage=topNavbar.clickOnSecurityResource();
    }
}
