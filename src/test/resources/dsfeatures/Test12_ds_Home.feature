@LoginFeature @all
Feature: Implementing data driven for login functionality

  Background: follow till Home page
    Given The user enters DS Algo portal link
    When The user clicks the Get Started button
    Then The user should be redirected to home page

  @TS_Home_01 @Home @HomeFeature @smoke @all
  Scenario Outline: User is on home page and try to select the dropdown option without logging in
    When User selects one of the dropdownoption "<dropdownlist>"
    Then User should get warning message "You are not logged in"

    Examples: 
      | dropdownlist |
      | Arrays       |
      | Linked List  |
      | Stack        |
      | Queue        |
      | Tree         |
      | Graph        |

  @TS_Home_02 @Home @Home_RegisterFeature @smoke @all
  Scenario: Checking the functionality of register link
    When User click on Register link
    Then User should be redirected to register page

  @TS_Home_03 @Home @Home_SigninFeature @smoke @all
  Scenario: Checking the functionality of Sign in link
    When User click on Sign in link
    Then User should be redirected to login page

  @TS_home_04 @Home @Home_GetStarted @GetStartedLinks @all
  Scenario Outline: User click on get started links on homepage without logging in
    When The user clicks on Get Started links on homepage "<list>" without loging in
    Then User should get warning message "You are not logged in"

    Examples: 
      | list                      |
      | Datastructures_GetStarted |
      | Arrays_GetStarted         |
      | Linkedlist_GetStarted     |
      | Stack_GetStarted          |
      | Queue_GetStarted          |
      | Tree_GetStarted           |
      | Graph_GetStarted          |
