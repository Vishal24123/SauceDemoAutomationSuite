Feature: To verify Add to Cart Button Responsiveness

  Scenario: To validate Add to Cart Button Responsiveness

    Given user opens the application
    Then verify user is on login page
    When user enters "standard_user" and "secret_sauce"
    And user clicks on login button
    Then verify user is on home page
    When user clicks on add to cart button of the first product
    Then verify button response should occur within 1 second