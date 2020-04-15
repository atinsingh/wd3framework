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

    public TopNavbar(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public DemoPage clickOnRequestDemo(){
        this.requstDemo.click();
        return new DemoPage(driver);
    }

    public DownloadPage clickOnDown(){
        Actions actions = new Actions(driver);
        actions.moveToElement(resources).moveToElement(download).click().build().perform();
        return new DownloadPage(driver);
    }
}
