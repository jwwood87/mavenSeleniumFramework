package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class DuckDuckHome extends BasePage{
    public @FindBy(xpath = "span[@id='wedonttrack'") WebElement field_lastName;
    public @FindBy(css = "span#wedonttrack") WebElement field_PrivacyPopout;
    public @FindBy(css = "span.badge-link__close") WebElement field_NotForSaleCloseBtn;

    public DuckDuckHome() throws IOException {
    super();
    }

    public DuckDuckHome getDuckDuckHomePage() throws Exception {
        System.out.println("Got to the new duckDuckHomePage");
        getDriver().get("https://duckduckgo.com/");

        return new DuckDuckHome();
    }

    public DuckDuckHome clickPrivacyPopout() throws Exception {
    if (field_NotForSaleCloseBtn.isDisplayed()) {
        waitAndClickElement(field_NotForSaleCloseBtn);
    }
        waitAndClickElement(field_PrivacyPopout);

        return new DuckDuckHome();
    }
}
