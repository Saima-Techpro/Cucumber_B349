@scenario_outline
Feature: Amazon Search

  Background:
    Given user is on amazon page


  Scenario Outline:
    When user searches for "<column_name>"
    Then verify the results have "<column_name>"
    And close the application

    Examples:
      | column_name        |
      | iPhone Pro         |
      | Tesla              |
      | BYD                |
      | Cooking pan        |
      | harry potter books |


#     shift + \ => |
#  To reformat code : option + command + l  -> MAC
#  To reformat code : control + alt + l  -> WINDOWS
#  Scenario Outline instead of Scenario ... to make it more dynamic
#  Examples keyword is MUST ... without this, it will complain
#  "<column_name>" => add the name of the column that has the test data
#  This test has 1 Scenario  Outline, but it will run this scenario (these test steps) 5 times
#  because there are 5 data in the column