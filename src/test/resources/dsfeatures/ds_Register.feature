@RegisterFeature @all
Feature: Registration page automation

@TS_Register_01 @smoke @registeraccount
Scenario: User clicks on Register link and provide required fields and click on Register button

Given The user enters DS Algo portal link
When The user clicks the Get Started button
Then The user should be redirected to home page
When User click on Register link
And User enters required fields and click on Register button
Then User should login to their account



