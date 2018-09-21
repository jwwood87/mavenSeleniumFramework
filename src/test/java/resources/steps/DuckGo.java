package resources.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.DriverFactory;

public class DuckGo extends DriverFactory {

    @Given("^I navigate to DuckDuckGo$")
    public void navigateToDuckDuckGo() throws Exception {
        System.out.println("Got to the new method call in DuckGo.java");
        duckDuckHomePage.getDuckDuckHomePage();
    }

    @Given("^I close the Ad Track Popup$")
    public void closeTheAdTrackPopup() throws Exception {
        System.out.println("Got to the new method call close AdTrackPopup");
        duckDuckHomePage.closeAdTrackPopup();
    }

    @Given("^I click the Privacy Dropdown Popout$")
    public void clickThePrivacyDropdownPopout() throws Exception {
        System.out.println("Got to the new method call in DuckGo.java");
        duckDuckHomePage.clickPrivacyPopout();
    }

    @Then("^the Duck Duck Logo is displayed$")
    public void the_Duck_Duck_Logo_is_displayed() throws Throwable {
        System.out.println("Got to the DuckDuck Logo is displayed");
        duckDuckHomePage.theDuckDuckLogoIsDisplayed();

    }

    @Then("^the Privacy Dropdown Popout button is displayed$")
    public void the_Privacy_Dropdown_Popout_button_is_displayed() throws Exception {
        System.out.println("Got to the new method call, Privacy is displayed");
        duckDuckHomePage.thePrivacyPopoutButtonIsDisplayed();
    }

    @Then("^the Social Networking button is displayed$")
    public void the_Social_Networking_button_is_displayed() throws Exception {

    }

    @Then("^the hamburger icon is displayed$")
    public void the_hamburger_icon_is_displayed() throws Exception {

    }

}