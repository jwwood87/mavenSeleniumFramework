package resources.steps;

import cucumber.api.java.en.Given;
import utils.DriverFactory;

public class DuckGo extends DriverFactory {

    @Given("^I navigate to DuckDuckGo$")
    public void navigateToDuckDuckGo() throws InterruptedException {
        getDriver().get("http://duckduckgo.com/");
        Thread.sleep(5000);
    }
}
