Feature: verify account creation functionality
  Background:
    Given user open the website
    When login to the bank account with valid credentials
    Then verify user is on banking page

  Scenario: verify new checking account is created by user
    When user click on checking
    And select new checking
    And fill the details in checking account page
    When user click on submit button in the checking account page
    Then verify new checking account is created

  Scenario: verify new savings account is created by user
    When user click on savings
    And select new savings
    And fill the details in savings account page
    When user click on submit button in the savings account page
    Then verify new savings account is created with given data