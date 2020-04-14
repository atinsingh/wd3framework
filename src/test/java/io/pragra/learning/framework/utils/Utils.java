package io.pragra.learning.framework.utils;

import io.pragra.learning.framework.config.Config;
import io.pragra.learning.framework.drivermanager.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    // creating directory for screenshot
    // creating directory for reports
    // genrateing pattern or name for screenshot files
    // generating pattern of name for reports files

    private static boolean createDir(String type){
        if(type.equalsIgnoreCase("screenshot")){
            try {
                Path passPath = Paths.get((String) Config.getProperty("screenshot.pass.location"));
                if(!passPath.toFile().exists()){
                    Files.createDirectories(passPath);
                }
                Path failPath = Paths.get((String) Config.getProperty("screenshot.fail.location"));
                if(!failPath.toFile().exists()){
                    Files.createDirectories(failPath);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        return true;
    }


    private static String createTimeStamp(){
        SimpleDateFormat dateFormat = new SimpleDateFormat((String) Config.getProperty("screenshot.file.timestamp"));
        return dateFormat.format(new Date());
    }

    public static Path getScreenshotFile(String testCase, boolean pass){
        createDir("screenshot");
        String fileName = testCase+"_"+createTimeStamp()+"."+Config.getProperty("screenshot.file.extension");
        if(pass){
            return Paths.get((String) Config.getProperty("screenshot.pass.location"),fileName );
        }else {
            return Paths.get((String) Config.getProperty("screenshot.fail.location"),fileName );
        }
    }

    public static String captureScreenShot(String testCase, boolean pass){
        WebDriver driver = DriverManager.getDriver();
        String file ="";
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            file = Files.copy( screenshot.toPath() , getScreenshotFile(testCase,pass)).toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }





}
