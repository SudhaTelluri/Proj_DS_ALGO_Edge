@RegisterFeature @all
Feature: Registration page automation

  Background: follow till Register Page
    Given The user enters DS Algo portal link
    When The user clicks the Get Started button
    Then The user should be redirected to home page

  @TS_Register_01 @smoke @registeraccount @all
  Scenario: User clicks on Register link and provide required fields and click on Register button
    When User click on Register link
    And User enters required fields and click on Register button
    Then User should login to their account
