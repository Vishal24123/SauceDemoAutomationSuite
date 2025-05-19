Feature: To verify Cart Functionality

  Background:
    Given user opens the application
    Then verify user is on login page
    When user enters "standard_user" and "secret_sauce"
    And user clicks on login button
    Then verify user is on home page

  Scenario: To validate user can add 1 product to the cart
    When user clicks on add to cart button of the first product
    Then verify cart quantity equals 1
    When user clicks on cart button
    Then verify user is on cart page
    And verify the product is add to the cart

  Scenario: To validate user can add 2 products to cart
    When user clicks on add to cart button of 2 product
    Then verify cart quantity equals 2
    When user clicks on cart button
    Then verify user is on cart page
    And verify 2 products are add to the cart

  Scenario: To validate user can add 3 products to cart
    When user clicks on add to cart button of 3 product
    Then verify cart quantity equals 3
    When user clicks on cart button
    Then verify user is on cart page
    And verify 3 products are add to the cart


  Scenario: To validate user can remove a product from the cart
    When user clicks on add to cart button of the first product
    Then verify cart quantity equals 1
    When user clicks on cart button
    Then verify user is on cart page
    And verify the product is add to the cart
    When user clicks on remove button of the product
    Then verify cart page is empty

  Scenario: Verify cart count updates when products are added and removed
    When user clicks on add to cart button of the first product
    Then verify cart quantity equals 1
    When user clicks on cart button
    Then verify user is on cart page
    And verify the product is add to the cart
    When user clicks on remove button of the product
    Then verify cart page is empty
    When user navigates back to the home page
    Then verify cart quantity is null