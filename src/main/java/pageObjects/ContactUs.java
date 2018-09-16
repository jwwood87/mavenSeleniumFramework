package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class ContactUs extends BasePage{
    public @FindBy(xpath = "//input[@name='last_name']") WebElement field_lastName;
    public @FindBy(xpath = "//input[@name='first_name']") WebElement field_firstName;
    public @FindBy(xpath = "//input[@name='email']") WebElement field_email;
    public @FindBy(xpath = "//textarea[@name='message']") WebElement field_message;
    public @FindBy(xpath = "//[@type='reset']") WebElement field_resetButton;
    public @FindBy(xpath = "//[@type='submit']") WebElement field_submitButton;

    public ContactUs() throws IOException {
        super();
    }

    public ContactUs getContactUsPage() throws Exception {
        System.out.println("Got to the new getContactUsPage");
        getDriver().get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
        return new ContactUs();
    }

    public ContactUs enterFirstName(String firstName) throws Exception {
        sendKeysToWebElement(field_firstName, firstName);
        return new ContactUs();
    }

    public ContactUs enterLastName(String lastName) throws Exception {
        sendKeysToWebElement(field_firstName, lastName);
        return new ContactUs();
    }
}
