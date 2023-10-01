@Queue @all
Feature: Verifying Queue functionalities

  Background: User opens application url
    Given The user enters DS Algo portal link
    When The user clicks the Get Started button
    Then The user should be redirected to home page
    Then User click on Sign in link
    When User login to the application
    Given User navigates to Queue page using dropdown Data Structure menu

  @TS_ImplementationofQueueinPython_01 @ImplementationofQueueinPython @all
  Scenario Outline: Testing Operations in Implementation of Queue in Python link of Queue
    When User navigates to tryEditor page by clicking Implementation of Queue in Python link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        15 |

  @TS_Implementationusingcollectionsdeque_02 @Implementationusingcollectionsdeque @all
  Scenario Outline: Testing Creating Implementationusingcollectionsdeque in Queue
    When User navigates to tryEditor page by clicking Implementationusingcollectionsdeque link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        16 |

  @TS_Implementationusingarray_03 @Implementationusingarray @all
  Scenario Outline: Testing Implementationusingarray in Queue
    When User navigates to tryEditor page by clicking Implementationusingarray link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        17 |

  @TS_QueueOperations_04 @QueueOperations @all
  Scenario Outline: Testing QueueOperations in Queue
    When User navigates to tryEditor page by clicking QueueOperations link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        18 |
