package io.pragra.learning.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DownloadPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(css = "#download_top>.container>h1")
    private WebElement downloadMsg;

    public DownloadPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver,this);
    }

    public WebElement getDownloadMsg() {
        downloadMsg = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#download_top>.container>h1")));
        return downloadMsg;
    }
}
