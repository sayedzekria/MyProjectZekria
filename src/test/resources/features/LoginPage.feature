@Regression
Feature: Login Functionality tests

  Background:Setup test for Login and enter valid csr user
    When Click on Login button


@US_6
  Scenario: Login with with a valid username and password
    Then Login with valid credential user "supervisor" and password "tek_supervisor"
    Then Click on Displayed Sign in button
    Then navigate to Customer Service Portal and Validate It
@US_7
  Scenario: Login with a valid username and wrong password
    Then Login with invalid user credentials "supervisor" and "wrongpasswordtek_supervisor123@"
    Then Click on Displayed Sign in button
    Then Validate error message "password not found it"
@US_8

  Scenario: Login with a valid password and invalid username
    Then Login with invalid user credentials "wrongusernamesupervisor123@" and "tek_supervisor"
    Then Click on Displayed Sign in button
    Then Validate error message "password not found it"