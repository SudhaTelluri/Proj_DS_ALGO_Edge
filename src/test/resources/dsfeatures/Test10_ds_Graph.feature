@Graph @all
Feature: Verifying Graph functionalities

  Background: User opens application url
    Given The user enters DS Algo portal link
    When The user clicks the Get Started button
    Then The user should be redirected to home page
    Then User click on Sign in link
    When User login to the application
    Given User navigates to Graph page using dropdown Data Structure menu

  @TS_Graph_01 @Graph @all
  Scenario Outline: Testing Graph
    When User navigates to tryEditor page by clicking Graph
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        32 |

  @TS_GraphRepresentations_02 @GraphRepresentations @all
  Scenario Outline: Testing GraphRepresentations
    When User navigates to tryEditor page by clicking GraphRepresentations link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        33 |
