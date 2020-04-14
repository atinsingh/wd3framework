package io.pragra.learning.framework.drivermanager;

import io.pragra.learning.framework.config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Singleton class
public class DriverManager {
    private static DriverManager driverManager;
    private WebDriver webDriver;

    private DriverManager() {
        String browser = (String) Config.getProperty("browser");
        webDriver = initDriver(browser);
    }



    private WebDriver initDriver(String browser){
        if(browser.equalsIgnoreCase(BrowserType.CHROME)){
            System.setProperty((String) Config.getProperty("chrome.property"), (String) Config.getProperty("chrome.exe.path"));
            return new ChromeDriver();
        }else if(browser.equalsIgnoreCase(BrowserType.FIREFOX)){
            System.setProperty((String) Config.getProperty("firefox.property"), (String) Config.getProperty("firefox.exe.path"));
            return new FirefoxDriver();
//        }else if(browser.equalsIgnoreCase(BroswerType.SAFARI)){
//            System.setProperty((String) Config.getProperty("safari.property"), (String) Config.getProperty("safari.exe.path"));
//            return new SafariDriver();
//        }else if(browser.equalsIgnoreCase(BroswerType.EDGE)){
//
//        }else if(browser.equalsIgnoreCase(BroswerType.IE)){

        }else {
            System.setProperty((String) Config.getProperty("chrome.property"), (String) Config.getProperty("chrome.exe.path"));
            return new ChromeDriver();
        }
    }

    public static WebDriver getDriver(){
        if(driverManager==null){
            driverManager = new DriverManager();
        }
        return driverManager.webDriver;
    }
}
