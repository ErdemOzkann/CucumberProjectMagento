package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements extends ParentPage {
    public Elements() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='panel header']//li[2]//a")
    public WebElement SignInHomePage;

    @FindBy(xpath = "//input[@name='login[username]']")
    public WebElement SignInEmail;

    @FindBy(xpath = "//input[@name='login[password]']")
    public WebElement SignInPassword;

    @FindBy(xpath = "//button[@class='action login primary']")
    public WebElement SignIn;

    @FindBy(xpath = "//header[@class='page-header']//li[1]/span")
    public WebElement Welcome;

    @FindBy(xpath = "//div[@role='alert']//div/div")
    public WebElement incorrect;

    @FindBy(xpath = "//a[@class='action remind']/span")
    public WebElement ForgotYourPasswordButton;

    @FindBy(xpath = "//h1[@class='page-title']/span")
    public WebElement FYPassText;

    @FindBy(xpath = "//input[@id='email_address']")
    public WebElement ForgotYourPasswordEmail;

    @FindBy(xpath = "//button[@class='action submit primary']")
    public WebElement ResetMyPassword;

    @FindBy(xpath = "//div[@role='alert']//div/div")
    public WebElement YourPassResetText;

    @FindBy(id = "accept-btn")
    public WebElement acceptBtn;

    @FindBy(xpath = "//*[text()='Create an Account']")
    public WebElement createAnAccount;

    @FindBy(id = "firstname")
    public WebElement firstName;

    @FindBy(id = "lastname")
    public WebElement lastName;

    @FindBy(id = "email_address")
    public WebElement emailAddress;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "password-confirmation")
    public WebElement passwordConfirmation;

    @FindBy(css = "[type='submit'][class='action submit primary']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//*[text()='Thank you for registering with Main Website Store.']")
    public WebElement registrationMsg;

    @FindBy(xpath = "//*[@class='action switch'] [1]")
    public WebElement downbutton;

    @FindBy(xpath = "//*[text()='My Account'] [1]")
    public WebElement myaccount;

    @FindBy(xpath = "//*[text()='Manage Addresses']")
    public WebElement manageaddress;

    @FindBy(xpath = "//*[@class='action primary add']")
    public WebElement addaddress;

    @FindBy(xpath = "//*[@id='street_1']")
    public WebElement street1;

    @FindBy(xpath = "//*[@id='city']")
    public WebElement city;

    @FindBy(xpath = "//*[@id='telephone']")
    public WebElement phone;

    @FindBy(xpath = "//*[@id='primary_shipping']")
    public WebElement shippingaddress;

    @FindBy(xpath = "//*[@class='action save primary']")
    public WebElement savebutton;

    @FindBy(xpath = "//*[@id='zip']")
    public WebElement postalcode;

    @FindBy(xpath = "//ol[@class='product-items widget-product-grid']//li")
    public List<WebElement> productList;

    @FindBy(id = "product-addtocart-button")
    public WebElement addToCart;

    @FindBy(css = "[class='message-success success message']")
    public WebElement addedText;

    @FindBy(xpath = "//div[@class='swatch-option text']")
    public List <WebElement> size;

    @FindBy(xpath = "//div[@class='swatch-option color']")
    public List <WebElement> color;

    @FindBy(id = "qty")
    public WebElement qty;

    @FindBy(css = "[class='action showcart']")
    public WebElement cartButton;

    @FindBy(css = "[class='action delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@class='action-primary action-accept']//span")
    public WebElement okButton;

    @FindBy(xpath = "//a[@class='action edit']")
    public WebElement editButton;

    @FindBy(xpath = "//button[@title='Update Cart']")
    public WebElement updateButton;

    @FindBy(xpath = "//div[@class='message-success success message']")
    public WebElement uptadedSuccessfully;

    @FindBy(xpath = "//tr[@class='grand totals']")
    public WebElement totalText;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "SignInEmail":
                return this.SignInEmail;
            case "SignInPassword":
                return this.SignInPassword;
            case "addToCart":
                return this.addToCart;
            case "cartButton":
                return this.cartButton;
            case "deleteButton":
                return this.deleteButton;
            case "okButton":
                return this.okButton;
        }
        return null;
    }
}

