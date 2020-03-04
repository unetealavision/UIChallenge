Feature: Login

  Scenario: The user unsuccessfully signs in Falabella's web page
    Given User is in Falabella's home page
    When User signs in with invalid credentials
    Then Web page displays error message to user

  Scenario: The user successfully signs in Falabella's web page
    Given User is in Falabella's home page
    When User signs in with valid credentials
    Then User should be signed in

