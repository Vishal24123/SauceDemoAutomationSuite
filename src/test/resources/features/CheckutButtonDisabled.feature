@fail
Feature: To verify checkout button is disabled when cart is empty

  Scenario: To validate checkout button is disabled when cart is empty

    Given user opens the application
    Then verify user is on login page
    When user enters "standard_user" and "secret_sauce"
    And user clicks on login button
    Then verify user is on home page
    When user clicks on cart button
    Then verify user is on cart page
    And verify checkout button is disabled
