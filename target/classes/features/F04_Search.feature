@smoke

Feature: F04_Search | user could search using product name & sku

  Scenario Outline: user could search for product using product name
    Given user type <keyword> on search bar to search for product name
    And click search button
    Then validate count of products appeared
    And validate containing searched <keyword>

    Examples:
      |keyword|
      |book|
      |laptop|
      |nike|

  Scenario Outline: user could search for product using product sku
    Given user type <keyword> on search bar to search for product sku
    And click search button
    Then click on product appeared in search results
    And validate appeared product with searched <keyword>

    Examples:
      |keyword|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|