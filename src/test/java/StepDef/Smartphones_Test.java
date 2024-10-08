package StepDef;


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


public class Smartphones_Test {
    private TestContextSetup testContextSetup;
    private WebDriver driver;
    private Smartphones smartphones;
    private HTML_TO_PDF html_to_pdf ;
    private int wait = 3000;


    public Smartphones_Test(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.driver = testContextSetup.driver;
        this.smartphones = testContextSetup.pageObjectManager.getsmartphones();
    }

    @Given("Check that Mobile Number section is displayed")
    public void checkThatMobileNumberSectionIsDisplayed() throws InterruptedException {
        Thread.sleep(wait);
        Assert.assertTrue(smartphones.MobileNumber().isDisplayed());
    }

    @Then("Input the Mobile Number")
    public void inputTheMobileNumber() throws InterruptedException {
        Thread.sleep(wait);
        smartphones.MobileNumber().sendKeys("01749653931");
    }

    @And("Input The Password")
    public void inputThePassword() throws InterruptedException {
        Thread.sleep(wait);
        smartphones.Password_().sendKeys("sadi1234");
    }

    @When("Click SIGN IN")
    public void clickSIGNIN() throws InterruptedException {
        Thread.sleep(wait);
        smartphones.SingnIN_().click();
        System.out.println(driver.getCurrentUrl());
    }

    ////////////////////////////////////Test Case-1///////////////////////////////////

    @Given("Check that Smartphones section is displayed")
    public void checkThatSmartphonesSectionIsDisplayed() throws InterruptedException {
        Thread.sleep(wait);
        Assert.assertTrue(smartphones.Smartphones().isDisplayed());
        Thread.sleep(wait);
    }

    @When("Click on Smartphones section")
    public void clickOnSmartphonesSection() throws InterruptedException {
        smartphones.Smartphones().click();
        Thread.sleep(wait);
    }

    @Then("Check that Camera Phone section is displayed")
    public void checkThatCameraPhoneSectionIsDisplayed() throws InterruptedException {
        Assert.assertTrue(smartphones.Cameraphone().isDisplayed());
        Thread.sleep(wait);
    }

    @When("Click on Camera Phone section")
    public void clickOnCameraPhoneSection() throws InterruptedException {
        smartphones.Cameraphone().click();
        Thread.sleep(wait);
    }

    @Then("Check that First Camera Phone section is displayed")
    public void checkThatFirstCameraPhoneSectionIsDisplayed() throws InterruptedException {
        Assert.assertTrue(smartphones.Firstproduct().isDisplayed());
        Thread.sleep(wait);
    }

    @When("Click on First Camera Phone section")
    public void clickOnFirstCameraPhoneSection() throws InterruptedException {
        smartphones.Firstproduct().click();
        Thread.sleep(wait);
    }

    @Then("Check that Selected Color section is displayed")
    public void checkThatSelectedColorSectionIsDisplayed() throws InterruptedException {
        Assert.assertTrue(smartphones.Selectcolor().isDisplayed());
        Thread.sleep(wait);
    }

    @When("Click on Selected Color section")
    public void clickOnSelectedColorSection() throws InterruptedException {
        smartphones.Selectcolor().click();
        Thread.sleep(wait);
    }


    @Then("Check that Add To Cart section is displayed")
    public void checkThatAddToCartSectionIsDisplayed() throws InterruptedException {
        Assert.assertTrue(smartphones.AddToCart().isDisplayed());
        Thread.sleep(wait);
    }

    @When("Click on Add To Cart section")
    public void clickOnAddToCartSection() throws InterruptedException {
        smartphones.AddToCart().click();
        Thread.sleep(wait);
    }

    @Then("Check that Cart button is displayed")
    public void checkThatCartButtonIsDisplayed() throws InterruptedException {
        Assert.assertTrue(smartphones.Cart().isDisplayed());
        Thread.sleep(wait);
    }

    @When("Click on Cart button")
    public void clickOnCartButton() throws InterruptedException {
        smartphones.Cart().click();
        Thread.sleep(wait);
    }

    @Then("Check that Proceed to Checkout button is displayed")
    public void checkThatProceedToCheckoutButtonIsDisplayed() throws InterruptedException {
        Assert.assertTrue(smartphones.ProceedToCheckout().isDisplayed());
        Thread.sleep(wait);
    }

    @When("Click on Proceed to Checkout button")
    public void clickOnProceedToCheckoutButton() throws InterruptedException {
        smartphones.ProceedToCheckout().click();
        Thread.sleep(wait);
    }

    @Then("Check that Continue button is displayed")
    public void checkThatContinueButtonIsDisplayed() throws InterruptedException {
        Assert.assertTrue(smartphones.Continue().isDisplayed());
        Thread.sleep(wait);
    }

    @When("Click on Continue button")
    public void clickOnContinueButton() throws InterruptedException {
        smartphones.Continue().click();
        Thread.sleep(wait);
    }

    ////////////////////////////////////Test Case-2///////////////////////////////////

    @Given("Check that Search option is displayed")
    public void checkThatSearchOptionIsDisplayed() throws InterruptedException {
        Thread.sleep(wait);
        Assert.assertTrue(smartphones.Searchsection().isDisplayed());
        Thread.sleep(wait);
    }

    @When("Input a product name in Search option")
    public void inputAProductNameInSearchOption() throws InterruptedException {
        smartphones.Searchsection().sendKeys("Watch");
        Thread.sleep(wait);
    }

    @Then("Click on Search button")
    public void clickOnSearchButton() throws InterruptedException {
        smartphones.Searchbutton().click();
        Thread.sleep(wait);
    }

    @When("Check that first search product section is displayed")
    public void checkThatFirstSearchProductSectionIsDisplayed() throws InterruptedException {
        Assert.assertTrue(smartphones.Firstproduct().isDisplayed());
        Thread.sleep(wait);
    }

    @Then("Click on first search product section")
    public void clickOnFirstSearchProductSection() throws InterruptedException {
        smartphones.Firstproduct().click();
        Thread.sleep(wait);
    }


    ////////////////////////////////////Test Case-3///////////////////////////////////

    @Given("Check that specific product is displayed")
    public void checkThatSpecificProductIsDisplayed() throws InterruptedException {
        Thread.sleep(wait);
        Assert.assertTrue(smartphones.Specificproduct().isDisplayed());
        Thread.sleep(wait);
    }

    @When("Click on a specific product")
    public void clickOnASpecificProduct() throws InterruptedException {
        smartphones.Specificproduct().click();
        Thread.sleep(wait);
    }

    @Then("Check that first specific product is displayed")
    public void checkThatFirstSpecificProductIsDisplayed() throws InterruptedException {
        Assert.assertTrue(smartphones.Firstproduct().isDisplayed());
        Thread.sleep(wait);
    }

    @When("Click on first specific product")
    public void clickOnFirstSpecificProduct() throws InterruptedException {
        smartphones.Firstproduct().click();
        Thread.sleep(wait);
    }

    @Then("Check that remove product is displayed")
    public void checkThatRemoveProductIsDisplayed() throws InterruptedException {
        Assert.assertTrue(smartphones.Removeproduct().isDisplayed());
        Thread.sleep(wait);
    }

    @Then("Click on a remove product")
    public void clickOnARemoveProduct() throws InterruptedException {
        smartphones.Removeproduct().click();
        Thread.sleep(wait);
    }

}
