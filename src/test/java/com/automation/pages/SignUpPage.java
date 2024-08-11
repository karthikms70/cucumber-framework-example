package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class SignUpPage extends BasePage{

    @FindBy(partialLinkText = "Sign in")
    WebElement signIn;
    @FindBy(id="title")
    WebElement title;
    @FindBy(id="firstName")
    WebElement firstName;
    @FindBy(id="lastName")
    WebElement lastName;
    @FindBy(xpath="//input[@value='M']")
    WebElement gen;
    @FindBy(id="dob")
    WebElement dob;
    @FindBy(id="ssn")
    WebElement ssn;
    @FindBy(id="emailAddress")
    WebElement email;
    @FindBy(id="password")
    WebElement passWrd;
    @FindBy(id="confirmPassword")
    WebElement cnfPssWrd;
    @FindBy(css = "button")
    WebElement btn;

    @FindBy(id = "address")
    WebElement adrs;
    @FindBy(id = "locality")
    WebElement local;
    @FindBy(id = "region")
    WebElement reg;
    @FindBy(id = "postalCode")
    WebElement pcode;
    @FindBy(id = "country")
    WebElement cnty;
    @FindBy(id = "homePhone")
    WebElement hphn;
    @FindBy(id = "mobilePhone")
    WebElement mphn;
    @FindBy(id = "agree-terms")
    WebElement agrTerm;
    @FindBy(css = "button")
    WebElement rebtn;

    Random rd=new Random();
    public boolean verifyPageIsDisplayed() {
       return isPresent(signIn);
    }

    public void createAccount(String firstName,String lastName,
                              String dob,String ssn,
                              String email,String pass,
                              String adrs,String loc,
                              String reg,String code,
                              String cnty,String hmphn,
                              String mbphn) throws InterruptedException {

        int min = 100000000; // Minimum 9-digit number
        int max = 1000000000;

      //  int randomNumber = random.nextInt(max - min) + min;
        title.click();
        Select sl=new Select(title);
        sl.selectByValue("Mr.");
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        gen.click();
        this.dob.sendKeys(dob);
        this.ssn.sendKeys(ssn);
        this.email.sendKeys(email);
        passWrd.sendKeys(pass);
        cnfPssWrd.sendKeys(pass);
        btn.click();
        Thread.sleep(2000);
        this.adrs.sendKeys(adrs);
        local.sendKeys(loc);
        this.reg.sendKeys(reg);
        pcode.sendKeys(code);
        this.cnty.sendKeys(cnty);
        hphn.sendKeys(hmphn);
        mphn.sendKeys(mbphn);
        agrTerm.click();
        rebtn.click();


    }
}
