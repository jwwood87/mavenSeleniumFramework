package resources.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import utils.DriverFactory;

public class DuckGo extends DriverFactory {

    @Given("^I navigate to DuckDuckGo$")
    public void navigateToDuckDuckGo() throws InterruptedException {
        getDriver().get("http://duckduckgo.com/");
        Thread.sleep(2000);
    }

    @Given("^I click the Twitter drop-down$")
    public void i_click_the_Twitter_drop_down() throws Throwable {
        Thread.sleep(2000);
        if (driver.findElement(By.cssSelector(".badge-link__close" )).isDisplayed()){
            driver.findElement(By.cssSelector(".badge-link__close" )).click();
        }
        driver.findElement(By.cssSelector(".header__clickable .popout-trig")).click();
        Thread.sleep(2000);
    }

    @Then("^the page displays Twitter, Reddit, and Blog links$")
    public void the_page_displays_Twitter_Reddit_and_Blog_links() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^I click the Hamburger menu$")
    public void i_click_the_Hamburger_menu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^the page displays Settings, Menu, privacy, and Keep-in-Touch$")
    public void the_page_displays_Settings_Menu_privacy_and_Keep_in_Touch() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^I click the Hamburger X button$")
    public void i_click_the_Hamburger_X_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("^I enter the search string \"([^\"]*)\"$")
    public void i_enter_the_search_string(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("^the following URL is present: \"([^\"]*)\"$")
    public void the_following_URL_is_present(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
