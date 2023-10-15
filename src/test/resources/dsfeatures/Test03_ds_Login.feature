@LoginFeature @all
Feature: Implementing data driven for login functionality

  Background: follow till Home page
    Given The user enters DS Algo portal link
    When The user clicks the Get Started button
    Then The user should be redirected to home page
    And User click on Sign in link

  @TS_Login_01 @login @signin @smoke @all
  Scenario Outline: User give valid username and password and logged into the application
    When User enters valid Username <username>
    And Enters valid Password <password>
    And clicks on Login button
    Then User should login successfully

    Examples: 
      | username     | password |
      | Sudhasdet128 | Bittar2$ |
      | sudha        | bittar2$ |
      | HardWork     | Pays1234 |

  @TS_Login_02 @login @signin @smoke @all
  Scenario: User trying to login with invalid credentials
    When User enters invalid username "HardWork143" into username field
    And User enters invalid password "Pays12345" into password field
    And User clicks on login button
    Then User should get proper warning message like invalid credentials

  @TS_Login_03 @login @signin @smoke @all
  Scenario: User trying to login with valid email and invalid password
    When User enters valid username "HardWork" into username field
    And User enters invalid password "Pays12345" into password field
    And User clicks on login button
    Then User should get proper warning message like invalid credentials

  @TS_Login_04 @login @signin @smoke @all
  Scenario: User trying to login with invalid email and valid password
    When User enters invalid username "HardWork143" into username field
    And User enters valid password "Pays1234" into password field
    And User clicks on login button
    Then User should get proper warning message like invalid credentials

  