@Stack @all
Feature: Verifying Stack functionalities

  Background: User opens application url
    Given The user enters DS Algo portal link
    When The user clicks the Get Started button
    Then The user should be redirected to home page
    Then User click on Sign in link
    When User login to the application
    Given User navigates to Stack page using dropdown Data Structure menu

  @TS_OperationsinStack_01 @OperationsinStack @all
  Scenario Outline: Testing Operations in Stack link of Stack
    When User navigates to tryEditor page by clicking Operations in Stack link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        12 |

  @TS_Implementation_02 @Implementation @all
  Scenario Outline: Testing Creating Implementation link in Stack
    When User navigates to tryEditor page by clicking Implementation link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        13 |

  @TS_Applications_03 @Applications @all
  Scenario Outline: Testing Applications in Stack
    When User navigates to tryEditor page by clicking Applications link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        14 |
