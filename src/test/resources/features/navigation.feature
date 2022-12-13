@Navigate
Feature: Eurotech navigation test

  Scenario: Nav as TEacher
  Given Login as Teacher
  When Get the text of welcome
    Then go to Developers menu and get the text of Developers

  Scenario: Nav as Student
  Given Login as Student
  When Get the text of welcome
    Then go to All Posts menu and get the text of Posts

  Scenario: TExt for Teacher
  Given Login as Teacher
  When Get the text of welcome
    Then go to My Account menu and get the text of Dashboard

  Scenario: Admin menu
    Given The user enters teacher credentials
    When The user is on the login page
    Then go to Admin menu and get the text of Posts



