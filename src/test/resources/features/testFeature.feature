@Search-Cars
Feature: Go to the cart

  @New-Search-Cars
  Scenario: Validate Cart displayed
    Given The user opens Amazon website
    When The user clicks on the cart button on main page
      | Menu       |
      |Cart        |
    Then Cart Page is displayed