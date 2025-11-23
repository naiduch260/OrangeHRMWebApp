Feature: OrangeHRM application

  @regression
  Scenario Outline: User Login to OrangeHRM page
    Given user navigate to Login page
    When user enter username "<userName>" field
    And user enter password "<password>" field
    And user click on login button
    Then user navigate Dasbord Page

    Examples:
      | userName | password |
      | Admin    | admin123 |

  @p1
  Scenario Outline: User not able to login with invalid credentials
    Given user navigate to Login page
    When user enter username "<userName>" field
    And user enter password "<password>" field
    And user click on login button
    Then user will get error message

    Examples:
      | userName | password  |
      | Admin    | admin1235 |

  @p3
  Scenario: Verify user display the Required error message under Usare Name field
    Given user navigate to Login page
    And user click on login button
    Then user will get error message under username field

  @p2
  Scenario Outline: verify userdisplay the Required error message only under password fieldd
    Given user navigate to Login page
    When user enter username "<userName>" field
    And user click on login button
    Then user will get error message under password field

    Examples:
      | userName | password |
      | Admin    |          |

  Scenario: Verify user display the Required error message under Usare Name field
    Given user navigate to Login page
    And user click on login button
    Then user will get error message under username field
