Feature: To verify login button enabled after entering valid credentials

  Scenario: To validate login button is enabled after entering valid input

    Given user opens the application
    Then verify user is on login page
    When user enters "standard_user" and "secret_sauce"
    Then verify login button is enabled