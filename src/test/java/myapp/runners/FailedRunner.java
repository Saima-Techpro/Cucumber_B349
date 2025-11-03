package myapp.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (

        plugin = {
                "pretty" , // creates reports on the console as well
                "html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },

        features = "@target/failedRerun.txt" ,
        glue = {"myapp.stepdefinitions" , "myapp.hooks"},
        dryRun = false,
        tags = "@iphone"
)

public class FailedRunner {
}
