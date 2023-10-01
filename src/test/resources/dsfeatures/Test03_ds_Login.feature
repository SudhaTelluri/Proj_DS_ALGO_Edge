@LoginFeature @all
Feature: Implementing data driven for login functionality

  Background: follow till Home page
    Given The user enters DS Algo portal link
    When The user clicks the Get Started button
    Then The user should be redirected to home page

  @TS_Login_01 @login @signin @smoke @all
  Scenario Outline: User give valid username and password and logged into the application
    Then User click on Sign in link
    When User enters valid Username <username>
    And Enters valid Password <password>
    And clicks on Login button
    Then User should login successfully

    Examples: 
      | username     | password |
      | Sudhasdet128 | Bittar2$ |
      | sudha        | bittar2$ |
      | HardWork     | Pays1234 |
