Feature: Car Rental Test 

  @rental-login
  Scenario: Car Rental Login Positive Test
    Given user navigates to "https://www.speedyli.com/"
    When user clicks on Login option
    And user enters valid email address
    And user enters valid password
    And user clicks on Login button
    Then verify login is successful
    When user clicks on Logout button
    Then verify logout is successful
    And close the application