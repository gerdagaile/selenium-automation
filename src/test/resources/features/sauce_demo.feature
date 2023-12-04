Feature: Sauce demo login feature

  Scenario: User log in to Sauce demo page
    Given user opens main page
    When user logs in with credentials: "standard_user" and "secret_sauce"
    Then user is authenticated


  Scenario Outline: User checks validation error messages
    Given user open main page
    When user logs in with credentials: "<login>" and "<password>"
    Then user see error message: "<error_message>"
    Examples:
      | login         | password           | error_message                                                             |
      |               |                    | Epic sadface: Username is required                                        |
      | sauce_demo    |                    | Epic sadface: Password is required                                        |
      | standard_user | incorrect_password | Epic sadface: Username and password do not match any user in this service |