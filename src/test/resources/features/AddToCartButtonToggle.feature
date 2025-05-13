Feature: Add to Cart Button Changes to Remove After Clicking the button

  Scenario: Verify Add to Cart button changes to Remove after clicking it

    Given user opens the application
    Then verify user is on login page
    When user enters "standard_user" and "secret_sauce"
    And user clicks on login button
    Then verify user is on home page
    When user clicks on add to cart button of the first product
    Then verify the button changed to remove button