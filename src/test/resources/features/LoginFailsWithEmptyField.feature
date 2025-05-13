Feature: To verify login fails with the empty fields

  Scenario: To validate login fails with empty fields

    Given user opens the application
    Then verify user is on login page
    And user clicks on login button
    Then verify error message