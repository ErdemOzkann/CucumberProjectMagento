Feature: Add and remove from cart

  Background:
    Given Navigate to magento webpage
    And Click to Signin button
    When Enter Email and password "cucumberproje1@hotmail.com" and "Team1Team" and click to SignIn button
    And User should be Sigin succesfully

  @Smoke @Regression
  Scenario: Add functionality

    And User click random product from homepage
    And If there is a color qty and a size there, select them.
    When User click the button
      | addToCart |
    And User should be add to cart successfully

    And Update to cart
    And User should update cart successfully

    And User should remove form cart item

