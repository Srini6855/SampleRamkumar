Feature: Login module

  Background: Given User is on the login page
@login1
  Scenario Outline: Verify the login with valid credentials
    When User enter username "<username>" and password "<password>"
    And User click login button
    Then User verifies the succes message after login "Hello Srinivasanomr!"

    Examples: 
      | username      | password  |
      | Srinivasanomr | Srini@123 |

  @login2
  Scenario Outline: Verify the login with inavlid credentials
    When User enter username "<username>" and password "<password>"
    And User click login button
    Then User verifies the error message after login "Invalid Login details or Your Password might have expired. "

    Examples: 
      | username | password  |
      | b fgcjnm | Srini@123 |
 @login2
  Scenario Outline: Verify the login with valid credentials without login button
    When User enter username "<username>" and password "<password>"
    And User press the enter key
    Then User verifies the succes message after login "Hello Srinivasanomr!"

    Examples: 
      | username      | password  |
      | Srinivasanomr | Srini@123 |
