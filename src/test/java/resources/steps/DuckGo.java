package resources.steps;

import cucumber.api.java.en.Given;
import utils.DriverFactory;

public class DuckGo extends DriverFactory {

    @Given("^I navigate to DuckDuckGo$")
    public void navigateToDuckDuckGo() throws Exception {

        System.out.println("Got to the new method call in DuckGo.java");
        duckDuckHomePage.getDuckDuckHomePage();
    }
}