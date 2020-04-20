package io.pragra.learning.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FAQPage {
    WebDriver driver;

    public FAQPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
}
