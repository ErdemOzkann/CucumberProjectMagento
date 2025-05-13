package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends ParentPage {
    public Elements() {PageFactory.initElements(GWD.getDriver(),this);}

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



}

