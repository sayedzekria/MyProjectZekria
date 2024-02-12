@Regression
Feature: Create Account functionality test
  @US_3
  Scenario: Positive test: Create valid new account

    Then Click on Create Primary Account
  Then Create Primary Account Holder should be displayed
    When Fill Up Primary Account Holder on DataTable
      |email  |   sayedizekria003@tekschool.us  |
      |title  |     Mr.   |
      |firstName  |   sayedzekria  |
      |lastName  |   sayedi |
      |gender  |   MALE  |
      |maritalStatus  |  married   |
      |employmentStatus  |   Student  |
      |dateOfBirth |  11/18/1996  |
    Then Click on Create Account button
    Then Validate user is on 'sign in the account'
    Then Email should be display same as entry

