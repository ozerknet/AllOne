Feature: Zero Bank pay bill

  Background:
    Given the user is on the login page
    And User logins with username "username" and password "password"

  Scenario: pay bill
    Given the user accesses the Pay Bill tab
    And click pay bill link
    And select from list apple
    And choose Loan from account
    And put the amount 100
    And put the date "2022-07-05"
    And write "electric bill"
    And click the pay button
    Then verify the "The payment was successfully submitted." text

