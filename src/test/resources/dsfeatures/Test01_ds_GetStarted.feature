@HomeFeature @all
Feature: User launch ds application and test Home Page

  @TS_GetStarted_01 @smoke @all
  Scenario: User launch home page of dsalgo project
    Given The user enters DS Algo portal link
    When The user clicks the Get Started button
    Then The user should be redirected to home page
