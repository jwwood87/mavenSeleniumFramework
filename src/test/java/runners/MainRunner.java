package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features =  {"src/test/java/resources/featureFiles"},
        glue =      {"resources.steps"},
        monochrome = true,
        tags = {},
        dryRun = false,
        plugin = {"pretty",
                "html:target/cucumber",
                "json:target/cucumber.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
)

public class MainRunner {

}
