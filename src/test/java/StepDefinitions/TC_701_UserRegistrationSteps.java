package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class TC_701_UserRegistrationSteps extends GWD {

    Elements el = new Elements();

    @Given("Navigate to Magento")
    public void navigate_to_magento() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");

        if (!el.acceptBtn.isEmpty())
            el.myClick(el.acceptBtn.get(0));
    }

    @When("The user accesses the registration form")
    public void theUserAccessesTheRegistrationForm() {
        el.myClick(el.createAnAccount);
    }

    @And("The user enters personal information")
    public void theUserEntersPersonalInformation(DataTable dataTable) {

        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> row : data) {
            el.firstName.sendKeys(row.get("firstname"));
            el.lastName.sendKeys(row.get("lastname"));
            el.emailAddress.sendKeys(row.get("email"));
            el.password.sendKeys(row.get("password"));
            el.passwordConfirmation.sendKeys(row.get("confirmPassword"));
        }
    }

    @And("The user clicks the {string} button")
    public void theUserClicksTheButton(String caButton) {
        el.myClick(el.getWebElement(caButton));
    }

    @Then("The user should see a success message and be logged into the site")
    public void theUserShouldSeeSuccessMessageAndBeLoggedIn() {
        el.wait.until(ExpectedConditions.visibilityOf(el.registrationMsg));
        Assert.assertTrue(el.registrationMsg.getText().contains("Thank you for registering with Main Website Store."));
    }

    @When("The user goes {string} to the previous page")
    public void user_goes_back_to_previous_page(String bButton) {
        getDriver().navigate().back();
    }

}
