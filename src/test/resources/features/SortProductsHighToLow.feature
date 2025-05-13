Feature: To verify user can sort products in high to low order

  Scenario: To validate user can sort products in high to low order

    Given user opens the application
    Then verify user is on login page
    When user enters "standard_user" and "secret_sauce"
    And user clicks on login button
    Then verify user is on home page
    When user clicks on high-low sorting
    Then verify sorting is completed