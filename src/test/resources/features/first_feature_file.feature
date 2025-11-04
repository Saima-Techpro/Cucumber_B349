@amazon_search
Feature: Amazon Search

  Background:
    Given user is on amazon page

  @iphone
  Scenario: Amazon search for iPhone
    When user searches for iPhone
    Then verify the results have iPhone
    And close the application

  @teapot @smoke
  Scenario: Amazon search for teapot
    When user searches for teapot
    Then verify the results have teapot
    And close the application

   @laptop
  Scenario: Amazon search for laptop
    When user searches for laptop
    Then verify the results have laptop
    And close the application

  @flowers
  Scenario: Amazon search for flowers
    When user searches for flowers
    Then verify the results have flowers
    And close the application