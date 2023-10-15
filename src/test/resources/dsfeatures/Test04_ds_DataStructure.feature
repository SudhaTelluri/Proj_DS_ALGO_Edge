@DSIntro @all
Feature: Automating data structure introduction page

  Background: follow till login page
    Given The user enters DS Algo portal link
    When The user clicks the Get Started button
    Then The user should be redirected to home page
    Then User click on Sign in link
    When User enters valid Username, password and click on Login button
    Then User should login successfully

  @TS_DS_Intro_01 @smoke @all
  Scenario: Verifying DataStructure textbox editor with valid Python code
    When User clicks on Get Started link of DataStructures intro page
    Then User navigates to editor page
    When Enters the basic python code in editor and click on run
    Then Output should print on editor

  @TS_DS_Intro_02 @smoke @all
  Scenario Outline: Verifying DataStructure textbox editor with invalid Python code
    When User clicks on Get Started link of DataStructures intro page
    Then User navigates to editor page
    When User enters the invalid python code from xlsheet "<sheetname>" and rownum <rownumber>
    And User click on Run
    Then User output must be blank

    Examples: 
      | sheetname | rownumber |
      | Data      |        34 |
