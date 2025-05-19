Feature: Product Interaction Functionality

  Background:
    Given user opens the application
    Then verify user is on login page
    When user enters "standard_user" and "secret_sauce"
    And user clicks on login button
    Then verify user is on home page

  Scenario: Verify each product has an Add to Cart button
    And verify each product has add to cart button

  Scenario: Verify Add to Cart button changes to Remove after clicking it
    When user clicks on add to cart button of the first product
    Then verify the button changed to remove button

  Scenario: To validate Add to Cart Button Responsiveness
    When user clicks on add to cart button of the first product
    Then verify button response should occur within 1 second

  Scenario: Verify product images are visible
    And verify product images are rendered
