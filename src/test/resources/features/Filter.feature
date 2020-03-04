Feature: Filter

  Scenario: The user needs to filter by object price
    Given User is in cremas product page
    When The user clicks "precio"
    And Types prices between 5000 to 20000
    And Applies the price filter
    Then User should only see products with prices in this range