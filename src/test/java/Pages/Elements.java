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
