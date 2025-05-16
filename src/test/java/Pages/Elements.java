package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "//*[@id='region_id']")
    public WebElement state;

    @FindBy(xpath = "//*[@role='delete-address'] [1]")
    public WebElement delete;

    @FindBy(xpath = "//*[@data-th='Actions']/a/span [1]")
    public WebElement edit;

    @FindBy(xpath = "//*[text()='You deleted the address.']")
    public WebElement deletemessage;

    @FindBy(xpath = "//*[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public  WebElement savemessage;

    @FindBy(xpath = "//*[@id='country']")
    public WebElement countryDropdown;

    @FindBy(xpath = "//*[@id='primary_billing']")
    public WebElement billingaddress;

    @FindBy(xpath = "//*[text()='Additional Address Entries']")
    public WebElement addresslistpage;


    @FindBy(xpath = "//*[@class='action-primary action-accept']")
    public WebElement ok;








    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "SignInEmail":
                return this.SignInEmail;
            case "SignInPassword":
                return this.SignInPassword;
        }
        return null;
    }
}

