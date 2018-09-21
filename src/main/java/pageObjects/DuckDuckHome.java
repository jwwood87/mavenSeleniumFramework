package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class DuckDuckHome extends BasePage{
    public @FindBy(css = "a#logo_homepage_link") WebElement field_DuckLogo;
    public @FindBy(xpath = "span[@id='wedonttrack']") WebElement field_lastName;
    public @FindBy(css = "span#wedonttrack") WebElement field_PrivacyPopout;
    public @FindBy(css = "span[@data-type='social']") WebElement field_SocialPopout;
    public @FindBy(css = "span.badge-link__close") WebElement field_NotForSaleCloseBtn;
    public @FindBy(css = "a.header__button--menu") WebElement field_HamburgerBtn;
    public @FindBy(css = "span.badge-link__close") WebElement field_CloseAdTrackPopup;

    public DuckDuckHome() throws IOException {
    super();
    }

    public DuckDuckHome getDuckDuckHomePage() throws Exception {
        System.out.println("Got to the new duckDuckHomePage");
        getDriver().get("https://duckduckgo.com/");

        return new DuckDuckHome();
    }

    public DuckDuckHome closeAdTrackPopup() throws Exception{
        System.out.println("Got to close the Ad Track Popup");
        if (WaitUntilWebElementIsVisible(field_CloseAdTrackPopup)){
            waitAndClickElement(field_CloseAdTrackPopup);
        }

        return new DuckDuckHome();
    }

    public DuckDuckHome clickPrivacyPopout() throws Exception {
    if (field_NotForSaleCloseBtn.isDisplayed()) {
        waitAndClickElement(field_NotForSaleCloseBtn);
    }
        waitAndClickElement(field_PrivacyPopout);

        return new DuckDuckHome();
    }

    public boolean theDuckDuckLogoIsDisplayed() throws Exception{
        if (WaitUntilWebElementIsVisible(field_DuckLogo)){
            System.out.println("Social is displayed");
            return true;
        }
        else
            return false;
    }

    public boolean thePrivacyPopoutButtonIsDisplayed() throws Exception{
        if (WaitUntilWebElementIsVisible(field_PrivacyPopout)){
            System.out.println("Privacy is displayed!");
            return true;
        }
        else
            return false;
    }

    public boolean theSocialPopoutButtonIsDisplayed() throws Exception{
        if (WaitUntilWebElementIsVisible(field_SocialPopout)){
            System.out.println("Social is displayed");
            return true;
        }
        else
            return false;
    }

    public boolean theHamburgerButtonIsDisplayed() throws Exception{
        if (WaitUntilWebElementIsVisible(field_HamburgerBtn)){
            System.out.println("Social is displayed");
            return true;
        }
        else
            return false;
    }
}
