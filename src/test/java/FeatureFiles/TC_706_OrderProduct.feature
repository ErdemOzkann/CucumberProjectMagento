Feature: Order Completion Functionality

  Background:
    Given Navigate to magento webpage
    And Click to Signin button
    When Enter Email and password "cucumberproje1@hotmail.com" and "Team1Team" and click to SignIn button
    And User should be Sigin succesfully

  @Smoke @Regression
  Scenario: User successfully completes the order

    Given User click random product from homepage
    And If there is a color qty and a size there, select them.
    When User click the button
      | addToCart |
    And User should be add to cart successfully
    And The user clicks the "cartButton" button
    And The user clicks the "Proceed to checkout" button
    And The user sees one of the registered default shipping addresses. If no address is available, the user creates a new one.
    And The user selects a shipping method by clicking a random radio button
    And The user clicks the "Next" button
    Then The user is redirected to the "Payment Method" page
    And The user verifies that the billing address is the same as the shipping address
    And The user clicks the "Place Order" button
    And The user sees the success message on the Success Page and the user sees the order number
