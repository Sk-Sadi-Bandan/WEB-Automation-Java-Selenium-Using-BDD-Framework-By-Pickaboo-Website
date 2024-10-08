package StepDef;


import Locator.Computers;
import Locator.Smartphones;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import utilis.HTML_TO_PDF;
import java.io.IOException;
import utilis.TestContextSetup;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;


public class Computers_Test {

    private TestContextSetup testContextSetup;
    private WebDriver driver;
    private Computers computers;
    private HTML_TO_PDF html_to_pdf ;
    private int wait = 3000;


    public Computers_Test(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.driver = testContextSetup.driver;
        this.computers = testContextSetup.pageObjectManager.getcomputers();
    }

    ////////////////////////////////////Test Case-1///////////////////////////////////

    @Given("Check that Computers section is displayed")
    public void checkThatComputersSectionIsDisplayed() throws InterruptedException {
        Thread.sleep(wait);
        Assert.assertTrue(computers.Computers().isDisplayed());
        Thread.sleep(wait);
    }

    @When("Click on Computers section")
    public void clickOnComputersSection() throws InterruptedException {
        computers.Computers().click();
        Thread.sleep(wait);
    }

    @Then("Check that First Computers section is displayed")
    public void checkThatFirstComputersSectionIsDisplayed() throws InterruptedException {
        Assert.assertTrue(computers.Firstproduct().isDisplayed());
        Thread.sleep(wait);
    }

    @When("Click on First Computers section")
    public void clickOnFirstComputersSection() throws InterruptedException {
        computers.Firstproduct().click();
        Thread.sleep(wait);
    }

    ////////////////////////////////////Test Case-1///////////////////////////////////

    @Then("Check that Add Your Review section is displayed")
    public void checkThatAddYourReviewSectionIsDisplayed() throws InterruptedException {
        Assert.assertTrue(computers.AddReview().isDisplayed());
        Thread.sleep(wait);
    }

    @When("Click on Add Your Review section")
    public void clickOnAddYourReviewSection() throws InterruptedException {
        computers.AddReview().click();
        Thread.sleep(wait);
    }

    @Then("Check that Review Title section is displayed")
    public void checkThatReviewTitleSectionIsDisplayed() throws InterruptedException {
        Assert.assertTrue(computers.ReviewTitle().isDisplayed());
        Thread.sleep(wait);
    }

    @When("Input on Review Title section")
    public void inputOnReviewTitleSection() throws InterruptedException {
        Thread.sleep(wait);
        computers.ReviewTitle().sendKeys("Computers");
    }

    @Then("Check that Feedback Product section is displayed")
    public void checkThatFeedbackProductSectionIsDisplayed() throws InterruptedException {
        Assert.assertTrue(computers.FeedbackProduct().isDisplayed());
        Thread.sleep(wait);
    }

    @When("Input on Feedback Product section")
    public void inputOnFeedbackProductSection() throws InterruptedException {
        Thread.sleep(wait);
        computers.FeedbackProduct().sendKeys("Great Products");
    }

    @Then("Check that Submit Review button is displayed")
    public void checkThatSubmitReviewButtonIsDisplayed() throws InterruptedException {
        Assert.assertTrue(computers.SubmitReview().isDisplayed());
        Thread.sleep(wait);
    }

    @When("Click on Submit Review button")
    public void clickOnSubmitReviewButton() throws InterruptedException {
        computers.SubmitReview().click();
        Thread.sleep(wait);
    }
}
