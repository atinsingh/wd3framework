package io.pragra.learning.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MeetingsChatPage {
    WebDriver driver;

    public MeetingsChatPage(WebDriver driver){
        this.driver =driver;
         PageFactory.initElements(driver,this);
    }
}
