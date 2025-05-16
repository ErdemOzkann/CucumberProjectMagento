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

    @FindBy(id = "accept-btn")
    public List<WebElement> acceptBtn;

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

    @FindBy(id = "search")
    public WebElement search;

    @FindBy(css = "[class='product-item-link']")
    public WebElement LandoGymJacket;

    @FindBy(css = "[class='logo'] img")
    public WebElement homePage;

    @FindBy(xpath = "//*[text()='Men']")
    public WebElement hmMen;

    @FindBy(id = "ui-id-17")
    public WebElement hmTops;

    @FindBy(id = "ui-id-19")
    public WebElement hmJackets;

    @FindBy(css = "[class='products list items product-items']>:nth-child(7)")
    public WebElement clickLandoGymJacket;

    @FindBy(xpath = "//*[text()='MJ08']")
    public WebElement productNumber;

    @FindBy(id = "option-label-size-143-item-169")
    public WebElement size2;

    @FindBy(id = "option-label-color-93-item-52")
    public WebElement color2;

    @FindBy(id = "product-addtocart-button")
    public WebElement addToCart2;

    @FindBy(css = "[type='submit'][title='Search']")
    public WebElement searchBttn;

    @FindBy(css = "[class='message notice'] div")
    public WebElement errorMsg;

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

    @FindBy(xpath = "//*[@role='delete-address'] [1]")
    public WebElement delete;

    @FindBy(xpath = "//*[@data-th='Actions']/a/span [1]")
    public WebElement edit;

    @FindBy(xpath = "//*[text()='You deleted the address.']")
    public WebElement deletemessage;

    @FindBy(xpath = "//*[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement savemessage;

    @FindBy(xpath = "//*[@id='country']")
    public WebElement countryDropdown;

    @FindBy(xpath = "//*[@id='primary_billing']")
    public WebElement billingaddress;

    @FindBy(xpath = "//*[text()='Additional Address Entries']")
    public WebElement addresslistpage;

    @FindBy(xpath = "//*[@class='action-primary action-accept']")
    public WebElement ok;

    @FindBy(xpath = "//ol[@class='product-items widget-product-grid']//li")
    public List<WebElement> productList;

    @FindBy(id = "product-addtocart-button")
    public WebElement addToCart;

    @FindBy(css = "[class='message-success success message']")
    public WebElement addedText;

    @FindBy(xpath = "//div[@class='swatch-option text']")
    public List<WebElement> size;

    @FindBy(xpath = "//div[@class='swatch-option color']")
    public List<WebElement> color;

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

    @FindBy(id = "top-cart-btn-checkout")
    public WebElement checkOut;

    @FindBy(css = "[class='shipping-address-items'] div")
    public List<WebElement> addressList;

    @FindBy(css = "[class='action action-show-popup']")
    public WebElement newAddressBTN;

    @FindBy(css = "[name='street[0]']")
    public WebElement streetAddress;

    @FindBy(css = "[name='city']")
    public WebElement cityAddress;

    @FindBy(css = "[name='region_id']")
    public WebElement stateAddress;

    @FindBy(css = "[name='postcode']")
    public WebElement postCodeAddress;

    @FindBy(css = "[name='country_id']")
    public WebElement countryAddress;

    @FindBy(css = "[name='telephone']")
    public WebElement telAddress;

    @FindBy(css = "[class='button action continue primary']")
    public WebElement nextBTN;

    @FindBy(css = "[class='col col-method'] input")
    public List<WebElement> shipMethods;

    @FindBy(id = "billing-address-same-as-shipping-checkmo")
    public WebElement sameAddressBTN;

    @FindBy(css = "[class='action primary action-save-address']")
    public WebElement saveAddressBTN;

    @FindBy(css = "[data-bind='i18n: getGroupTitle($group)']")
    public WebElement paymentTitle;

    @FindBy(css = "[class='action primary checkout']")
    public WebElement placeOrder;

    @FindBy(css = "[data-ui-id='page-title-wrapper']")
    public WebElement purchaseMSG;

    @FindBy(css = "[class='order-number']")
    public WebElement orderNumber;

    @FindBy(xpath = "(//*[@class='level-top ui-corner-all'])[1]/span")
    public WebElement whatsnewikon;

    @FindBy(xpath = "//*[@id='page-title-heading']/span")
    public WebElement whatsnewassert;

    @FindBy(xpath = "//span[text()='Women']")
    public WebElement womenikon;

    @FindBy(xpath = "(//span[text()='Tops'])[1]")
    public WebElement tops;

    @FindBy(xpath = "(//span[text()='Jackets'])[1]")
    public WebElement jackets;

    @FindBy(xpath = "(//span[text()='Jackets'])[3]")
    public WebElement jacketsassert;

    @FindBy(xpath = "(//span[text()='Hoodies & Sweatshirts'])[1]")
    public WebElement hoodies_sweatshirts;

    @FindBy(xpath = "(//span[text()='Hoodies & Sweatshirts'])[3]")
    public WebElement hoodies_sweatshirtsassert;

    @FindBy(xpath = "(//span[text()='Tees'])[1]")
    public WebElement tees;

    @FindBy(xpath = "(//span[text()='Tees'])[3]")
    public WebElement teesassert;

    @FindBy(xpath = "(//span[text()='Bras & Tanks'])[1]")
    public WebElement bras_tanks;

    @FindBy(xpath = "(//span[text()='Bottoms'])[1]")
    public WebElement bottoms;

    @FindBy(xpath = "(//span[text()='Pants'])[1]")
    public WebElement pants;

    @FindBy(xpath = "(//span[text()='Pants'])[3]")
    public WebElement pantsassert;

    @FindBy(xpath = "(//span[text()='Shorts'])[1]")
    public WebElement shorts;

    @FindBy(xpath = "(//span[text()='Shorts'])[3]")
    public WebElement shortsassert;

    @FindBy(xpath = "//span[text()='Men']")
    public WebElement menikon;

    @FindBy(xpath = "(//span[text()='Tops'])[2]")
    public WebElement topsmen;

    @FindBy(xpath = "(//span[text()='Jackets'])[2]")
    public WebElement jacketsmen;

    @FindBy(xpath = "(//span[text()='Hoodies & Sweatshirts'])[2]")
    public WebElement hoodies_sweatshirtsmen;

    @FindBy(xpath = "(//span[text()='Tees'])[2]")
    public WebElement teesmen;

    @FindBy(xpath = "//span[text()='Tanks']")
    public WebElement tanksmen;

    @FindBy(xpath = "(//span[text()='Bottoms'])[2]")
    public WebElement bottomsmen;

    @FindBy(xpath = "(//span[text()='Pants'])[2]")
    public WebElement pantsmen;

    @FindBy(xpath = "(//span[text()='Shorts'])[2]")
    public WebElement shortsmen;

    @FindBy(id = "ui-id-6")
    public WebElement gear;

    @FindBy(xpath = "//span[text()='Bags']")
    public WebElement bags;

    @FindBy(xpath = "(//span[text()='Bags'])[2]")
    public WebElement bagsassert;

    @FindBy(xpath = "//span[text()='Fitness Equipment']")
    public WebElement fitnessequipment;

    @FindBy(xpath = "(//span[text()='Fitness Equipment'])[2]")
    public WebElement fitnessequipmentassert;

    @FindBy(xpath = "//span[text()='Watches']")
    public WebElement watches;

    @FindBy(xpath = "(//span[text()='Watches'])[2]")
    public WebElement watchesassert;

    @FindBy(xpath = "//span[text()='Training']")
    public WebElement training;

    @FindBy(xpath = "//span[text()='Video Download']")
    public WebElement videodownload;

    @FindBy(xpath = "(//span[text()='Video Download'])[2]")
    public WebElement videodownloadassert;

    @FindBy(xpath = "//span[text()='Sale']")
    public WebElement sale;

    @FindBy(xpath = "(//span[text()='Sale'])[2]")
    public WebElement saleassert;


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
            case "Create an Account":
                return this.createAccountButton;
            case "Proceed to checkout":
                return this.checkOut;
            case "New Address":
                return this.newAddressBTN;
            case "Next":
                return this.nextBTN;
            case "Payment Method":
                return this.paymentTitle;
            case "Place Order":
                return this.placeOrder;
        }
        return null;
    }
}

