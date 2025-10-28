package myapp.stepdefinitions;
import io.cucumber.java.en.*;
import myapp.pages.AmazonHomePage;
import myapp.utilities.Driver;
import org.openqa.selenium.Keys;

import static myapp.utilities.WaitUtils.waitFor;
import static org.junit.Assert.assertTrue;


public class AmazonSearchStepDefs {

    AmazonHomePage amazonHomePage = new AmazonHomePage();

    @Given("user is on amazon page")
    public void user_is_on_amazon_page() {
        Driver.getDriver().get("https://www.amazon.com");
        waitFor(2);
        Driver.getDriver().navigate().refresh();
        waitFor(1);
    }
    @When("user searches for iPhone")
    public void user_searches_for_i_phone() {
        amazonHomePage.searchBox.sendKeys("iPhone 17", Keys.ENTER);
        waitFor(1);
    }
    @Then("verify the results have iPhone")
    public void verify_the_results_have_i_phone() {
        String amazonTitle = Driver.getDriver().getTitle();
        System.out.println("amazonTitle = " + amazonTitle);
        waitFor(1);
        assertTrue(amazonTitle.contains("iPhone 17"));
    }
    @Then("close the application")
    public void close_the_application() {
        waitFor(1);
        Driver.closeDriver();
    }


    @When("user searches for teapot")
    public void user_searches_for_teapot() {
        amazonHomePage.searchBox.sendKeys("teapot", Keys.ENTER);
        waitFor(1);
    }
    @Then("verify the results have teapot")
    public void verify_the_results_have_teapot() {
        String amazonTitle = Driver.getDriver().getTitle();
        System.out.println("amazonTitle = " + amazonTitle);
        waitFor(1);
        assertTrue(amazonTitle.contains("teapot"));
    }


    @When("user searches for laptop")
    public void user_searches_for_laptop() {
        amazonHomePage.searchBox.sendKeys("laptop", Keys.ENTER);
        waitFor(1);
    }
    @Then("verify the results have laptop")
    public void verify_the_results_have_laptop() {
        String amazonTitle = Driver.getDriver().getTitle();
        System.out.println("amazonTitle = " + amazonTitle);
        waitFor(1);
        assertTrue(amazonTitle.contains("laptop"));
    }

    @When("user searches for flowers")
    public void user_searches_for_flowers() {
        amazonHomePage.searchBox.sendKeys("flowers", Keys.ENTER);
        waitFor(1);
    }
    @Then("verify the results have flowers")
    public void verify_the_results_have_flowers() {
        String amazonTitle = Driver.getDriver().getTitle();
        System.out.println("amazonTitle = " + amazonTitle);
        waitFor(1);
        assertTrue(amazonTitle.contains("flowers"));
    }

}
