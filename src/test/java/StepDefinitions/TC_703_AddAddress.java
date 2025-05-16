package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;

public class TC_703_AddAddress {
    Elements elements = new Elements();

    @When("The user clicks the {string} link")
    public void theUserClicksTheLink(String arg0) {

        elements.downbutton.click();
        elements.myaccount.click();

        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("window.scrollBy(0, 500);");

    }

    @And("Clicks the {string} link")
    public void clicksTheLink(String arg0) {
        elements.manageaddress.click();
    }

    @And("Clicks the {string} button")
    public void clicksTheButton(String arg0) {
        elements.addaddress.click();
    }

    @And("Fills in the required address fields with {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void fillsAddressFields(String firstName, String lastName, String street, String city, String zip, String country, String phone) {
        elements.firstName.sendKeys(firstName);
        elements.lastName.sendKeys(lastName);
        elements.street1.sendKeys(street);
        elements.city.sendKeys(city);
        elements.postalcode.sendKeys(zip);
        Select countrySelect = new Select(elements.countryDropdown);
        countrySelect.selectByVisibleText(country);
        elements.phone.sendKeys(phone);
    }

    @And("Marks the address as the default billing or shipping address {string}")
    public void marksTheAddressAsTheDefaultBillingOrShippingAddress(String defaultType) {
        if (defaultType.equalsIgnoreCase("billing")) {
            elements.billingaddress.click();
        } else if (defaultType.equalsIgnoreCase("shipping")) {
            elements.shippingaddress.click();
        }
    }

    @And("The user click te save button and redirected to the address list page")
    public void theUserClickTeSaveButtonAndRedirectedToTheAddressListPage() {
        elements.savebutton.click();
        Assert.assertTrue(elements.addresslistpage.isDisplayed());
    }

    @And("The user can edit and delete the added addresses")
    public void theUserCanEditOrDeleteTheAddedAddresses() {


        elements.edit.click();
        elements.firstName.clear();
        elements.firstName.sendKeys("FrankJohnnn");
        elements.savebutton.click();
        elements.wait.until(ExpectedConditions.textToBePresentInElement(elements.savemessage, "You saved the address."));
        Assert.assertEquals(elements.savemessage.getText(), "You saved the address.");

        elements.delete.click();
        elements.wait.until(ExpectedConditions.elementToBeClickable(elements.ok));
        elements.ok.click();
        elements.wait.until(ExpectedConditions.textToBePresentInElement(elements.deletemessage, "You deleted the address."));
        Assert.assertEquals(elements.deletemessage.getText(), "You deleted the address.");

    }


}
