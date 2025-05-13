Feature: To verify user can logout successfully

  Scenario: To validate that user can logout successfully

    Given user opens the application
    Then verify user is on login page
    When user enters "standard_user" and "secret_sauce"
    And user clicks on login button
    Then verify user is on home page
    When user clicks on hamburger menu
    And user clicks on logout option
    Then verify user is on login page