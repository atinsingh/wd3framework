package io.pragra.learning.framework.testcases;

import io.pragra.learning.framework.drivermanager.DriverManager;
import io.pragra.learning.framework.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MainNavbarTest {
    WebDriver driver = DriverManager.getDriver();
    MainNavbar mainNavbar;

    @BeforeSuite
    public void setup(){
        driver.get("https://zoom.us");
        mainNavbar =new MainNavbar(driver);
    }

    // Test Pages -MainNav bar menu
    @Test
    public void testMainNav(){
        PlansPricingPage plansPricing = mainNavbar.clickOnPlansPricing();
//        ContactsPage contacts = mainNavbar.clickOnContactSales();
//        JoinMeetingPage joinMeeting =mainNavbar.clickOnJoinMeeting();
//        HostMeetingPage hostMeeting =mainNavbar.clickOnHostMeeting();
//        SigninPage signIn =mainNavbar.clickOnSignin();
       SignupFreePage signupFree=mainNavbar.clickOnSignupFree();
        }

    //test pages-Second Level from Solutions
    @Test
    public void testSolutions(){
       // MeetingsChatPage meetingsChat =mainNavbar.clickOnMeetingChat();
       // RoomsWorkspacePage roomsworkspace =mainNavbar.clickOnRoomWorkspace();
       // PhoneSystemPage phonesystem =mainNavbar.clickOnPhoneSystem();
        //VideoWebinarsPage videowebinar =mainNavbar.clickOnVideoWebinars();
       // AppMarketPage appmarket =mainNavbar.clickOnAppMarket();
      //  EducationPage education =mainNavbar.clickOnEducation();
      //  FinancialServicesPage financialservices =mainNavbar.clickOnFinancialServices();
       // GovernmentPage govt =mainNavbar.clickOnGovernment();
       // HealthcarePage healthcare =mainNavbar.clickOnHealthcare();
       // ReadBlogPage readBlog =mainNavbar.clickOnReadBlog();


    }
}
