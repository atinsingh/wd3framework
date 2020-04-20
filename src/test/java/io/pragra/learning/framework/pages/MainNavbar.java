package io.pragra.learning.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainNavbar {
    WebDriver driver;

    @FindBy(xpath="//div//li[@id='solution']")
    private WebElement solutions;

    @FindBy(xpath="//div[@id='navbar']//li/a[@class='top-pricing']")
    private WebElement planspricing;

    @FindBy(xpath="//div[@id='navbar']//li/a[@class='top-contactsales top-sales']")
    private WebElement contactsales;

    @FindBy(xpath="//div[@id='navbar']//li/a[@id='btnJoinMeeting']")
    private WebElement joinameeting;

    @FindBy(xpath="//div[@id='dropdown-hostmeeting']/a[@id='btnHostMeeting']")
    private WebElement hostameeting;

    @FindBy(xpath="//div[@id='navbar']//li[@class='signin']/a")
    private WebElement signin;

    @FindBy(xpath="//div[@id='signupfree']/a")
    private WebElement signupfree;

    // second level from solutions

    @FindBy(xpath="//li[@id='first-col-nav']/div//li[1]/a")
    private WebElement meetingschat;

    @FindBy(xpath="//li[@id='first-col-nav']/div//li[2]/a")
    private WebElement roomsworkspace;

    @FindBy(xpath="//li[@id='first-col-nav']/div//li[3]/a")
    private WebElement phonesystem;

    @FindBy(xpath="//li[@id='first-col-nav']/div//li[4]/a")
    private WebElement videowebinar;

    @FindBy(xpath="//li[@id='first-col-nav']/div//li[5]/a")
    private WebElement appmarket;

    @FindBy(xpath="//li[@id='second-col-nav']/div[@class='textwidget']//li[1]/a")
    private WebElement education;

    @FindBy(xpath="//li[@id='second-col-nav']/div[@class='textwidget']//li[2]/a")
    private WebElement financialservices;

    @FindBy(xpath="//li[@id='second-col-nav']/div[@class='textwidget']//li[3]/a")
    private WebElement government;

    @FindBy(xpath="//li[@id='second-col-nav']/div[@class='textwidget']//li[4]/a")
    private WebElement healthcare;

    @FindBy(xpath="//li[@id='promo-col-nav']/div//a")
    private WebElement readblog;

    // On click MainNav bar menu

    public MainNavbar(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
    public PlansPricingPage clickOnPlansPricing(){
        this.planspricing.click();
        return new PlansPricingPage(driver);
    }
    public ContactsPage clickOnContactSales(){
        this.contactsales.click();
        return new ContactsPage(driver);
    }
    public JoinMeetingPage clickOnJoinMeeting(){
        this.joinameeting.click();
        return new JoinMeetingPage(driver);
    }
    public HostMeetingPage clickOnHostMeeting(){
        this.hostameeting.click();
        return new HostMeetingPage(driver);
    }
    public SigninPage clickOnSignin(){
        this.signin.click();
        return new SigninPage(driver);
    }
    public SignupFreePage clickOnSignupFree(){
        this.signupfree.click();
        return new SignupFreePage(driver);
    }
    // On click -second level from solutions

    public MeetingsChatPage clickOnMeetingChat(){
        Actions actions = new Actions(driver);
        actions.moveToElement(solutions).moveToElement(meetingschat).click().build().perform();
        return new MeetingsChatPage(driver);
    }
    public RoomsWorkspacePage clickOnRoomWorkspace(){
        Actions actions =new Actions(driver);
        actions.moveToElement(solutions).moveToElement(roomsworkspace).click().build().perform();
        return new RoomsWorkspacePage(driver);
    }
    public PhoneSystemPage clickOnPhoneSystem(){
        Actions actions =new Actions(driver);
        actions.moveToElement(solutions).moveToElement(phonesystem).click().build().perform();
        return new PhoneSystemPage(driver);
    }
    public VideoWebinarsPage clickOnVideoWebinars(){
        Actions actions =new Actions(driver);
        actions.moveToElement(solutions).moveToElement(videowebinar).click().build().perform();
        return new VideoWebinarsPage(driver);
    }
    public AppMarketPage clickOnAppMarket(){
        Actions actions =new Actions(driver);
        actions.moveToElement(solutions).moveToElement(appmarket).click().build().perform();
        return new AppMarketPage(driver);
    }
    public EducationPage clickOnEducation(){
        Actions actions =new Actions(driver);
        actions.moveToElement(solutions).moveToElement(education).click().build().perform();
        return new EducationPage(driver);
    }
    public FinancialServicesPage clickOnFinancialServices(){
        Actions actions =new Actions(driver);
        actions.moveToElement(solutions).moveToElement(financialservices).click().build().perform();
        return new FinancialServicesPage(driver);
    }
    public GovernmentPage clickOnGovernment(){
        Actions actions =new Actions(driver);
        actions.moveToElement(solutions).moveToElement(government).click().build().perform();
        return new GovernmentPage(driver);
    }
    public HealthcarePage clickOnHealthcare(){
        Actions actions =new Actions(driver);
        actions.moveToElement(solutions).moveToElement(healthcare).click().build().perform();
        return new HealthcarePage(driver);
    }
    public ReadBlogPage clickOnReadBlog(){
        Actions actions =new Actions(driver);
        actions.moveToElement(solutions).moveToElement(readblog).click().build().perform();
        return new ReadBlogPage(driver);
    }

}
