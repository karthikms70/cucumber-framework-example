package com.automation.steps;

import com.automation.pages.BankingPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class BankingStep {
    BankingPage bkp=new BankingPage();

    @Then("verify user is on banking page")
    public void verify_user_is_on_banking_page() {
        assertTrue( bkp.verifyPageIsDispalyed());
    }

    //checking
    @When("user click on checking")
    public void user_click_on_checking() {
        bkp.clickOnChecking();
    }

    @When("select new checking")
    public void select_new_checking() {
        bkp.newChecking();
    }

    @When("fill the details in checking account page")
    public void fill_the_details() {
        bkp.createCheckingAcc();
    }

    @When("user click on submit button in the checking account page")
    public void user_click_on_submit() {
        bkp.clickOnSubmit();
    }

    @Then("verify new checking account is created")
    public void verify_new_checking_account_is_created() {
        assertTrue(bkp.verifyCheckingAccCreated());
    }

    //savings
    @When("user click on savings")
    public void user_click_on_savings() {
        bkp.clickSavings();
    }

    @When("select new savings")
    public void select_new_savings() {
        bkp.selectNewSavingsAcc();
    }

    @When("fill the details in savings account page")
    public void fill_the_details_in_savings_account_page() {
        bkp.createSavingsAcc();
    }

    @When("user click on submit button in the savings account page")
    public void user_click_on_submit_button_in_the_savings_account_page() {
        bkp.clickOnSavingsSubmit();
    }

    @Then("verify new savings account is created with given data")
    public void verify_new_savings_account_is_created_with_given_data() {
        bkp.verifySavingsAccCreated();
    }


}
