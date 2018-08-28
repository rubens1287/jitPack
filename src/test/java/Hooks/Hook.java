package Hooks;

import br.com.link.setup.ExtentReports;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends ExtentReports {

    @Before
    public void init() {
        super.setCucumberLanguage();
        super.setUpDriver();
    }

    @After
    public void cleanUp(Scenario scenario) {
        super.logReport(scenario);
        super.closeBrowser();

    }

}
