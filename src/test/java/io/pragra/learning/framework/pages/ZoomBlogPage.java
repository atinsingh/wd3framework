package io.pragra.learning.framework.pages;

import io.pragra.learning.framework.drivermanager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ZoomBlogPage {
    WebDriver driver;

    public ZoomBlogPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

}