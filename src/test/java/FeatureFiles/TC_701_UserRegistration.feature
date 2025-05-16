Feature: User Registration

  @Smoke @Regression
  Scenario: User successfully registers on the Magento website

    Given Navigate to Magento
    When The user accesses the registration form
    And The user enters personal information
      | firstname | lastname | email                      | password  | confirmPassword |
      | Frank     | De Boer  | cucumberproje1@hotmail.com | Team1Team | Team1Team       |
    And The user clicks the "Create an Account" button
    Then The user should see a success message and be logged into the site
    When The user goes "Back" to the previous page