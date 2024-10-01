Feature: Verifying omr Login Module

  Scenario Outline: Verifying omr login with valid credentials
    Given User is on the omr Login page
    When User enter "<userName>" and "<password>"
    And click the login button
    Then User should verify after login success message

    Examples: 
      | userName   | password  |
      | Greens OMR | Hello@123 |
      | bala       | YRN@123   |
      | arun       | HDBFJ@123 |
