Feature: Data Driven Testing in Cucumber
@ddf
  Scenario Outline: : DDF Login Test
    Given The user is on the login page
    When The user enters "<Sheet Name>" and row number <Row Number>
    Then The welcome message contains in excel <Row Number For Name>
    Examples:
      | Sheet Name | Row Number | Row Number For Name |
      |Test Data|0|0|
      |Test Data|1|1|
      |Test Data|2|2|
