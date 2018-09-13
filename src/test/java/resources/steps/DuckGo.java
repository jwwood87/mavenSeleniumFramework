package resources.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.DriverFactory;

public class DuckGo extends DriverFactory {

    @Given("^I navigate to DuckDuckGo$")
    public void navigateToDuckDuckGo() throws InterruptedException {
        getDriver().get("http://duckduckgo.com/");
        Thread.sleep(1000);
    }

    @Given("^I remove the Extension window$")
    public void RemoveTheExtensionWindow() throws Throwable {
        Thread.sleep(1000);
        if (driver.findElement(By.cssSelector(".badge-link__close" )).isDisplayed()){
            driver.findElement(By.cssSelector(".badge-link__close" )).click();
        }
        Thread.sleep(1000);
    }

    @Given("^I click the Privacy drop-down$")
    public void ClickThePrivacyDropDown() throws Throwable {
        Thread.sleep(1000);
        if (driver.findElement(By.cssSelector(".badge-link__close" )).isDisplayed()){
            driver.findElement(By.cssSelector(".badge-link__close" )).click();
        }
        driver.findElement(By.cssSelector(".header__clickable .popout-trig")).click();
        Thread.sleep(2000);
    }

    @Given("^I click the Twitter drop-down$")
    public void i_click_the_Twitter_drop_down() throws Throwable {
        Thread.sleep(1000);
        if (driver.findElement(By.cssSelector(".badge-link__close" )).isDisplayed()){
            driver.findElement(By.cssSelector(".badge-link__close" )).click();
        }
        Thread.sleep((4000));
        driver.findElement(By.cssSelector("span[data-type='social']")).click();
        Thread.sleep(1000);
    }

    @Then("^the social network links are displayed$")
    public void pageDisplaysTheTwitterLink() throws Throwable {
        Assert.assertTrue(driver.findElement(By.cssSelector("[data-id='twitter']")).isDisplayed());

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
