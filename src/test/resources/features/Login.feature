Feature: User Login Functionality

  Background:
    Given user opens the application
    Then verify user is on login page

  Scenario: To validate login button is enabled after entering valid input
    When user enters "standard_user" and "secret_sauce"
    Then verify login button is enabled

  Scenario: To validate login fails with empty fields
    And user clicks on login button
    Then verify error message

  Scenario Outline: To validate user login with invalid credentials
    When user enters "<username>" and "<password>"
    And user clicks on login button
    Then verify error message

    Examples:
      | username          | password       |
      | locked_out_user   | secret_sauce   |
      | fake_account      | letmeinplease  |
      | expired_user      | outofdate123   |
      | no_access_user    | deniedpass     |
      | wrong_credentials | incorrect123   |

  Scenario Outline: To validate user login with valid credentials
    When user enters "<username>" and "<password>"
    And user clicks on login button
    Then verify user is on home page

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |
