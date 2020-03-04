Feature: Logout

  Scenario: The user successfully signs out of Falabella's web page
    Given The user is currently logged in Falabella's home page
    When The user signs out of account
    Then The user should be signed out