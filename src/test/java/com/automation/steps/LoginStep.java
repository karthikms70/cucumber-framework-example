package com.automation.steps;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginStep {
    LoginPage lgp=new LoginPage();

    @Given("user open the website")
    public void user_open_the_website() {
        lgp.openWebsite();
    }

    @When("click on sign up from the login page")
    public void click_on_sign_up_from_the_login_page() {

        lgp.clickOnSignUp();

    }

    @Then("verify registration is successful")
    public void verify_registration_is_successful() {
        assertFalse(lgp.verifyReg());
    }

//    @When("login to the bank account")
//    public void login_to_the_bank_account() {
//        lgp.doLogin();
//    }

    @When("login to the bank account with valid credentials")
    public void loginToTheBankAccountWithValidCredentials() {
        lgp.signIn();
    }
}
