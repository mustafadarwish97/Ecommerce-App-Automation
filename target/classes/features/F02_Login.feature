@smoke

Feature: F02_Login | users could use login functionality to use their accounts

  Scenario: user could login with valid email and password
    Given user go to login page
    When user login with valid "mustafa@mail.com" and "12345600"
    And user press on login button
    Then user login to the system successfully

  Scenario: user could login with invalid email and password
    Given user go to login page
    When user login with invalid "t@test.com" and "123456"
    And user press on login button
    Then user could not login to the system