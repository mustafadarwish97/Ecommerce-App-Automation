@smoke

Feature: F01_Register | users could register with new accounts

  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user select gender type
    And user enter first name "Mustafa2" and last name "Amr2"
    Then user enter date of birth
    And user enter email field "mustafa2@mail.com"
    And user fills Password fields "12345600" "12345600"
    Then user clicks on register button
    And success message is displayed