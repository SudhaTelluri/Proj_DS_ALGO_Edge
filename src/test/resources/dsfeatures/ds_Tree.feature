@Tree @all
Feature: Verifying Tree functionalities

  Background: User opens application url
    Given The user enters DS Algo portal link
    When The user clicks the Get Started button
    Then The user should be redirected to home page
    Then User click on Sign in link
    When User login to the application
    Given User navigates to Tree page using dropdown Data Structure menu

  @TS_OverviewofTrees_01 @OverviewofTrees @all
  Scenario Outline: Testing OverviewofTrees
    When User navigates to tryEditor page by clicking OverviewofTrees link in Tree
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        19 |

  @TS_Terminologies_02 @Terminologies @all
  Scenario Outline: Testing Terminologies link in Tree
    When User navigates to tryEditor page by clicking Terminologies link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        20 |

  @TS_TypesofTrees_03 @TypesofTrees @all
  Scenario Outline: Testing TypesofTrees in Tree
    When User navigates to tryEditor page by clicking TypesofTrees link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        21 |

  @TS_TreeTraversals_04 @TreeTraversals @all
  Scenario Outline: Testing TreeTraversals in Tree
    When User navigates to tryEditor page by clicking TreeTraversals link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        22 |

  @TS_TraversalsIllustration_05 @TraversalsIllustration @all
  Scenario Outline: Testing TraversalsIllustration in Tree
    When User navigates to tryEditor page by clicking TraversalsIllustration link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        23 |

  @TS_BinaryTrees_06 @BinaryTrees @all
  Scenario Outline: Testing BinaryTrees in Tree
    When User navigates to tryEditor page by clicking BinaryTrees link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        24 |

  @TS_TypesofBinaryTrees_06 @TypesofBinaryTrees @all
  Scenario Outline: Testing TypesofBinaryTrees in Tree
    When User navigates to tryEditor page by clicking TypesofBinaryTrees link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        25 |

  @TS_ImplementationinPython_07 @ImplementationinPython @all
  Scenario Outline: Testing ImplementationinPython in Tree
    When User navigates to tryEditor page by clicking ImplementationinPython link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        26 |

  @TS_BinaryTreeTraversals_08 @BinaryTreeTraversals @all
  Scenario Outline: Testing BinaryTreeTraversals in Tree
    When User navigates to tryEditor page by clicking BinaryTreeTraversals link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        27 |

  @TS_ImplementationofBinaryTrees_09 @ImplementationofBinaryTrees @all
  Scenario Outline: Testing ImplementationofBinaryTrees in Tree
    When User navigates to tryEditor page by clicking ImplementationofBinaryTrees link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        28 |

  @TS_ApplicationsofBinaryTrees_10 @ApplicationsofBinaryTrees @all
  Scenario Outline: Testing ApplicationsofBinaryTrees in Tree
    When User navigates to tryEditor page by clicking ApplicationsofBinaryTrees link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        29 |

  @TS_BinarySearchTrees_11 @BinarySearchTrees @all
  Scenario Outline: Testing BinarySearchTrees in Tree
    When User navigates to tryEditor page by clicking BinarySearchTrees link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        30 |

  @TS_ImplementationofBST_12 @ImplementationofBST @all
  Scenario Outline: Testing ImplementationofBST in Tree
    When User navigates to tryEditor page by clicking ImplementationofBST link
    Then User enters code in tryEditor from sheet "<Sheetname>" and rownumber <Rownumber>
    And User click on Run
    And User should get the output

    Examples: 
      | Sheetname | Rownumber |
      | Data      |        31 |
