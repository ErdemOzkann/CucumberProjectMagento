package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class MyStepdefs {
    Elements elements=new Elements();

    @When("The user clicks the {string} link")
    public void theUserClicksTheLink(String arg0) {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");

        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(elements.myaccount));

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

    @And("Fills in the required address fields")
    public void fillsInTheRequiredAddressFields() {
        elements.street1.sendKeys("Holly Street");
        elements.city.sendKeys("New York");
        elements.postalcode.sendKeys("12345");
        elements.shippingaddress.click();
        elements.phone.sendKeys("075000000");
    }

    @And("Marks the address as the default billing or shipping address")
    public void marksTheAddressAsTheDefaultBillingOrShippingAddress() {
        elements.shippingaddress.click();
    }

    @And("Saves the changes")
    public void savesTheChanges() {
        elements.savebutton.click();
    }

    @Then("The user is redirected to the address list page")
    public void theUserIsRedirectedToTheAddressListPage() {
    }

    @And("The user can edit or delete the added addresses")
    public void theUserCanEditOrDeleteTheAddedAddresses() {
    }
}
