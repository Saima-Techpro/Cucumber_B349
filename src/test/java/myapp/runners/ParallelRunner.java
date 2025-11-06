package myapp.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (

        plugin = {
                "pretty" , // makes steps readable on the console as well
                "html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:target/failedRerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },

        features = "./src/test/resources/features" ,
        glue = {"myapp.stepdefinitions" , "myapp.hooks"},
        dryRun = false,
        tags = "@parallel"
)

public class ParallelRunner {
}


/*
Runner class is used to run the feature files
And to add report plug ins
Runner class is used to connect the JAVA (step definitions) and NON-JAVA (feature files ) parts
@RunWith(Cucumber.class)  makes the Runner class runnable
@CucumberOptions is used to connect the feature files with their step definitions. It is also used for configurations and report plugins
features => provides path of the features folder
glue is used to connect feature file with it step definitions
dryRun = true generates the missing step definitions, without running the existing step
dryRun = false must be used to run the tests normally
@tags us used to run specific test scenarios

plugin is used to create reports at the framework level; reports like html, json, xml reports etc.
 */
