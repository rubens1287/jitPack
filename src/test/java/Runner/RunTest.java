package Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import br.com.link.setup.*;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import static br.com.link.setup.KlovReports.setupKlovReport;
import static br.com.link.setup.ExtentReports.*;

@RunWith(Cucumber.class)
@CucumberOptions(
       features = "features",
       glue = {"StepDefinition","Hooks"},
       tags = {},
	   dryRun = false,
       plugin = {
               "pretty",
               "html:target/cucumber-reports/cucumber-pretty",
               "json:target/cucumber-reports/CucumberTestReport.json",
               "rerun:target/cucumber-reports/rerun.txt",
               "junit:target/cukes/junit.xml",
               "com.cucumber.listener.ExtentCucumberFormatter:"
       })
public class RunTest extends ConfigFramework {
	  
	@BeforeClass
	public static void setUp() {
		setExtentReportsPath();
		setupKlovReport();
	}

	@AfterClass
	public static void afterClass() {
		setupExtentReports();
	}

}
