Feature: DataTable WebPage

#  1st way of using Datatable = RECOMMENDED
  @datatables2
  Scenario: New User Creation
    Given user is on "https://editor.datatables.net/" page
    When user fills in the form for each new user and verifies it
      | first_name | last_name | position  | office | extension | start_date | salary  |
      | Ali        | Can       | Dev       | NY     | 546       | 2025-04-10 | 500000  |
      | Shivani    | Vyas      | QA        | Berlin | 123       | 2025-02-20 | 800000  |
      | Fatih      | Tamer     | SQA       | Ottowa | 469       | 2025-03-01 | 9000000 |
      | Uranus     | Kohi      | PO        | Madrid | 586       | 2025-03-10 | 5000000 |
      | Ahmad      | Ramin     | President | Kabul  | 987       | 2025-03-15 | 9000000 |



#  2nd way of using Datatable - NOT recommended

  @datatables3
  Scenario: New User Creation
    Given user is on "https://editor.datatables.net/" page
    When user clicks on New button
    And user fills in the form for new user1
      | first_name | Ali        |
      | last_name  | Can        |
      | position   | Dev        |
      | office     | NY         |
      | extension  | 546        |
      | start_date | 2025-04-10 |
      | salary     | 500000     |
    And user clicks on Create button
    And user search for "Ali"
    Then verify Name column contains "Ali"
    And user refreshes the page
    When user clicks on New button
    When user fills in the form for new user2
      | first_name | Shivani    |
      | last_name  | Vyas       |
      | position   | QA         |
      | office     | Berlin     |
      | extension  | 123        |
      | start_date | 2025-02-20 |
      | salary     | 800000     |
    And user clicks on Create button
    And user search for "Shivani"
    Then verify Name column contains "Shivani"
    And user refreshes the page
    When user clicks on New button
    When user fills in the form for new user3
      | first_name | Fatih      |
      | last_name  | Tamer      |
      | position   | SQA        |
      | office     | Ottowa     |
      | extension  | 469        |
      | start_date | 2025-03-01 |
      | salary     | 9000000    |
    And user clicks on Create button
    And user search for "Fatih"
    Then verify Name column contains "Fatih"
    And close the application




