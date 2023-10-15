@RegisterFeature @all
Feature: Registration page automation

  Background: follow till Register Page
    Given The user enters DS Algo portal link
    When The user clicks the Get Started button
    Then The user should be redirected to home page
    When User click on Register link

  @TS_Register_01 @smoke @registeraccount @all
  Scenario: User clicks on Register link and provide required fields and click on Register button
    And User enters required fields and click on Register button
    Then User should login to their account

  @TS_Register_02 @smoke @registeraccount @all
  Scenario: User trying to create an account without filling details
    And User doesn't enter any details into fields and click on Register button
    Then User should get proper warning message

  @TS_Register_03 @smoke @registeraccount @all
  Scenario: User trying to create duplicate account
    And User enters details into below fields
      | Username              | HardWork |
      | Password              | Pays1234 |
      | Password Confirmation | Pays1234 |
    And User clicks on register button
    Then User should get error message
