Feature: Login Functionality Test Feature

  Scenario Outline: Check Login is successful with valid credentials.
    Given user is on Login page
    When user enters the <username> and <password>
    And clicks on the login button
    Then user is redirected to Dashboard/Home Page

Examples:
  | username  | password  |
  | userName1 | password1 |
  | userName2 | password2 |
  | userName3 | password3 |

