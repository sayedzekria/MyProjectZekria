@Smoke
Feature: Validating User Plans Page

  Background: Setup Plans Page Test
    Then Click on Login button
    Then Login with valid credential user "supervisor" and password "tek_supervisor"
    Then Click on Displayed Sign in button
    When Clicking on Plans
@US_9
  Scenario: Validating User Plans Page then 4 Rows should be displayed

    Then on the user plans page 4 data rows must be show up
@US_10
  Scenario:Validate Create and Expire Date
    Then Validate Create
    And Validate Expire