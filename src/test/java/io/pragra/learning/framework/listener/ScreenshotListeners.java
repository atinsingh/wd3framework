package io.pragra.learning.framework.listener;

import io.pragra.learning.framework.config.Config;
import io.pragra.learning.framework.utils.Utils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        String type = (String) Config.getProperty("screenshot.type");
        System.out.println(type);
        if(type.trim().equalsIgnoreCase("all")||type.trim().equalsIgnoreCase("pass")){
            System.out.println("capturing screen");
            Utils.captureScreenShot(iTestResult.getName(),true);
        }


    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        String type = (String) Config.getProperty("screenshot.type");
        if(type.trim().equalsIgnoreCase("all")||type.trim().equalsIgnoreCase("fail")){
            Utils.captureScreenShot(iTestResult.getName(),false);
        }
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
