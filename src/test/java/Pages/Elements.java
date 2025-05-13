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
