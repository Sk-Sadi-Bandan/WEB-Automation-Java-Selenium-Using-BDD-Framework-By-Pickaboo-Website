package Locator;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Computers {

    @Getter
    WebDriver driver;

    By MobileNumber = By.xpath("//input[@placeholder='Mobile Number/Email']");
    By Pass = By.xpath("//input[@placeholder='Password']");
    By Sign_In = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text custom-buttons']");

    By Computers = By.xpath("//div[@class='home-banner__menu']//a[@class='a-tag'][normalize-space()='Computers']");
    By Firstproduct = By.xpath("//div[@class='row']//div[1]//div[1]//a[1]//div[1]//div[1]//div[2]");

    By AddReview = By.xpath("//div[@class='add-rating']//div[2]");
    By ReviewTitle = By.xpath("//textarea[@placeholder='Please enter your review title.']");
    By FeedbackProduct = By.xpath("//textarea[@placeholder='Please share your feedback about the product.']");
    By SubmitReview = By.xpath("//span[normalize-space()='Submit Review']");



    public Computers(WebDriver driver) {this.driver = driver;}


    public WebElement MobileNumber(){return driver.findElement(MobileNumber);}
    public WebElement Password_(){return driver.findElement(Pass);}
    public WebElement SingnIN_(){return driver.findElement(Sign_In);}

    public WebElement Computers(){return driver.findElement(Computers);}
    public WebElement Firstproduct(){return driver.findElement(Firstproduct);}

    public WebElement AddReview(){return driver.findElement(AddReview);}
    public WebElement ReviewTitle(){return driver.findElement(ReviewTitle);}
    public WebElement FeedbackProduct(){return driver.findElement(FeedbackProduct);}
    public WebElement SubmitReview(){return driver.findElement(SubmitReview);}


}
