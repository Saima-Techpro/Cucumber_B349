package myapp.stepdefinitions;
import io.cucumber.java.en.*;
import myapp.pages.DataTablesPage;
import myapp.utilities.Driver;
import myapp.utilities.ExcelUtils;

import java.util.List;
import java.util.Map;

import static myapp.utilities.WaitUtils.waitFor;
import static org.junit.Assert.assertTrue;

public class ExcelAutomation {

    DataTablesPage dataTablesPage = new DataTablesPage();
    ExcelUtils excelUtils;
    List<Map<String, String>> userList;

    @Given("user navigates to {string}")
    public void user_navigates_to(String url) {
        Driver.getDriver().get(url);

    }
    @When("user enters {string} from {string} and verifies new user is created")
    public void user_enters_from_and_verifies_new_user_is_created(String sheetName, String excelFile) {
        String pathOfFile = "src/test/resources/data_sheet.xlsx";
        excelUtils = new ExcelUtils(pathOfFile, sheetName);

        userList = excelUtils.getDataList();
        System.out.println("userList = " + userList);

        for (Map<String, String> eachUser : userList){
            // Click on the New button
            dataTablesPage.newButton.click();
            waitFor(1);

            // Now start sending the data
//            String firstName = eachUser.get("first_name");
//            dataTablesPage.firstNameInput.sendKeys(firstName);
            dataTablesPage.firstNameInput.sendKeys(eachUser.get("first_name"));
            dataTablesPage.lastNameInput.sendKeys(eachUser.get("last_name"));
            dataTablesPage.positionInput.sendKeys(eachUser.get("position"));
            dataTablesPage.officeInput.sendKeys(eachUser.get("office"));
            dataTablesPage.extensionInput.sendKeys(eachUser.get("extension"));
            dataTablesPage.startDateInput.sendKeys(eachUser.get("start_date"));
            dataTablesPage.salaryInput.sendKeys(eachUser.get("salary"));
            waitFor(2);

            // Now click on Create button
            dataTablesPage.createButton.click();
            waitFor(1);

            // Search and verify new user is created
            dataTablesPage.searchBox.sendKeys(eachUser.get("first_name"));
            waitFor(1);
            assertTrue(dataTablesPage.nameField.getText().contains(eachUser.get("first_name")));
            waitFor(1);

            dataTablesPage.searchBox.clear();
            Driver.getDriver().navigate().refresh();

        }


















    }


}
