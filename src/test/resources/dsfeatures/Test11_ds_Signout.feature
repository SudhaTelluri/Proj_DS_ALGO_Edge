@SignOut @all
Feature: Automating Signout functionalities

  Background: follow till login page
    Given The user enters DS Algo portal link
    When The user clicks the Get Started button
    Then The user should be redirected to home page
    Then User click on Sign in link
    When User enters valid Username, password and click on Login button
    Then User should login successfully

	@smoke @all
  @TS_Signout_01
  Scenario: Verifying Signout link
    When User clicks on signout link
    Then User should logout successfully
    
