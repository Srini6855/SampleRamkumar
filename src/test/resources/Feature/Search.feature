Feature: Search Module

  Scenario Outline: User search hotel with all fields
    Given User is on the login page
    When User enter username "<username>" and password "<password>"
    And User click login button
    Then User verifies the succes message after login "Hello Srinivasanomr!"
    When User select "<location>","<hotels>", "<roomtype>", "<noOfRooms>", "<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    And User click Search button
    Then User verifies the success message after search "Select Hotel"

    Examples: 
      | username      | password  | location |
      | Srinivasanomr | Srini@123 | sydney   |

  Scenario Outline: User search hotel with mandatory fields
    Given User is on the login page
    When User enter username "<username>" and password "<password>"
    And User click login button
    Then User verifies the succes message after login "Hello Srinivasanomr!"
    When User select "<location>","<hotels>", "<roomtype>", "<noOfRooms>", "<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    And User click Search button
    Then User verifies the success message after search "Select Hotel"

    Examples: 
      | username      | password  |
      | Srinivasanomr | Srini@123 |

  Scenario Outline: User search hotel without entering any details
    Given User is on the login page
    When User enter username "<username>" and password "<password>"
    And User click login button
    Then User verifies the succes message after login "Hello Srinivasanomr!"
    And User click Search button
    Then User verifies the error message after search "Please Selct a Location"

    Examples: 
      | username      | password  |
      | Srinivasanomr | Srini@123 |
