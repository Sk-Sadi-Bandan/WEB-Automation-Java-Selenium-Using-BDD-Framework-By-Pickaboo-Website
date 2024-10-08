package Locator;


import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Smartphones {
    @Getter
    WebDriver driver;

    By MobileNumber = By.xpath("//input[@placeholder='Mobile Number/Email']");
    By Pass = By.xpath("//input[@placeholder='Password']");
    By Sign_In = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text custom-buttons']");

    By Smartphones = By.xpath("//div[@class='home-banner__menu']//a[@class='a-tag'][normalize-space()='Smartphones']");
    By Cameraphone = By.xpath("//h4[normalize-space()='Camera Phone']");
    By Firstproduct = By.xpath("//div[@class='row']//div[1]//div[1]//a[1]//div[1]//div[1]//div[2]");
    By Selectcolor = By.xpath("//div[@class='views']//div[1]//center[1]//img[1]");
    By AddToCart = By.xpath("//span[normalize-space()='ADD TO CART']");
    By Cart = By.xpath("//p[normalize-space()='cart']");
    By ProceedToCheckout = By.xpath("//span[normalize-space()='Proceed to checkout']");
    By Continue = By.xpath("//span[normalize-space()='CONTINUE']");

    By Searchsection = By.xpath("//div[@class='menu-search col']//input[@placeholder='Search for products, brands and more']");
    By Searchbutton = By.xpath("//button[@type='submit']");

    By Specificproduct = By.xpath("//a[@href='/product/top-smartwatch/']");
    By Removeproduct = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[3]");



    public Smartphones(WebDriver driver) {this.driver = driver;}


    public WebElement MobileNumber(){return driver.findElement(MobileNumber);}
    public WebElement Password_(){return driver.findElement(Pass);}
    public WebElement SingnIN_(){return driver.findElement(Sign_In);}

    public WebElement Smartphones(){return driver.findElement(Smartphones);}
    public WebElement Cameraphone(){return driver.findElement(Cameraphone);}
    public WebElement Firstproduct(){return driver.findElement(Firstproduct);}
    public WebElement Selectcolor(){return driver.findElement(Selectcolor);}
    public WebElement AddToCart(){return driver.findElement(AddToCart);}
    public WebElement Cart(){return driver.findElement(Cart);}
    public WebElement ProceedToCheckout(){return driver.findElement(ProceedToCheckout);}
    public WebElement Continue(){return driver.findElement(Continue);}

    public WebElement Searchsection(){return driver.findElement(Searchsection);}
    public WebElement Searchbutton(){return driver.findElement(Searchbutton);}

    public WebElement Specificproduct(){return driver.findElement(Specificproduct);}
    public WebElement Removeproduct(){return driver.findElement(Removeproduct);}


}
