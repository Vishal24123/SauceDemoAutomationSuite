Feature: To verify user can sort products in low to high order

  Scenario: To validate user can sort products in low to high order

    Given user opens the application
    Then verify user is on login page
    When user enters "standard_user" and "secret_sauce"
    And user clicks on login button
    Then verify user is on home page
    When user clicks on low-high sorting
    Then verify sorting is completed