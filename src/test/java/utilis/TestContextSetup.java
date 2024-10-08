package utilis;

import java.io.IOException;
import Reports.PageObjectManage;
import org.openqa.selenium.WebDriver;

public class TestContextSetup {

    public WebDriver driver;
    public String landingPageProductName;
    public PageObjectManage pageObjectManager;
    public TestBase testBase;

    public TestContextSetup() throws IOException, InterruptedException {
        testBase = new TestBase();
        driver = testBase.WebDriverManager();  // Correct method name here
        pageObjectManager = new PageObjectManage(testBase.WebDriverManager());  // Correct method name here

    }
}