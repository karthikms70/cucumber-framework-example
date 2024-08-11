package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(linkText  = "Sign Up Here")
    WebElement signUp;
    @FindBy(xpath = "//div/span[text()='Success']")
    WebElement success;

    @FindBy(id = "username")
    WebElement username;
    @FindBy(id="password")
    WebElement pass;

    @FindBy(id="submit")
    WebElement btn;

    public void openWebsite() {
        driver.get("https://dbank-qa.wedevx.co/bank/login");
    }

    public void clickOnSignUp() {
        signUp.click();
    }


    public boolean verifyReg() {
        return isPresent(success);
    }

//    public void doLogin() {
//
//        pass.sendKeys(ConfigReader.getConfigValue("password"));
//        btn.click();
//    }

    public void signIn() {
        username.clear();
        username.sendKeys(ConfigReader.getConfigValue("email"));
        pass.sendKeys(ConfigReader.getConfigValue("password"));
        btn.click();

    }
}
