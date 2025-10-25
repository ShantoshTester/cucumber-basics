package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/Registration.feature"},
                glue = {"stepdefinition","hooks"},
                dryRun = false,
                tags = "@Map",
                monochrome = false,
                plugin = {"pretty"})
public class TestRunner {


}
