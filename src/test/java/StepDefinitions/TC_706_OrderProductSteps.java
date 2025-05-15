package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TC_706_OrderProductSteps {
    Elements e = new Elements();

    @And("The user sees one of the registered default shipping addresses. If no address is available, the user creates a new one.")
    public void theUserSeesOneOfTheDefaultShippingAddressesRegisteredIfNoAddressIsAvailable() {
        if (!e.addressList.isEmpty()) {
            e.myClick(e.nextBTN);
        } else {
            e.myClick(e.newAddressBTN);
            e.mySendKeys(e.streetAddress, "Manhattan");
            e.mySendKeys(e.cityAddress, "Muş");
            Select state = new Select(e.stateAddress);
            state.selectByVisibleText("California");
            e.mySendKeys(e.postCodeAddress, "12330");
            Select country = new Select(e.countryAddress);
            country.selectByVisibleText("United States");
            e.mySendKeys(e.telAddress, "050233112");
            e.myClick(e.saveAddressBTN);
        }
    }

    @And("The user selects a shipping method by clicking a random radio button")
    public void theUserSelectsAShippingMethodByClickingARandomRadioButton() {
        int rnd = (int) (Math.random() * e.shipMethods.size());
        if (!e.shipMethods.get(rnd).isSelected()) {
            e.myClick(e.shipMethods.get(rnd));
        }
    }

    @Then("The user is redirected to the {string} page")
    public void theUserIsRedirectedToThePage(String page) {
        e.wait.until(ExpectedConditions.visibilityOf(e.getWebElement(page)));
        Assert.assertTrue(e.getWebElement(page).getText().contains("Payment Method"), "Wrong Page");
    }

    @And("The user verifies that the billing address is the same as the shipping address")
    public void theUserVerifiesThatTheBillingAddressIsTheSameAsTheShippingAddress() {
        if (e.sameAddressBTN.isSelected()) {
            Assert.assertTrue(e.sameAddressBTN.isSelected());
        } else {
            e.myClick(e.saveAddressBTN);
        }
    }

    @And("The user sees the success message on the Success Page and the user sees the order number")
    public void theUserSeesTheSuccessMessageOnThe() {
        Assert.assertEquals(e.purchaseMSG.getText(), "Thank you for your purchase!", "The success message is not visible");
        Assert.assertTrue(e.orderNumber.isEnabled(), "Order number is not visible");
    }

}
