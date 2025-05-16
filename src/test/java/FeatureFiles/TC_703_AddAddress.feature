Feature: Manage addresses in the Address Book

  Background:
    Given Navigate to Magento
    And Click to Signin button
    When Enter Email and password "cucumberproje1@hotmail.com" and "Team1Team" and click to SignIn button
    And User should be Sigin succesfully

  @Regression
  Scenario Outline: User adds, edits, and deletes an address
    When The user clicks the "My Account" link
    And Clicks the "Manage Address" link
    And Clicks the "Add New Address" button
    And Fills in the required address fields with "<FirstName>", "<LastName>", "<Street>", "<City>", "<Zip>", "<Country>", "<Phone>"
    And Marks the address as the default billing or shipping address "<DefaultType>"
    And The user click te save button and redirected to the address list page
    And The user can edit and delete the added addresses

    Examples:
      | FirstName | LastName | Street         | City     | Zip   | Country | Phone      | DefaultType |
      | John      | Doe      | 123 Main St    | New York | 10001 | Türkiye | 5551234567 | billing     |
      | Jane      | Smith    | 456 Park Ave   | Chicago  | 60614 | Türkiye | 5559876543 | shipping    |
      | Ali       | Veli     | 789 Elm Street | Istanbul | 34000 | Türkiye | 5321234567 | billing     |