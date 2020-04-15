package io.pragra.learning.framework.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentAventReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.pragra.learning.framework.utils.Utils;

public class Reports {
    private static Reports instance;
    private ExtentReports reports;

    private Reports(){
        reports = new ExtentReports();
        String str = Utils.getReportFileName();
        System.out.println(Utils.getReportFileName());
        reports.attachReporter(new ExtentHtmlReporter(Utils.getReportFileName()));
    }

    public static ExtentReports getReports() {
        if(instance==null){
            instance = new Reports();
        }
        return instance.reports;
    }
}
