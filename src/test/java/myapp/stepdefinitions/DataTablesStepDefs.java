package myapp.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import myapp.pages.DataTablesPage;
import myapp.utilities.Driver;

import java.util.List;
import java.util.Map;

import static myapp.utilities.WaitUtils.waitFor;
import static org.junit.Assert.assertTrue;

public class DataTablesStepDefs {

    DataTablesPage dataTablesPage = new DataTablesPage();

//    ================= Step def for day02_datatables.feature ==============

    @Given("user is on {string} page")
    public void user_is_on_page(String url) {
        Driver.getDriver().get(url);
        waitFor(1);
    }
    @When("user clicks on New button")
    public void user_clicks_on_new_button() {
        dataTablesPage.newButton.click();
        waitFor(1);
    }
    @When("user enters first name as {string}")
    public void user_enters_first_name_as(String firstName) {
        dataTablesPage.firstNameInput.sendKeys(firstName);
        waitFor(1);
    }
    @When("user enters last name as {string}")
    public void user_enters_last_name_as(String lastName) {
        dataTablesPage.lastNameInput.sendKeys(lastName);
        waitFor(1);
    }
    @When("user enters position as {string}")
    public void user_enters_position_as(String position) {
        dataTablesPage.positionInput.sendKeys(position);
        waitFor(1);
    }
    @When("user enters office as {string}")
    public void user_enters_office_as(String office) {
        dataTablesPage.officeInput.sendKeys(office);
        waitFor(1);
    }
    @When("user enters extension as {string}")
    public void user_enters_extension_as(String extension) {
        dataTablesPage.extensionInput.sendKeys(extension);
        waitFor(1);
    }
    @When("user enters start date as {string}")
    public void user_enters_start_date_as(String startDate) {
        dataTablesPage.startDateInput.sendKeys(startDate);
        waitFor(1);
    }
    @When("user enters salary as {string}")
    public void user_enters_salary_as(String salary) {
        dataTablesPage.salaryInput.sendKeys(salary);
        waitFor(1);
    }
    @When("user clicks on Create button")
    public void user_clicks_on_create_button() {
        dataTablesPage.createButton.click();
        waitFor(2);
    }
    @When("user search for {string}")
    public void user_search_for(String firstName) {
        dataTablesPage.searchBox.sendKeys(firstName);
        waitFor(1);
    }
    @Then("verify Name column contains {string}")
    public void verify_name_column_contains(String firstName) {
        assertTrue(dataTablesPage.nameField.getText().contains(firstName));
    }

//    ================= How to use DataTables with Scenario only =====================
//    ================= Step def for day03_datatables.feature ==============

    // Create an empty List of Map (of String Key:Value pair) to store the data coming from DataTable, so we can convert it to Java map and use it for our test
    List<Map<String , String>> userList;

    @When("user fills in the form for each new user and verifies it")
    public void user_fills_in_the_form_for_each_new_user_and_verify(DataTable dataTable) {
        userList = dataTable.asMaps(String.class, String.class);
        // System.out.println(userList.get("first_name"));

        for (Map<String, String> eachUser : userList){

            String firstName = eachUser.get("first_name");
            String lastName = eachUser.get("last_name");
            String position = eachUser.get("position");
            String office = eachUser.get("office");
            String extension = eachUser.get("extension");
            String startDate = eachUser.get("start_date");
            String salary = eachUser.get("salary");

            // Click on New button
            dataTablesPage.newButton.click();
            waitFor(1);
            // Fill the form
            dataTablesPage.firstNameInput.sendKeys(firstName);
            dataTablesPage.lastNameInput.sendKeys(lastName);
            dataTablesPage.positionInput.sendKeys(position);
            dataTablesPage.officeInput.sendKeys(office);
            dataTablesPage.extensionInput.sendKeys(extension);
            dataTablesPage.startDateInput.sendKeys(startDate);
            dataTablesPage.salaryInput.sendKeys(salary);

            // Click on the Create button
            dataTablesPage.createButton.click();
            waitFor(1);

            // Search and verify
            dataTablesPage.searchBox.sendKeys(firstName);
            waitFor(1);
            assertTrue(dataTablesPage.nameField.getText().contains(firstName));
            waitFor(1);

            // Clear the previous data
            dataTablesPage.searchBox.clear();
            waitFor(1);
            // Refresh the page
            Driver.getDriver().navigate().refresh();


        }
        // close the application
        Driver.closeDriver();


    }

//    ================= Step def for day03_datatables.feature ==============
//    ================== @datatables3 ==============
    Map<String, String > userMap;

    @When("user fills in the form for new user1")
    public void user_fills_in_the_form_for_new_user1(DataTable dataTable) {
        userMap = dataTable.asMap();
        String firstName = userMap.get("first_name");
        String lastName = userMap.get("last_name");
        String position = userMap.get("position");
        String office = userMap.get("office");
        String extension = userMap.get("extension");
        String startDate = userMap.get("start_date");
        String salary = userMap.get("salary");

        // Fill the form
        dataTablesPage.firstNameInput.sendKeys(firstName);
        dataTablesPage.lastNameInput.sendKeys(lastName);
        dataTablesPage.positionInput.sendKeys(position);
        dataTablesPage.officeInput.sendKeys(office);
        dataTablesPage.extensionInput.sendKeys(extension);
        dataTablesPage.startDateInput.sendKeys(startDate);
        dataTablesPage.salaryInput.sendKeys(salary);

    }

    @Then("user refreshes the page")
    public void user_refreshes_the_page() {
       dataTablesPage.searchBox.clear();
       waitFor(1);
       Driver.getDriver().navigate().refresh();
    }

    @When("user fills in the form for new user2")
    public void user_fills_in_the_form_for_new_user2(DataTable dataTable) {
        userMap = dataTable.asMap();
        String firstName = userMap.get("first_name");
        String lastName = userMap.get("last_name");
        String position = userMap.get("position");
        String office = userMap.get("office");
        String extension = userMap.get("extension");
        String startDate = userMap.get("start_date");
        String salary = userMap.get("salary");

        // Fill the form
        dataTablesPage.firstNameInput.sendKeys(firstName);
        dataTablesPage.lastNameInput.sendKeys(lastName);
        dataTablesPage.positionInput.sendKeys(position);
        dataTablesPage.officeInput.sendKeys(office);
        dataTablesPage.extensionInput.sendKeys(extension);
        dataTablesPage.startDateInput.sendKeys(startDate);
        dataTablesPage.salaryInput.sendKeys(salary);
    }
    @When("user fills in the form for new user3")
    public void user_fills_in_the_form_for_new_user3(DataTable dataTable) {
        userMap = dataTable.asMap();
        String firstName = userMap.get("first_name");
        String lastName = userMap.get("last_name");
        String position = userMap.get("position");
        String office = userMap.get("office");
        String extension = userMap.get("extension");
        String startDate = userMap.get("start_date");
        String salary = userMap.get("salary");

        // Fill the form
        dataTablesPage.firstNameInput.sendKeys(firstName);
        dataTablesPage.lastNameInput.sendKeys(lastName);
        dataTablesPage.positionInput.sendKeys(position);
        dataTablesPage.officeInput.sendKeys(office);
        dataTablesPage.extensionInput.sendKeys(extension);
        dataTablesPage.startDateInput.sendKeys(startDate);
        dataTablesPage.salaryInput.sendKeys(salary);
    }











}
