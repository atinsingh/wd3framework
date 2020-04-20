package io.pragra.learning.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HostMeetingPage {
    WebDriver driver;

    public HostMeetingPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
}
