@parameterised
Feature: Dynamic Amazon Search

  Background:
    Given user is on amazon page

  @iphone
  Scenario: Amazon search for iPhone
    When user searches for "iPhone 15"
    Then verify the results have "iPhone 15"
    And close the application

  @teapot
  Scenario: Amazon search for teapot
    When user searches for "porcelain teapot"
    Then verify the results have "porcelain teapot"
    And close the application

  @laptop
  Scenario: Amazon search for laptop
    When user searches for "huawei laptop"
    Then verify the results have "huawei laptop"
    And close the application

  @flowers
  Scenario: Amazon search for flowers
    When user searches for "yellow flowers"
    Then verify the results have "yellow flowers"
    And close the application
