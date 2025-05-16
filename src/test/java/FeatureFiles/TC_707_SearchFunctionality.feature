Feature: Search functionality using SKU

  Background:
    Given Navigate to Magento
    And Click to Signin button
    When Enter Email and password "cucumberproje1@hotmail.com" and "Team1Team" and click to SignIn button
    And User should be Sigin succesfully

  @Regression
  Scenario: User searches with a valid SKU and sees the product in results
    When The user enters "MJ08" into the search bar and presses Enter
    Then The product "Lando Gym Jacket" should be displayed in the search results

  @Regression
  Scenario: User navigates through categories, verifies SKU, and decides to place an order
    When The user navigates through the menu by clicking "Men" > "Tops" > "Jackets"
    And The user clicks on the "Lando Gym Jacket" product
    Then The product SKU should be displayed as "MJ08"
    And The user verifies the product is correct and decides to place an order

  @Regression
  Scenario: User searches with an invalid SKU and sees no results message
    When The user enters "INVALID123" into the search bar
    And Clicks the search icon
    Then A message "Your search returned no results." should be displayed