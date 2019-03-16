Feature: OLXScenarios

  Scenario: user login in OLX mobile platform with email
    Given the user wants to enter in OLX platform
    When the welcome page asks to the user to enter their country information
    And the user enters their location information
    And the user go to registration module with email
    And the user enters their email information
    Then the user is registered in the OLX platform by the email way
    And the user is in the OLX platform

  Scenario: user login in OLX mobile platform with facebook
    Given the user wants to enter in OLX platform with facebook
    When the welcome page asks to the user to enter their country information
    And the user enters their location information
    And the user go to registration module with facebook
    And the user enters their facebook information
    Then the user is registered in the OLX platform by the email way
    And the user is in the OLX platform