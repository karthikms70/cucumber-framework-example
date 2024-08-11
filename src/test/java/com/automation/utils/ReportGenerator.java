package com.automation.utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ReportGenerator {
    static Scenario scenario;
    public static void init(Scenario scenario){
        ReportGenerator.scenario=scenario;
    }
    public static void attachScreenShot(){

    scenario.attach(takeScreenShot(),"image/png","Failed Test");

    }

    public static byte[] takeScreenShot(){
        TakesScreenshot ts=(TakesScreenshot) DriverManager.getDriver();
        byte[] ss= ts.getScreenshotAs(OutputType.BYTES);
        return ss;
    }
}
