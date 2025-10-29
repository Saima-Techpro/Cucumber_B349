package myapp.stepdefinitions;

import io.cucumber.java.en.*;
import myapp.pages.AmazonHomePage;
import myapp.utilities.Driver;
import org.openqa.selenium.Keys;

import static myapp.utilities.WaitUtils.waitFor;
import static org.junit.Assert.assertTrue;


public class CommonStepDefs {

    AmazonHomePage amazonHomePage = new AmazonHomePage();

    @When("user searches for {string}")
    public void user_searches_for(String searchItem) {
        amazonHomePage.searchBox.sendKeys(searchItem , Keys.ENTER);
        waitFor(1);

    }
    @Then("verify the results have {string}")
    public void verify_the_results_have(String searchItem) {
        String amazonTitle = Driver.getDriver().getTitle();
        System.out.println("amazonTitle = " + amazonTitle);
        waitFor(1);
        assertTrue(amazonTitle.contains(searchItem));
    }

    @Then("close the application")
    public void close_the_application() {
        waitFor(1);
        Driver.closeDriver();
    }


}
