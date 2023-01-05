Feature: List and View Todos


  Scenario Outline: View Todos
    Given I am in "<browser>" browser and logged in with credentials "nagi" and "dummy"
    When I click on My Todos
    Then List of Todos should be visible

    Examples: 
      | browser |
      | chrome  |
      | Edge    |

  Scenario Outline: Change Status of Todo
    Given I am in "<browser>" browser and logged in with credentials "nagi" and "dummy"
    When I click on My Todos
    And I click on Change Status
    Then Todo Done Column should change

    Examples: 
      | browser |
      | chrome  |
      | Edge    |

  Scenario Outline: Update Todo
    Given I am in "<browser>" browser and logged in with credentials "nagi" and "dummy"
    When I click on My Todos
    And I click on update
    Then it should redirect to add-todo page
    When i edit the goal as "Goal Changed" and "31-12-2023" and click on add
    Then the i should redirect to my todos page and goal should be edited

    Examples: 
      | browser |
      | chrome  |
      | Edge    |

  #Scenario Outline: Delete Todo
    #Given I am in "<browser>" browser and logged in with credentials "nagi" and "dummy"
    #And I click on MyTodos
    #When I click on delete
    #Then todo should be deleted and disappear
#
    #Examples: 
      #| browser |
      #| chrome  |
      #| Edge    |
