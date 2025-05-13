Feature: To verify user can sort products in Z-A order

  Scenario: To validate user can sort products in Z-A order

    Given user opens the application
    Then verify user is on login page
    When user enters "standard_user" and "secret_sauce"
    And user clicks on login button
    Then verify user is on home page
    When user clicks on Z-A sorting
    Then verify sorting is completed