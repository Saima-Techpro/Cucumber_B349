package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RentalCarHomePage {


    public RentalCarHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[text()=' Login/Register']")
    public WebElement loginOption;

    @FindBy (css = ".dropdown-toggle")
    public WebElement profileDropdown;

    @FindBy (xpath = "//a[text()='Logout']")
    public WebElement logoutButton;

    @FindBy (xpath = "//button[@class='ajs-button ajs-ok']")
    public WebElement logoutAcceptOption;
}
