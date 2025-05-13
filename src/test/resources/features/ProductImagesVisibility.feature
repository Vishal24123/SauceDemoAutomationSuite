Feature: Verify that product images are displayed

  Scenario: Verify product images are visible

    Given user opens the application
    Then verify user is on login page
    When user enters "standard_user" and "secret_sauce"
    And user clicks on login button
    Then verify user is on home page
    And verify product images are rendered
