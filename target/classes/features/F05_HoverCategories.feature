@smoke

Feature: F05_HoverCategories | user could hover and select categories & subcategories

  Scenario: user could hover category & select subcategory from it
    Given user could hover on category list
    Then user click on subcategory
    And validate subcategory name on title page

