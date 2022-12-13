@login
Feature: Log in as different user

  Scenario: Log in as teacher with parameters
    Given The user is on the login page
    When The user logs in "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to login
    And The welcome message contains "Teacher"