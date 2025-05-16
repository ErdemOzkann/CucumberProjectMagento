package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class TC_707_SearchFunctionalitySteps extends GWD {

    Elements el = new Elements();

    @When("The user enters {string} into the search bar and presses Enter")
    public void theUserEntersStringIntoTheSearchBar(String arg0) {
        el.mySendKeys(el.search, "MJ08" + Keys.ENTER);
    }

    @Then("The product {string} should be displayed in the search results")
    public void theProductShouldBeDisplayedInTheSearchResults(String arg0) {
        el.wait.until(ExpectedConditions.visibilityOf(el.LandoGymJacket));
        Assert.assertTrue(el.LandoGymJacket.getText().contains("Lando Gym Jacket"));
    }

    @Given("The user is on the Magento homepage")
    public void theUserIsOnTheMagentoHomepage() {
        el.myClick(el.homePage);
    }

    @When("The user navigates through the menu by clicking {string} > {string} > {string}")
    public void theUserNavigatesThroughTheMenuByClicking(String arg0, String arg1, String arg2) {
        Actions actions = new Actions(getDriver());
        actions
                .moveToElement(el.hmMen)
                .moveToElement(el.hmTops)
                .click(el.hmJackets).build().perform();
    }

    @And("The user clicks on the {string} product")
    public void theUserClicksOnTheProduct(String arg0) {
        el.myClick(el.clickLandoGymJacket);
    }


    @Then("The product SKU should be displayed as {string}")
    public void theProductSKUShouldBeDisplayedAs(String arg0) {
        el.wait.until(ExpectedConditions.visibilityOf(el.productNumber));
        Assert.assertEquals(el.productNumber.getText(), "MJ08", "Mesajlar Eslesmiyor");
    }

    @And("The user verifies the product is correct and decides to place an order")
    public void theUserVerifiesTheProductIsCorrectAndDecidesToPlaceAnOrder() {
        el.myClick(el.size2);
        el.myClick(el.color2);
        el.myClick(el.addToCart2);
    }

    @When("The user enters {string} into the search bar")
    public void theUserEntersIntoTheSearchBar(String arg0) {
        el.mySendKeys(el.search, "INVALID123");
    }

    @And("Clicks the search icon")
    public void clicksTheSearchIcon() {
        el.myClick(el.searchBttn);
    }

    @Then("A message {string} should be displayed")
    public void aMessageShouldBeDisplayed(String arg0) {
        el.wait.until(ExpectedConditions.visibilityOf(el.errorMsg));
        Assert.assertEquals(el.errorMsg.getText(), "Your search returned no results.", "Not found");
    }
}
