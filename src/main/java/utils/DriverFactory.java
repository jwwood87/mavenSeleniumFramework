package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ContactUs;
import pageObjects.DuckDuckHome;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;
    public static ContactUs contactUsPage;
    public static DuckDuckHome duckDuckHomePage;

    public WebDriver getDriver() {
        try {
            System.out.println("Got to the getDriver method in the DriverFactory");
            ReadConfigFile file = new ReadConfigFile();
            String browser = file.getBrowser();
            switch (browser) {

                case "firefox":
                    if (driver == null) {
                        System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_DIRECTORY);
                        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                        capabilities.setCapability("marionette", true);
                        driver = new FirefoxDriver();
                    }
                    break;

                case "chrome":
                    if (driver == null) {
                        System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_DIRECTORY);
                        System.out.println("ChromeDriverDirectory: " + Constants.CHROME_DRIVER_DIRECTORY);
                        driver = new ChromeDriver();
                        driver.manage().window().maximize();
                    }
                    break;

                case "ie":
                    if (driver == null) {
                        System.setProperty("webdriver.ie.driver", Constants.IE_DRIVER_DIRECTORY);
                        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
                        capabilities.setCapability("ignoreZoomSetting", true);
                        driver = new InternetExplorerDriver(capabilities);
                        driver.manage().window().maximize();
                    }
            }

        } catch (Exception e) {
            System.out.println("Unable to load browser: " + e.getMessage());

        } finally {
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            contactUsPage = PageFactory.initElements(driver, ContactUs.class);
            duckDuckHomePage = PageFactory.initElements(driver, DuckDuckHome.class);
        }
        return driver;
    }
}
