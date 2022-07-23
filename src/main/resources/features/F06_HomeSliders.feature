@smoke1

Feature: F06_HomeSliders | user could redirect to correct URL

  Scenario: user redirect to correct page of the first slider
    When user click on first control dot
    Then user could click on first slider
    And validate "https://demo.nopcommerce.com/nokia-lumia-1020" is correct on "first slider"

  Scenario: user redirect to correct page of the second slider
    When user click on second control dot
    Then user could click on second slider
    And validate "https://demo.nopcommerce.com/iphone-6" is correct on "second slider"
