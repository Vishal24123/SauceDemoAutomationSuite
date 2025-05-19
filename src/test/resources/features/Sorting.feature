Feature: Product Sorting Functionality

  Background:
    Given user opens the application
    Then verify user is on login page
    When user enters "standard_user" and "secret_sauce"
    And user clicks on login button
    Then verify user is on home page

  Scenario: To validate user can sort products in A-Z order
    When user clicks on A-Z sorting
    Then verify sorting is completed

  Scenario: To validate user can sort products in high to low order
    When user clicks on high-low sorting
    Then verify sorting is completed

  Scenario: To validate user can sort products in low to high order
    When user clicks on low-high sorting
    Then verify sorting is completed

  Scenario: To validate user can sort products in Z-A order
    When user clicks on Z-A sorting
    Then verify sorting is completed
