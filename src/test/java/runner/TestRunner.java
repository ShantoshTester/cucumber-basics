package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/"},
                glue = {"stepdefinition","hooks"},
                dryRun = false,
                tags = "",
                monochrome = false,
                plugin = {"pretty",
                        "json:target/reports/report.json",
                        "json:target/reports/report.xml",
                        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},publish = false)
public class TestRunner {


}
