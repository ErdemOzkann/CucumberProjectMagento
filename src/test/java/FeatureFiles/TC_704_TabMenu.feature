Feature: Icons in the tab menu work control

  Background:
    Given Navigate to magento webpage
    And Click to Signin button
    When Enter Email and password "cucumberproje1@hotmail.com" and "Team1Team" and click to SignIn button
    And User should be Sigin succesfully

  @Smoke @Regression
  Scenario: Tab Menu functionality

    And clicks on the What's New ikon
    Then the What's New category page should be displayed

    When the user hovers over Women > Tops > Jackets And clicks on Jackets
    Then the Jackets category page should be displayed

    When the user hovers over Women > Tops > Hoodies & Sweatshirts And clicks on Hoodies & Sweatshirts
    Then the Hoodies & Sweatshirts category page should be displayed

    When the user hovers over Women > Tops > Tees And clicks on Tees
    Then the Tees category page should be displayed

    When the user hovers over Women > Tops > Bras & Tanks And clicks on Bras & Tanks

    When the user hovers over Women > Bottoms > Pants And clicks on Pants
    Then the Pants category page should be displayed

    When the user hovers over Women > Bottoms > Shorts And clicks on Shorts
    Then the Shorts category page should be displayed

    When the user hovers over Men > Tops > Jackets And clicks on Jackets
    Then the Jackets category page should be displayed

    When the user hovers over Men > Tops > Hoodies & Sweatshirts And clicks on Hoodies & Sweatshirts
    Then the Hoodies & Sweatshirts category page should be displayed

    When the user hovers over Men > Tops > Tees And clicks on Tees
    Then the Tees category page should be displayed

    When the user hovers over Men > Tops > Tanks And clicks on Tanks

    When the user hovers over Men > Bottoms > Pants And clicks on Pants
    Then the Pants category page should be displayed

    When the user hovers over Men > Bottoms > Shorts And clicks on Shorts
    Then the Shorts category page should be displayed

    When the user hovers over Gear > Bags And clicks on Bags
    Then the Bags category page should be displayed

    When the user hovers over Gear > Fitness Equipment And clicks on Fitness Equipment
    Then the Fitness Equipment category page should be displayed

    When the user hovers over Gear > Watches And clicks on Watches
    Then the Watches category page should be displayed

    When the user hovers over Training > Video Download And clicks on Video Download
    Then the Video Download category page should be displayed

    And clicks on the Sale ikon
    Then the Sale category page should be displayed


