package myapp.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import myapp.utilities.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

//    @Before
//    public void setUpApi(){
//        System.out.printf("Before hooks for APi....");
//    }

    @Before
    public void setUpScenario(){
        System.out.printf("Before hooks....");
    }


    @After
    public void tearDown(Scenario scenario){
        System.out.println("After hooks ... ");

        if (scenario.isFailed()){
           byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
           scenario.attach(screenshot , "image/png", "failed scenario");
           Driver.closeDriver();
        }
    }

    @After ("@teapot")
    public void tearDownSpecific(){
        System.out.printf("This after method comes form Hooks class specifically for this Scenario");
    }








}
