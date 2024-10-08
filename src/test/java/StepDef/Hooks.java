//package StepDef;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import org.testng.annotations.AfterSuite;
//import utilis.TestContextSetup;
//import utilis.HTML_TO_PDF;
//import java.io.IOException;
//
//
//public class Hooks {
//    private TestContextSetup testContextSetup;
//
//    public Hooks(TestContextSetup testContextSetup) {
//        this.testContextSetup = testContextSetup;
//
//    }
//
//    @Before
//    public void BeforeScenario() throws IOException, InterruptedException {
//        // Initialize a new driver before each scenario
//        testContextSetup.testBase.WebDriverManager();
//    }
//
//    @After
//    public void AfterScenario() throws IOException, InterruptedException {
//        testContextSetup.testBase.CloseDriver();
//    }
//
//    @AfterSuite
//    public void afterSuite() throws IOException, InterruptedException {
//        HTML_TO_PDF.pdf_html();
//        System.out.println("HTML report successfully converted to PDF.");
//    }
//}



package StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.AfterAll;
import utilis.TestContextSetup;
import utilis.HTML_TO_PDF;
import java.io.IOException;

public class Hooks {
    private TestContextSetup testContextSetup;

    public Hooks(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    @Before
    public void BeforeScenario() throws IOException, InterruptedException {
        // Initialize a new driver before each scenario
        testContextSetup.testBase.WebDriverManager();
    }

    @After
    public void AfterScenario() throws IOException, InterruptedException {
        // Close the driver after each scenario
        testContextSetup.testBase.CloseDriver();
    }

    @AfterAll
    public static void afterAllScenarios() throws IOException, InterruptedException {
        // Generate the PDF report after all scenarios have completed
        HTML_TO_PDF.pdf_html();
        System.out.println("HTML report successfully converted to PDF.");
    }
}
