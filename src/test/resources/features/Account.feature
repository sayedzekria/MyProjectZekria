@Regression
Feature:  verify 5 rows as default

  Background: Accounts Page Test
    Then Click on Login button
    Then Login with valid credential user "supervisor" and password "tek_supervisor"
    Then Click on Displayed Sign in button
    Then navigate to Customer Service Portal and Validate It
    Then Clicking on Accounts

@US_1
  Scenario: Validating accounts page is 5 rows are page's default
    When data rows should be displayed as default "5"
    Then Data rows should be displayed on 5

@US_2
  Scenario: Navigate to customer service portal with valid CSR credential and account change show
  per page as 10, 25, 50 rows and validate table records per page according to selected show per page.
    When Data change "10" rows every per page
    Then Data rows should be displayed on 10
    When Data change "25" rows every per page
    Then Data rows should be displayed on 25
    When Data change "50" rows every per page
    Then Data rows should be displayed on 50


