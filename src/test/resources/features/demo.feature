Feature: Data Driven Testing in Cucumber
  @demo1
  Scenario Outline: : Demo Login Test
    Given The user is on the demo login page
    When The user enters "<demousername>" and row number "<demopassword>"
    Then The products page is shown
    Examples:
      |demousername|demopassword|
      |standard_user|secret_sauce|
      |locked_out_user|secret_sauce|
      |problem_user|secret_sauce|
      |performance_glitch_user|secret_sauce|

