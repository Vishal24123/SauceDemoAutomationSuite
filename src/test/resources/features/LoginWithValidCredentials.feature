Feature: To verify login with valid credentials

  Scenario Outline:To validate user login with valid credentials
    Given user opens the application
    Then verify user is on login page
    When user enters "<username>" and "<password>"
    And user clicks on login button
    Then verify user is on home page

    Examples:
      |username               |password    |
      |standard_user          |secret_sauce|
      |problem_user           |secret_sauce|
      |performance_glitch_user|secret_sauce|
      |error_user             |secret_sauce|
      |visual_user            |secret_sauce|