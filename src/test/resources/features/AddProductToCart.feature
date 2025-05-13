Feature: To verify a product can be added to cart

  Scenario: To validate user can add a product to the cart

    Given user opens the application
    Then verify user is on login page
    When user enters "standard_user" and "secret_sauce"
    And user clicks on login button
    Then verify user is on home page
    When user clicks on add to cart button of the first product
    Then verify cart quantity equals 1
    When user clicks on cart button
    Then verify user is on cart page
    And verify the product is add to the cart