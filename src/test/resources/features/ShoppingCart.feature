Feature: Shopping cart

  Scenario: User needs to add a product to the shopping cart
    Given User is in a product page
    When User tries to add the product to the cart
    Then Web page displays pop up message to user with the confirmation

  Scenario: User needs to delete a product to the shopping cart
    Given User has a product on its shopping cart
    When User tries to delete the product
    Then Web page displays message to user saying the cart is empty