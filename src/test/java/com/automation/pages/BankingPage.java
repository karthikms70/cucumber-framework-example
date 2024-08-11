package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankingPage extends  BasePage{


    @FindBy(id="page-title")
    WebElement dashboard;

    @FindBy(id="checking-menu")
    WebElement chkMenu;

    @FindBy(id="new-checking-menu-item")
    WebElement newChk;

    @FindBy(id="Standard Checking")
    WebElement stdChk;

    @FindBy(id="Individual")
    WebElement individual;

    @FindBy(id="name")
    WebElement accName;

    @FindBy(id="openingBalance")
    WebElement opBala;


    @FindBy(id="newCheckingSubmit")
    WebElement subBtn;


    @FindBy(xpath = "//div[@id='new-account-conf-alert']/span[text()='Confirmation']")
    WebElement cnfrm;



    @FindBy(id="savings-menu")
    WebElement savBtn;

    @FindBy(id="new-savings-menu-item")
    WebElement newSav;

    @FindBy(id="Savings")
    WebElement savings;

    @FindBy(id="newSavingsSubmit")
    WebElement savSub;
//
//    @FindBy(id="newCheckingSubmit")
//    WebElement subBtn;
    public boolean verifyPageIsDispalyed() {
        return isPresent(dashboard);
    }


    public void clickOnChecking() {
        chkMenu.click();
    }

    public void newChecking() {
        newChk.click();
    }

    public void createCheckingAcc() {
        stdChk.click();
        individual.click();
        accName.sendKeys("Short Term");
        opBala.sendKeys("20000");

    }

    public void clickOnSubmit() {
        subBtn.click();
    }

    public boolean verifyCheckingAccCreated() {
        return isPresent(cnfrm);
    }


    public void clickSavings() {
        savBtn.click();
    }

    public void selectNewSavingsAcc() {
        newSav.click();
    }

    public void createSavingsAcc() {
        savings.click();
        individual.click();
        accName.sendKeys("abc");
        opBala.sendKeys("50000");
        savSub.click();
    }

    public void clickOnSavingsSubmit() {
    }

    public void verifySavingsAccCreated() {
    }
}
