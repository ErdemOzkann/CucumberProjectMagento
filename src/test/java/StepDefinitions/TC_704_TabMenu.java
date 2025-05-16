package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class TC_704_TabMenu extends GWD {

    Actions actions = new Actions(GWD.getDriver());
    Elements el = new Elements();

    @And("clicks on the What's New ikon")
    public void clicksOnTheWhatSNewIkon() {
        el.wait.until(ExpectedConditions.elementToBeClickable(el.whatsnewikon));
        el.myClick(el.whatsnewikon);


    }

    @Then("the What's New category page should be displayed")
    public void theWhatSNewCategoryPageShouldBeDisplayed() {
        el.wait.until(ExpectedConditions.visibilityOf(el.whatsnewassert));
        Assert.assertTrue(el.whatsnewassert.getText().contains("What's New"));

    }

    @When("the user hovers over Women > Tops > Jackets And clicks on Jackets")
    public void theUserHoversOverWomenTopsJacketsAndClicksOnJackets() {
        el.wait.until(ExpectedConditions.elementToBeClickable(el.womenikon));
        actions.moveToElement(el.womenikon)
                .moveToElement(el.tops)
                .moveToElement(el.jackets)
                .click()
                .build()
                .perform();

    }

    @Then("the Jackets category page should be displayed")
    public void theJacketsCategoryPageShouldBeDisplayed() {
        Assert.assertTrue(el.jacketsassert.getText().contains("Jackets"));

    }

    @When("the user hovers over Women > Tops > Hoodies & Sweatshirts And clicks on Hoodies & Sweatshirts")
    public void theUserHoversOverWomenTopsHoodiesSweatshirtsAndClicksOnHoodiesSweatshirts() {
        actions.moveToElement(el.womenikon)
                .moveToElement(el.tops)
                .moveToElement(el.hoodies_sweatshirts)
                .click()
                .build()
                .perform();

    }

    @Then("the Hoodies & Sweatshirts category page should be displayed")
    public void theHoodiesSweatshirtsCategoryPageShouldBeDisplayed() {
        Assert.assertTrue(el.hoodies_sweatshirtsassert.getText().contains("Hoodies"));

    }

    @When("the user hovers over Women > Tops > Tees And clicks on Tees")
    public void theUserHoversOverWomenTopsTeesAndClicksOnTees() {
        actions.moveToElement(el.womenikon)
                .moveToElement(el.tops)
                .moveToElement(el.tees)
                .click()
                .build()
                .perform();

    }

    @Then("the Tees category page should be displayed")
    public void theTeesCategoryPageShouldBeDisplayed() {
        Assert.assertTrue(el.teesassert.getText().contains("Tees"));

    }

    @When("the user hovers over Women > Tops > Bras & Tanks And clicks on Bras & Tanks")
    public void theUserHoversOverWomenTopsBrasTanksAndClicksOnBrasTanks() {
        actions.moveToElement(el.womenikon)
                .moveToElement(el.tops)
                .moveToElement(el.bras_tanks)
                .click()
                .build()
                .perform();

    }


    @When("the user hovers over Women > Bottoms > Pants And clicks on Pants")
    public void theUserHoversOverWomenBottomsPantsAndClicksOnPants() {
        actions.moveToElement(el.womenikon)
                .moveToElement(el.bottoms)
                .moveToElement(el.pants)
                .click()
                .build()
                .perform();

    }

    @Then("the Pants category page should be displayed")
    public void thePantsCategoryPageShouldBeDisplayed() {
        Assert.assertTrue(el.pantsassert.getText().contains("Pants"));

    }

    @When("the user hovers over Women > Bottoms > Shorts And clicks on Shorts")
    public void theUserHoversOverWomenBottomsShortsAndClicksOnShorts() {
        actions.moveToElement(el.womenikon)
                .moveToElement(el.bottoms)
                .moveToElement(el.shorts)
                .click()
                .build()
                .perform();

    }

    @Then("the Shorts category page should be displayed")
    public void theShortsCategoryPageShouldBeDisplayed() {
        Assert.assertTrue(el.shortsassert.getText().contains("Shorts"));

    }

    @When("the user hovers over Men > Tops > Jackets And clicks on Jackets")
    public void theUserHoversOverMenTopsJacketsAndClicksOnJackets() {
        actions.moveToElement(el.menikon)
                .moveToElement(el.topsmen)
                .moveToElement(el.jacketsmen)
                .click()
                .build()
                .perform();


    }

    @When("the user hovers over Men > Tops > Hoodies & Sweatshirts And clicks on Hoodies & Sweatshirts")
    public void theUserHoversOverMenTopsHoodiesSweatshirtsAndClicksOnHoodiesSweatshirts() {
        actions.moveToElement(el.menikon)
                .moveToElement(el.topsmen)
                .moveToElement(el.hoodies_sweatshirtsmen)
                .click()
                .build()
                .perform();

    }

    @When("the user hovers over Men > Tops > Tees And clicks on Tees")
    public void theUserHoversOverMenTopsTeesAndClicksOnTees() {
        actions.moveToElement(el.menikon)
                .moveToElement(el.topsmen)
                .moveToElement(el.teesmen)
                .click()
                .build()
                .perform();

    }

    @When("the user hovers over Men > Tops > Tanks And clicks on Tanks")
    public void theUserHoversOverMenTopsTanksAndClicksOnTanks() {
        actions.moveToElement(el.menikon)
                .moveToElement(el.topsmen)
                .moveToElement(el.tanksmen)
                .click()
                .build()
                .perform();

    }

    @When("the user hovers over Men > Bottoms > Pants And clicks on Pants")
    public void theUserHoversOverMenBottomsPantsAndClicksOnPants() {
        actions.moveToElement(el.menikon)
                .moveToElement(el.bottomsmen)
                .moveToElement(el.pantsmen)
                .click()
                .build()
                .perform();

    }

    @When("the user hovers over Men > Bottoms > Shorts And clicks on Shorts")
    public void theUserHoversOverMenBottomsShortsAndClicksOnShorts() {
        el.wait.until(ExpectedConditions.visibilityOf(el.menikon));
        actions.moveToElement(el.menikon)
                .moveToElement(el.bottomsmen)
                .moveToElement(el.shortsmen)
                .click()
                .build()
                .perform();

    }

    @When("the user hovers over Gear > Bags And clicks on Bags")
    public void theUserHoversOverGearBagsAndClicksOnBags() {
        actions.moveToElement(el.gear)
                .moveToElement(el.bags)
                .click()
                .build()
                .perform();

    }

    @Then("the Bags category page should be displayed")
    public void theBagsCategoryPageShouldBeDisplayed() {
        Assert.assertTrue(el.bagsassert.getText().contains("Bags"));

    }

    @When("the user hovers over Gear > Fitness Equipment And clicks on Fitness Equipment")
    public void theUserHoversOverGearFitnessEquipmentAndClicksOnFitnessEquipment() {
        actions.moveToElement(el.gear)
                .moveToElement(el.fitnessequipment)
                .click()
                .build()
                .perform();

    }

    @Then("the Fitness Equipment category page should be displayed")
    public void theFitnessEquipmentCategoryPageShouldBeDisplayed() {
        Assert.assertTrue(el.fitnessequipmentassert.getText().contains("Fitness"));

    }

    @When("the user hovers over Gear > Watches And clicks on Watches")
    public void theUserHoversOverGearWatchesAndClicksOnWatches() {
        actions.moveToElement(el.gear)
                .moveToElement(el.watches)
                .click()
                .build()
                .perform();
    }

    @Then("the Watches category page should be displayed")
    public void theWatchesCategoryPageShouldBeDisplayed() {
        Assert.assertTrue(el.watchesassert.getText().contains("Watches"));

    }

    @When("the user hovers over Training > Video Download And clicks on Video Download")
    public void theUserHoversOverTrainingVideoDownloadAndClicksOnVideoDownload() {
        actions.moveToElement(el.training)
                .moveToElement(el.videodownload)
                .click()
                .build()
                .perform();

    }

    @Then("the Video Download category page should be displayed")
    public void theVideoDownloadCategoryPageShouldBeDisplayed() {
        Assert.assertTrue(el.videodownloadassert.getText().contains("Video"));

    }

    @And("clicks on the Sale ikon")
    public void clicksOnTheSaleIkon() {
        el.myClick(el.sale);
    }

    @Then("the Sale category page should be displayed")
    public void theSaleCategoryPageShouldBeDisplayed() {
        Assert.assertTrue(el.saleassert.getText().contains("Sale"));

    }
}
