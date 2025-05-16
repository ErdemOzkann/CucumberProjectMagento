package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class TC_708_WishList extends GWD {

    Elements element = new Elements();

    Actions actions = new Actions(GWD.getDriver());

    String SelProName;

    @Given("Go to the page of a product you like")
    public void goToThePageOfAProductYouLike() {

        List<WebElement> loc1 = element.Productitems;

        int rnd = (int) (Math.random() * loc1.size());

        SelProName = loc1.get(rnd).findElement(By.className("product-item-link")).getText();

        element.Productitems.get(rnd).click();
    }

    @Then("Click the Add To Wishlist button")
    public void clickTheAddToWishlistButton() {

        element.myClick(element.AddToWishlist);
    }

    @And("The product added message should be displayed")
    public void theProductAddedMessageShouldBeDisplayed() {

        element.wait.until(ExpectedConditions.textToBePresentInElement(element.AddedMessage, "has been added"));

        Assert.assertTrue(element.AddedMessage.getText().contains("has been added"));

        element.wait.until(ExpectedConditions.elementToBeClickable(element.WishListButton));

        element.myClick(element.WishListButton);

        List<WebElement> loc2 = element.WishListItems;

        boolean found = false;
        for (WebElement item : loc2) {
            if (item.getText().contains(SelProName)) {
                found = true;
                break;
            }
        }

        Assert.assertTrue(found, "Product not found in WishList: " + SelProName);
    }

    @Given("Click the {string} and the {string} buttons")
    public void clickTheAndTheButtons(String button1, String button2) {

        List<WebElement> loc1 = element.Productitems;

        int rnd = (int) (Math.random() * loc1.size());

        SelProName = loc1.get(rnd).findElement(By.className("product-item-link")).getText();

        element.myClick(element.DropDownButton);

        element.myClick(element.MyAccountButton);

        element.wait.until(ExpectedConditions.elementToBeClickable(element.MyWishListButton2));

        element.myClick(element.MyWishListButton2);

    }

    int selectedIndex = -1;

    @Then("Hover over the product")
    public void hoverOverTheProduct() {

        List<WebElement> loc3 = element.WishListItems;

        selectedIndex = (int) (Math.random() * loc3.size());

        WebElement randomItem = loc3.get(selectedIndex);

        actions.moveToElement(randomItem).build().perform();

        element.wait.until(ExpectedConditions.elementToBeClickable(element.RemoveItemButton.get(selectedIndex)));

    }

    @And("Remove the item")
    public void removeTheItem() {

        List<WebElement> loc4 = element.RemoveItemButton;

        actions.moveToElement(loc4.get(selectedIndex)).build().perform();

        element.RemoveItemButton.get(selectedIndex).click();

        element.wait.until(ExpectedConditions.textToBePresentInElement(element.HasBeenRemovedText, "has been removed"));

        Assert.assertTrue(element.HasBeenRemovedText.getText().contains("has been removed"));

    }

    @And("Verify the product is removed")
    public void verifyTheProductIsRemoved() {

        System.out.println("selProName = " + SelProName);

        Assert.assertNotNull(SelProName, "selProName is null. Did you forget to assign it?");

        element.wait.until(ExpectedConditions.textToBePresentInElement(element.HasBeenRemovedText, "has been removed"));

        List<WebElement> loc4 = element.WishListItems;

        boolean PFARemoval = false;
        for (WebElement item : loc4) {
            if (item.getText().contains(SelProName)) {
                PFARemoval = true;
                break;
            }
        }

        Assert.assertFalse(PFARemoval, "Product still present in WishList after removal: " + SelProName);
    }

    @And("Click the update item button")
    public void clickTheUpdateItemButton() {

        List<WebElement> loc3 = element.WishListItems;

        selectedIndex = (int) (Math.random() * loc3.size());

        WebElement randomItem = loc3.get(selectedIndex);

        actions.moveToElement(randomItem).build().perform();

        element.wait.until(ExpectedConditions.elementToBeClickable(element.RemoveItemButton.get(selectedIndex)));

        element.UpdateItemButton.get(selectedIndex).click();

    }

    @And("Update your favorites list")
    public void updateYourFavoritesList() {

        List<WebElement> loc6 = element.Sizes;

        int rnd1 = (int) (Math.random() * loc6.size());

        if (!loc6.isEmpty())
            element.Sizes.get(rnd1).click();

        List<WebElement> loc7 = element.Colors;

        int rnd2 = (int) (Math.random() * loc7.size());

        if (!loc7.isEmpty())
            element.Colors.get(rnd2).click();

        int rnd3 = (int) (Math.random() * 15);

        element.Qty.clear();

        element.Qty.sendKeys(String.valueOf(rnd3));

        element.myClick(element.UpdateWishListButton);

        if (element.Qty.getText().contains(String.valueOf(rnd3))) {

            element.wait.until(ExpectedConditions.textToBePresentInElement(element.HasBeenUpdatedWishListText, "has been updated"));

            Assert.assertTrue(element.HasBeenUpdatedWishListText.getText().contains("has been updated"));
        }

    }

}
