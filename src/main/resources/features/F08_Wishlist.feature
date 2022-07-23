@smoke

Feature: F08_Wishlist | users could add to wishlist and count

  Scenario: user could add to wishlist
    When user click on wishlist button on product
    Then validate success message and background color

  Scenario: user could add to wishlist and check quantity of it
    When user click on wishlist button on product
    Then user open wishlist page
    And validate quantity is bigger than 0
