@excel
Feature: Excel automation

#  Option 1: RECOMMENDED
  Scenario: Excel automation
    Given user navigates to "https://editor.datatables.net/"
    When user enters "user_data" from "data_sheet.xlsx" and verifies new user is created
    Then close the application

#  Option 2:
#    Given user navigates to "https://editor.datatables.net/", enters "user_data" from "data_sheet.xlsx", verifies new user is created and close the application

#  name of the sheet: user_data
#  name of the excel file: data_sheet.xlsx