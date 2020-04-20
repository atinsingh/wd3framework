package io.pragra.learning.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LiveTrainingPage {
    WebDriver driver;

    public LiveTrainingPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
}
