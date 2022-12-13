@account
Feature: Account Type

  Background:
    Given The user is on the login page
@Rerun
  Scenario: Teacher user
    When The user logs in "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "teacher"
  @Rerun
  Scenario: Student user
    When The user logs in "EurotechB5@gmail.com" and "Test12345"
    Then The welcome message contains "eurotechB5"

@accountList
  Scenario Outline: Different <name> Users
    When The user logs in "<userType>" and "<password>"
    Then The welcome message contains "<name>"

    Examples:
      | userType             | password   | name       |
      | eurotech@gmail.com   | Test12345! | Teacher    |
      | EurotechB5@gmail.com | Test12345  | eurotechB5 |

@example
  Scenario Outline: User navigates to <menu> Menu
    Given The user is on the login page
    When The user logs in using "<username>" and "<password>"
    Then The user should be able to login
    And The welcome message contains "<name>"
    And The user navigates to "<menu>" menu
    Then The users should able to see header as "<name2>"



    Examples:
      | username             | password   | name       | menu       | name2                                   |
      | eurotech@gmail.com   | Test12345! | Teacher    | Developers | Filter Profiles by Skill or by Location |
      | student33@gmail.com  | Test12345! | Denis      | My Account | Dashboard                               |
      | EurotechB5@gmail.com | Test12345  | eurotechB5 | All Posts  | Posts                                   |
