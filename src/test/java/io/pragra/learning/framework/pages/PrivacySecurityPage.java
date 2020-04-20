package io.pragra.learning.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PrivacySecurityPage {
    WebDriver driver;

    public PrivacySecurityPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
}
