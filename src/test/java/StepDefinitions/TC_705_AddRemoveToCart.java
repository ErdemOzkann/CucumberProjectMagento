package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class TC_705_AddRemoveToCart extends GWD {

    Elements el = new Elements();

    @And("User click random product from homepage")
    public void userClickRandomProductFromHomepage() {
        // int randomIndex = (int) (Math.random() * el.productList.size());
        // el.wait.until(ExpectedConditions.visibilityOf(el.productList.get(randomIndex)));
        // WebElement selectedProduct = el.productList.get(randomIndex);
        // selectedProduct.click();
        // ================ACIKLAMA===============
        // Yukarida ki random bildigimiz random ama asagidaki tek satrida newRandom class ile cozuldu.
        el.productList.get(new Random().nextInt(el.productList.size())).click();

    }

    @When("User click the button")
    public void userClickTheButton(DataTable dataTable) {
        List<String> buttons = dataTable.asList();

        for (int i = 0; i < buttons.size(); i++) {
            el.myClick(el.getWebElement(buttons.get(i)));
        }
    }

    @And("If there is a color qty and a size there, select them.")
    public void ifThereIsAColorQtyAndASizeThereSelectThem() {
        if (!el.size.isEmpty()) { // eger size secenekleri varsa random tikla
            el.size.get(new Random().nextInt(el.size.size())).click();
        }
        if (!el.color.isEmpty()) { // eger color secenekleri varsa random tikla
            el.color.get(new Random().nextInt(el.color.size())).click();
        }
        el.qty.clear();
        Random random = new Random();
        int randomNumber = random.nextInt(11) + 1; // 10 kadar random sayi verir.0 haric !
        el.qty.sendKeys(String.valueOf(randomNumber));
    }

    @And("User should be add to cart successfully")
    public void userShouldBeAddToCartSuccessfully() {
        el.wait.until(ExpectedConditions.visibilityOf(el.addedText));
        Assert.assertTrue(el.addedText.getText().contains("added"));
    }

    @And("Update to cart")
    public void updateToCart() {
        el.cartButton.click();
        el.editButton.click();
        if (!el.size.isEmpty()) {
            el.size.get(new Random().nextInt(el.size.size())).click();
        }
        if (!el.color.isEmpty()) {
            el.color.get(new Random().nextInt(el.color.size())).click();
        }
        el.qty.clear();
        Random random = new Random();
        int randomNumber = random.nextInt(11) + 1;
        el.qty.sendKeys(String.valueOf(randomNumber));
        el.updateButton.click();
    }

    @And("User should update cart successfully")
    public void userShouldUpdateCartSuccessfully() {
        el.wait.until(ExpectedConditions.visibilityOf(el.uptadedSuccessfully));
        Assert.assertTrue(el.uptadedSuccessfully.getText().contains("updated "));
    }

    @And("User should remove form cart item")
    public void userShouldRemoveFormCartItem() {
        el.wait.until(ExpectedConditions.visibilityOf(el.totalText)).getText();
        el.cartButton.click();
        el.deleteButton.click();
        el.wait.until(ExpectedConditions.elementToBeClickable(el.okButton));
        el.okButton.click();
    }
}
