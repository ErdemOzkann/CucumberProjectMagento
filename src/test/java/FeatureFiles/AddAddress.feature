Feature: Manage addresses in the Address Book

  Scenario: User adds, edits, and deletes an address
    When The user clicks the "My Account" link
    And Clicks the "Manage Address" link
    And Clicks the "Add New Address" button
    And Fills in the required address fields
    And Marks the address as the default billing or shipping address
    And Saves the changes
    Then The user is redirected to the address list page
    And The user can edit or delete the added addresses