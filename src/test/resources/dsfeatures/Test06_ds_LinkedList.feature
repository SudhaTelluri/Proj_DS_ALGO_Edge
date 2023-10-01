@LinkedList @all
Feature: Verifying Linked List functionalities

  Background: User opens application url
    Given The user enters DS Algo portal link
    When The user clicks the Get Started button
    Then The user should be redirected to home page
    Then User click on Sign in link
    When User login to the application
    Given User navigates to LinkedList page using dropdown Data Structure menu

  @TS_LinkedList_01 @Introduction @all
  Scenario Outline: Testing Introduction link in Linked List
    When User navigates to tryEditor page by clicking introduction link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |         5 |

  @TS_CreatingLinkedList_02 @CreatingLinkedList @all
  Scenario Outline: Testing Creating Linked List link in Linked List
    When User navigates to tryEditor page by clicking Created Linked List link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |         6 |

  @TS_TypesOfLinkedList_03 @TypesOfLinkedList @all
  Scenario Outline: Testing Types Of LinkedList link in Linked List
    When User navigates to tryEditor page by clicking Types of Linked List link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |         7 |

  @TS_ImplementLinkedListinPython_04 @ImplementLinkedListinPython @all
  Scenario Outline: Testing Implement LinkedList in Python link in Linked List
    When User navigates to tryEditor page by clicking Implement Linked List in Python link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |         8 |

  @TS_Traversal_05 @Traversal @all
  Scenario Outline: Testing Traversal link in Linked List
    When User navigates to tryEditor page by clicking Traversal link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |         9 |

  @TS_Insertion_06 @Insertion @all
  Scenario Outline: Testing Insertion link in Linked List
    When User navigates to tryEditor page by clicking Insertion link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        10 |

  @TS_Deletion_07 @Deletion @all
  Scenario Outline: Testing Deletion link in Linked List
    When User navigates to tryEditor page by clicking Deletion link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        11 |
