Feature: Dashboard Page Menu
Background:
  Given The user is on the login page

  Scenario: User should be able to see Dashboard Meu after log in
    When The user logs in "EurotechB5@gmail.com" and "Test12345"
    Then The welcome message contains "eurotechB5"
    And The user should be able to see following menu
      | Developers |
      | All Posts |
      | My Account |
  @wip
  Scenario: Log in as a specific user
    When The user logs in using following credentials
      | username | eurotech@gmail.com |
      | password | Test12345!         |
      | message  | Teacher            |
    Then The user should be able to login
    Then The user should be able to see following menu
      | Developers  |
      | All Posts  |
      | My Account |