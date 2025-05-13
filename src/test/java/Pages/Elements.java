package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends ParentPage {
    public Elements() {PageFactory.initElements(GWD.getDriver(),this);}

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

}
