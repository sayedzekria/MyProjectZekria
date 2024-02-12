@Smoke
Feature: Validating User Profile

  Background:Setup User profile test
    Then Click on Login button
    Then Login with valid credential user "supervisor" and password "tek_supervisor"
    Then Click on Displayed Sign in button
    Then navigate to Customer Service Portal and Validate It
    And click on profile button

  @US_11
  Scenario: Login with valid CSR credentials and profile should be same
    Then All all value should be correct "Status:Active, User:CSR, Name:Supervisor, Username:supervisor, SAuthorities:admin"

  @US_12
  Scenario: logout after login successful
    Then home page should display after logout