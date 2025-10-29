package myapp.stepdefinitions;

import io.cucumber.java.en.*;
import myapp.pages.DataTablesPage;
import myapp.utilities.Driver;

import static myapp.utilities.WaitUtils.waitFor;
import static org.junit.Assert.assertTrue;

public class DataTablesStepDefs {

    DataTablesPage dataTablesPage = new DataTablesPage();

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
}
