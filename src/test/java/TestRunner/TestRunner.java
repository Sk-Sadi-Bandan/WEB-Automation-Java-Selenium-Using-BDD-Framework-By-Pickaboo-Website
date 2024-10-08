package TestRunner;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Listeners;

@Test
@CucumberOptions(
        features = "src/test/java/Feature", // Path to your feature files
        glue = "StepDef", // Path to your step definitions
        monochrome = true, // Clean console output
        tags = "@Release", // Tags to filter tests
        plugin = {
                "rerun:target/failed_scenarios.txt" // Rerun failed scenarios
        }
)
@Listeners({org.uncommons.reportng.HTMLReporter.class, org.uncommons.reportng.JUnitXMLReporter.class}) // ReportNG listeners
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false) // Set parallel execution (true for parallel)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
