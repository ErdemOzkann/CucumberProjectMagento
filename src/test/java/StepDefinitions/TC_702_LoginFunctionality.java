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

public class TC_702_LoginFunctionality extends GWD {

    Elements elements = new Elements();

    @Given("Navigate to magento webpage")
    public void navigateToMagentoWebpage() {
        logger.info("Test Başladı.");
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }


    @And("Click to Signin button")
    public void clickToSigninButton() {

        elements.myClick(elements.SignInHomePage);
    }

    @When("Enter Email and password {string} and {string} and click to SignIn button")
    public void enterEmailAndPasswordAndAndClickToSignInButton(String Email, String password) {

        elements.mySendKeys(elements.SignInEmail, Email);

        elements.mySendKeys(elements.SignInPassword, password);

        elements.SignIn.click();

    }

    @And("User should be Sigin succesfully")
    public void userShouldBeSiginSuccesfully() {

        elements.wait.until(ExpectedConditions.textToBePresentInElement(elements.Welcome, "Welcome"));

        Assert.assertTrue(elements.Welcome.getText().contains("Welcome"));
    }

    @When("Enter invalid Email and password combinations")
    public void enterInvalidEmailAndPasswordCombinations(DataTable datas) {
        List<List<String>> listdatas = datas.asLists();

        for (int i = 0; i < listdatas.size(); i++)
            elements.mySendKeys(elements.getWebElement(listdatas.get(i).get(0)), listdatas.get(i).get(1));

        elements.SignIn.click();
    }

    @And("User should not be Sigin")
    public void userShouldNotBeSigin() {

        elements.wait.until(ExpectedConditions.textToBePresentInElement(elements.incorrect, "incorrect"));

        Assert.assertTrue(elements.incorrect.getText().contains("incorrect"));
    }


    @Given("Click to Forgot Your Password button")
    public void clickToForgotYourPasswordButton() {

        elements.myClick(elements.SignInHomePage);

        elements.myClick(elements.ForgotYourPasswordButton);

    }

    @Then("Enter an email {string}")
    public void enterAnEmail(String email) {

        elements.mySendKeys(elements.ForgotYourPasswordEmail, email);

        elements.myClick(elements.ResetMyPassword);

    }

    @And("Forgot Your Password Functionality must be run")
    public void forgotYourPasswordFunctionalityMustBeRun() {

        elements.wait.until(ExpectedConditions.textToBePresentInElement(elements.YourPassResetText, "you will receive"));

        Assert.assertTrue(elements.YourPassResetText.getText().contains("you will receive"));

    }
}
