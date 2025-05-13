Feature: Add to Cart Button Presence for Each Product

  Scenario: Verify each product has an Add to Cart button

    Given user opens the application
    Then verify user is on login page
    When user enters "standard_user" and "secret_sauce"
    And user clicks on login button
    Then verify user is on home page
    And verify each product has add to cart button