Feature: To verify user can add multiple products to cart

  Scenario: To validate user can add 2 products to cart

    Given user opens the application
    Then verify user is on login page
    When user enters "standard_user" and "secret_sauce"
    And user clicks on login button
    Then verify user is on home page
    When user clicks on add to cart button of 2 product
    Then verify cart quantity equals 2
    When user clicks on cart button
    Then verify user is on cart page
    And verify 2 products are add to the cart

  Scenario: To validate user can add 3 products to cart

    Given user opens the application
    Then verify user is on login page
    When user enters "standard_user" and "secret_sauce"
    And user clicks on login button
    Then verify user is on home page
    When user clicks on add to cart button of 3 product
    Then verify cart quantity equals 3
    When user clicks on cart button
    Then verify user is on cart page
    And verify 3 products are add to the cart