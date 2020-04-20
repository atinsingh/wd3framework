package io.pragra.learning.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RoomsWorkspacePage {
    private WebDriver driver;
    WebDriverWait wait;

    public RoomsWorkspacePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver,this);
    }
}
