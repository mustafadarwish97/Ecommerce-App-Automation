@smoke

Feature: F03_Currencies | user could change currency shown on the website

 Scenario: user change currency to euro
   Given user select euro currency
   Then user verify Euro Symbol is shown on price

