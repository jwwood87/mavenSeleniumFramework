package pageObjects;

import java.io.IOException;

public class DuckDuckHome extends BasePage{

    public DuckDuckHome() throws IOException {
        super();
    }

    public DuckDuckHome getDuckDuckHomePage() throws Exception {
        System.out.println("Got to the new duckDuckHomePage");
        getDriver().get("https://duckduckgo.com/");
        return new DuckDuckHome();
    }

}
