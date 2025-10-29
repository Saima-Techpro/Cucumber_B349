@datatables
Feature: DataTable WebPage

  Background:
    Given user is on "https://editor.datatables.net/" page

  Scenario Outline:
    When user clicks on New button
    And user enters first name as "<first_name>"
    And user enters last name as "<last_name>"
    And user enters position as "<position>"
    And user enters office as "<office>"
    And user enters extension as "<extension>"
    And user enters start date as "<start_date>"
    And user enters salary as "<salary>"
    And user clicks on Create button
    And user search for "<first_name>"
    Then verify Name column contains "<first_name>"
    And close the application

    Examples:
      | first_name | last_name | position  | office | extension | start_date | salary  |
      | Ali        | Can       | Dev        | NY     | 546       | 2025-04-10 | 500000  |
      | Shivani    | Vyas      | QA       | Berlin | 123       | 2025-02-20 | 800000  |
      | Fatih      | Tamer     | SQA       | Ottowa | 469       | 2025-03-01 | 9000000 |
      | Uranus     | Kohi      | PO        | Madrid | 586       | 2025-03-10 | 5000000 |
      | Ahmad      | Ramin     | President | Kabul  | 987       | 2025-03-15 | 9000000 |




