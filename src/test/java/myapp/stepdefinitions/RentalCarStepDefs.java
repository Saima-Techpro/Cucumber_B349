package myapp.stepdefinitions;

import io.cucumber.java.en.*;
import myapp.pages.RentalCarHomePage;
import myapp.pages.RentalCarLoginPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.ExcelUtils;
import myapp.utilities.ExtentReportUtils;
import myapp.utilities.MediaUtils;


import java.io.IOException;

import static myapp.utilities.WaitUtils.waitFor;
import static org.junit.Assert.assertTrue;

public class RentalCarStepDefs {

    RentalCarHomePage rentalCarHomePage = new RentalCarHomePage();
    RentalCarLoginPage rentalCarLoginPage = new RentalCarLoginPage();


    @When("user clicks on Login option")
    public void user_clicks_on_login_option() {
        ExtentReportUtils.createTestReport("Positive Login Test" , "Rental Car Login  Test");
        rentalCarHomePage.loginOption.click();
        waitFor(1);


    }
    @When("user enters valid email address")
    public void user_enters_valid_email_address() {
        rentalCarLoginPage.emailInput.sendKeys(ConfigReader.getProperty("rentalCarEmail"));
        waitFor(1);
        ExtentReportUtils.info("User enters valid email");
    }
    @When("user enters valid password")
    public void user_enters_valid_password() {
        rentalCarLoginPage.passwordInput.sendKeys(ConfigReader.getProperty("rentalCarPassword"));
        waitFor(1);
        ExtentReportUtils.info("User enters valid password");
    }
    @When("user clicks on Login button")
    public void user_clicks_on_login_button() {
        rentalCarLoginPage.loginButton.click();
        waitFor(1);
    }
    @Then("verify login is successful")
    public void verify_login_is_successful() {
        assertTrue(rentalCarHomePage.profileDropdown.isDisplayed());
        waitFor(1);
        ExtentReportUtils.passAndCaptureScreenshot("Login is successful!");
    }
    @When("user clicks on Logout button")
    public void user_clicks_on_logout_button()  {
        rentalCarHomePage.profileDropdown.click();
        waitFor(1);
        ExtentReportUtils.info("user clicks on Logout button");
        rentalCarHomePage.logoutButton.click();
        waitFor(1);
        rentalCarHomePage.logoutAcceptOption.click();
        waitFor(1);
    }
    @Then("verify logout is successful")
    public void verify_logout_is_successful() {
        assertTrue(rentalCarHomePage.loginOption.isDisplayed());
        ExtentReportUtils.passAndCaptureScreenshot("Logout is successful!");
        ExtentReportUtils.flush();
    }

}
