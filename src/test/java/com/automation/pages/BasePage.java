package com.automation.pages;

import com.automation.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;

    public BasePage(){
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);

    }

    public boolean isPresent(WebElement wb){

        try {
            return wb.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

}
