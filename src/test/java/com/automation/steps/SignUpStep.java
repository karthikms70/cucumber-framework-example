package com.automation.steps;

import com.automation.pages.SignUpPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class SignUpStep {
    SignUpPage snp=new SignUpPage();
    @Then("verify user is on sign up page")
    public void verify_user_is_on_sign_up_page() {
        assertTrue(snp.verifyPageIsDisplayed());
    }

    @When("create account for the new user")
    public void create_account_for_the_new_user() throws InterruptedException {
        snp.createAccount(ConfigReader.getConfigValue("firstName"),
                ConfigReader.getConfigValue("lastName"),
                ConfigReader.getConfigValue("dob"),
                ConfigReader.getConfigValue("ssn"),
                ConfigReader.getConfigValue("email"),
                ConfigReader.getConfigValue("password"),
                ConfigReader.getConfigValue("address"),
                ConfigReader.getConfigValue("loc"),
                ConfigReader.getConfigValue("reg"),
                ConfigReader.getConfigValue("code"),
                ConfigReader.getConfigValue("country"),
                ConfigReader.getConfigValue("hmphn"),
                ConfigReader.getConfigValue("mbphn")
                );
    }

}
