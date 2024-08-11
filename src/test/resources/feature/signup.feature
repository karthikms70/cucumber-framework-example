Feature: create an account for user and login

  Scenario: create new user account
    Given user open the website
    When click on sign up from the login page
    Then verify user is on sign up page
    When create account for the new user
    Then verify registration is successful
    When login to the bank account with valid credentials
    Then verify user is on banking page

