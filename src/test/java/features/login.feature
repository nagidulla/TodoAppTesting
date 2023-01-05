Feature: Login Feature

  Scenario Outline: Login With positive Scenarios
    Given I am in "<browser>" browser and navigated to root or Login page
    When I Enter "<username>" and "<password>"
    Then I should Redirect to Welcome Page with "<username>"

    Examples: 
      | username | password | browser |
      | nagi     | dummy    | chrome  |
      | nagi     | dummy    | Edge    |

  Scenario Outline: Login With Negative Scenarios
    Given I am in "<browser>" browser and navigated to root or Login page
    When I Enter "<username>" and "<password>"
    Then I should get error

    Examples: 
      | username | password | browser |
      | nagi     | dummy123 | chrome  |
      | sai      | dummy    | Edge    |
