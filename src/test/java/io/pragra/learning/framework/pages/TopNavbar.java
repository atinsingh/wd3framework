package io.pragra.learning.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNavbar {
    WebDriver driver;

    @FindBy(css = "#black-topbar ul[role=menubar]>li:nth-child(1)")
    private WebElement requstDemo;

    @FindBy(css = "#black-topbar ul[role=menubar]>li:nth-child(2)")
    private WebElement one800;

    @FindBy(css = "#black-topbar ul[role=menubar]>li:nth-child(3)")
    private WebElement resources;

    @FindBy(css = "#black-topbar ul[role=menubar]>li:nth-child(4)")
    private WebElement support;

    // second level from resource

    @FindBy(css = "#resourcesDropdown>li:nth-child(1)")
    private WebElement download;
    @FindBy(css = "#resourcesDropdown>li:nth-child(3)")
    private WebElement videoTutorial;
    @FindBy(css = "#resourcesDropdown>li:nth-child(5)")
    private WebElement liveTraining;
    @FindBy(css = "#resourcesDropdown>li:nth-child(7)")
    private WebElement webinarsEvents;
    @FindBy(css = "#resourcesDropdown>li:nth-child(9)")
    private WebElement zoomBlog;
    @FindBy(css = "#resourcesDropdown>li:nth-child(11)")
    private WebElement FAQ;
    @FindBy(css = "#resourcesDropdown>li:nth-child(13)")
    private WebElement privacySecurity;
    @FindBy(css = "#resourcesDropdown>li:nth-child(15)")
    private WebElement securityResource;

    public TopNavbar(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public DemoPage clickOnRequestDemo(){
        this.requstDemo.click();
        return new DemoPage(driver);
    }

    // On click -second level from Resources

    public DownloadPage clickOnDown(){
        Actions actions = new Actions(driver);
        actions.moveToElement(resources).moveToElement(download).click().build().perform();
        return new DownloadPage(driver);
    }
    public VideoTutorialPage clickOnVideoTutorial(){
        Actions actions = new Actions(driver);
        actions.moveToElement(resources).moveToElement(videoTutorial).click().build().perform();
        return new VideoTutorialPage(driver);
    }
    public LiveTrainingPage clickOnLiveTraining(){
        Actions actions = new Actions(driver);
        actions.moveToElement(resources).moveToElement(liveTraining).click().build().perform();
        return new LiveTrainingPage(driver);
    }
    public WebinarsEventsPage clickOnWebinarsEvents(){
        Actions actions = new Actions(driver);
        actions.moveToElement(resources).moveToElement(webinarsEvents).click().build().perform();
        return new WebinarsEventsPage(driver);
    }
    public ZoomBlogPage clickOnZoomBlog(){
        Actions actions = new Actions(driver);
        actions.moveToElement(resources).moveToElement(zoomBlog).click().build().perform();
        return new ZoomBlogPage(driver);
    }
    public FAQPage clickOnFAQ(){
        Actions actions = new Actions(driver);
        actions.moveToElement(resources).moveToElement(FAQ).click().build().perform();
        return new FAQPage(driver);
    }
    public PrivacySecurityPage clickOnPrivacySecurity(){
        Actions actions = new Actions(driver);
        actions.moveToElement(resources).moveToElement(privacySecurity).click().build().perform();
        return new PrivacySecurityPage(driver);
    }
    public SecurityResourcePage clickOnSecurityResource(){
        Actions actions = new Actions(driver);
        actions.moveToElement(resources).moveToElement(securityResource).click().build().perform();
        return new SecurityResourcePage(driver);
    }



}
