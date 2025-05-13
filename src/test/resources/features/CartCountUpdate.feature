Feature: To verify  Cart Count Updates Properly

  Scenario: Verify cart count updates when products are added and removed

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
    When user clicks on remove button of the product
    Then verify cart page is empty
    When user navigates back to the home page
    Then verify cart quantity is null

