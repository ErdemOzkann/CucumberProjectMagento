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

    @FindBy(xpath = "//ol[@class='product-items widget-product-grid']//li")
    public List<WebElement> Productitems;

    @FindBy(xpath = "//div[@class='product-addto-links']/a[1]")
    public WebElement AddToWishlist;

    @FindBy(xpath = "//form[@id='wishlist-view-form']//li")
    public List<WebElement> WishListItems;

    @FindBy(xpath = "//a[@title='Go to Wish List']")
    public WebElement WishListButton;

    @FindBy(xpath = "//div[@role='alert']//div/div")
    public WebElement AddedMessage;

    @FindBy(xpath = "//div[@class='panel header']/ul/li[2]")
    public WebElement DropDownButton;

    @FindBy(xpath = "//div[@class='panel header']//div//li[1]")
    public WebElement MyAccountButton;

    @FindBy(xpath = "//div[@id='block-collapsible-nav']//li[4]")
    public WebElement MyWishListButton2;

    @FindBy(xpath = "//div[@class='product-item-inner']//a[2]")
    public List<WebElement> RemoveItemButton;

    @FindBy(xpath = "//main[@id='maincontent']/div[1]/div[2]/div/div")
    public WebElement HasBeenRemovedText;

    @FindBy(xpath = "//div[@class='product-item-inner']//a[1]")
    public List<WebElement> UpdateItemButton;

    @FindBy(xpath = "//div[@class='swatch-attribute size']//div/div")
    public List<WebElement> Sizes;

    @FindBy(xpath = "//div[@class='swatch-attribute color']//div/div")
    public List<WebElement> Colors;

    @FindBy(xpath = "//div[@class='field qty']//div/input")
    public WebElement Qty;

    @FindBy(xpath = "//div[@class='product-addto-links']/a[1]")
    public WebElement UpdateWishListButton;

    @FindBy(xpath = "//div[@class='message-success success message']/div")
    public WebElement HasBeenUpdatedWishListText;

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
