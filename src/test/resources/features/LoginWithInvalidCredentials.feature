Feature: To verify login with invalid credentials

  Scenario Outline:To validate user login with invalid credentials
    Given user opens the application
    Then verify user is on login page
    When user enters "<username>" and "<password>"
    And user clicks on login button
    Then verify error message

    Examples:
      |username          |password     |
      |locked_out_user   |secret_sauce |
      |fake_account      |letmeinplease|
      |expired_user      |outofdate123 |
      |no_access_user    |deniedpass   |
      |wrong_credentials |incorrect123 |