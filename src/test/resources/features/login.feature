@Login
Feature: Eurotech log in test
  # Agile story : As a user, I should be able to log in so I can see my account

  Background:
  Given The user is on the login page

@Teacher @Eurotech @Smoke
  Scenario: Login as a teacher

    When The user enters teacher credentials
    Then The user should be able to login

@Student @Smoke
  Scenario: Login as a student

      When The user enters student credentials
      Then The user should be able to login

@db
  Scenario: Login as a student 2

    When The user enters student credentials
    Then The user should be able to login



