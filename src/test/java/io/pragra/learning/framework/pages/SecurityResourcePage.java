package io.pragra.learning.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SecurityResourcePage {
    WebDriver driver;

    public SecurityResourcePage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
}
