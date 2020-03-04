Feature: Search

  Scenario: The user needs to search an object
    Given The user is in Falabella's homepage
    And Types "crema" in the search bar
    When The user clicks "crema" in suggested search
    Then The user is redirected to "cremas" product page