Feature: bleucrm project

  @Wip
  Scenario: successfull login
    When user go to bleucrm login page
    And user enter username and password and click login
    Then check user successfully login