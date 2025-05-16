Feature: Login Functionality With Valid and Invalid Info

  Background:
    Given Navigate to magento webpage

  @Smoke @Regression
  Scenario: Login test with valid input

    And Click to Signin button
    When Enter Email and password "cucumberproje1@hotmail.com" and "Team1Team" and click to SignIn button

    And User should be Sigin succesfully

  @Smoke @Regression
  Scenario Outline: Login test with invalid input

    And Click to Signin button
    When Enter invalid Email and password combinations
      | SignInEmail    | <email>    |
      | SignInPassword | <password> |

    And User should not be Sigin

    Examples:
      | email                      | password   |
      | sebebineydiki@safmail.com  | Team1Team  |
      | cucumberproje1@hotmail.com | TTeamTea   |
      | yawhehee@hotmail.com       | TemelReizz |

  @Smoke @Regression
  Scenario Outline: Forgot Your Password test

    Given Click to Forgot Your Password button
    Then Enter an email <email>
    And Forgot Your Password Functionality must be run
    Examples:
      | email                        |
      | "cucumberproje1@hotmail.com" |

