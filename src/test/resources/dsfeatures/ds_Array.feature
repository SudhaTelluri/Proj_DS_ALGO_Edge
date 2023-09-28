@ArrayFeature @all
Feature: Verifying the Array functionalities

  Background: The user login to the application
    Given The user enters DS Algo portal link
    When The user clicks the Get Started button
    Then The user should be redirected to home page
    Then User click on Sign in link
    When User enters valid Username, password and click on Login button
    Then User should login successfully
    Given User navigates to Arrays page by using dropdown menu in Home Page

  @TS_Array_01 @all
  Scenario Outline: Checking the functionality of Arrays in Python link
    When User click on Arrays in Python link
    And User navigates to tryeditor page
    And User enters valid python code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    Then User should get appropriate output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |         1 |

  @TS_Array_02 @ArraysUsingList @all @smoke
  Scenario Outline: Checking the functionality of Array Using List
    When User click on Arrays Using List link
    And User navigates to tryeditor page
    And User enters Arrays using List python code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    Then User should get appropriate output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |         2 |

  @TS_Array_03 @BasicOperationsInLists @all @smoke
  Scenario Outline: Checking the functionality of Basic Operations in Lists
    When User click on Basic Operations in Lists
    And User navigates to tryeditor page
    And User enters basic operations of list code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    Then User should get appropriate output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |         3 |

  @TS_Array_04 @ApplicationsOfArray @all @smoke @TS_Array_03 @BasicOperationsInLists @all @smoke
  Scenario Outline: Checking the functionality of Applications of Array
    When User click on Applications of Array link
    And User navigates to tryeditor page
    And User enters Applications of Array code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    Then User should get appropriate output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |         4 |
