Feature: Create Wish List Functionality

  Background:
    Given Navigate to magento webpage

    And Click to Signin button

    When Enter Email and password "cucumberproje1@hotmail.com" and "Team1Team" and click to SignIn button

    And User should be Sigin succesfully

  @Regression
  Scenario: Adding product to Add To Wishlist function

    Given Go to the page of a product you like

    Then Click the Add To Wishlist button

    And The product added message should be displayed

  @Regression
  Scenario:Remove product from Wishlist function

    Given Click the "My Account" and the "My Wish List" buttons

    Then Hover over the product

    And Remove the item

    And Verify the product is removed

  @Regression
  Scenario: Wishlist update function

    Given Click the "My Account" and the "My Wish List" buttons

    Then Hover over the product

    And Click the update item button

    And Update your favorites list