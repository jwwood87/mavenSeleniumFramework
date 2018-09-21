package resources.steps;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import utils.DriverFactory;

public class MasterHooks extends DriverFactory{

    @Before
    public void setup() {
        System.out.println("Got to the setup method in MasterHooks");
        driver = getDriver();
    }

    @After
    public void tearDown() {
        if(driver != null){
            System.out.println("Got to the tearDown method in MasterHooks");
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }
}
