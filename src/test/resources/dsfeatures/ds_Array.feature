@ArrayFeature @all
Feature: Verifying the Array functionalities

  Background: The user login to the application
    Given The user enters DS Algo portal link
    When The user clicks the Get Started button
    Then The user should be redirected to home page
    Then User click on Sign in link
    When User enters valid Username, password and click on Login button
    Then User should login successfully

  @TS_Array_01 @all
  Scenario Outline: Checking the functionality of Arrays in Python link
    Given User navigates to Arrays page by using dropdown menu in Home Page
    When User click on Arrays in Python link
    And User navigates to tryeditor page
    And User enters valid python code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    Then User should get appropriate output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |         1 |
