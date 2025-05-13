package com.automation.steps;

import com.automation.pages.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutStep {

    CheckoutPage checkoutPage = new CheckoutPage();

    @Then("verify user is on checkout page")
    public void verifyUserIsOnCheckoutPage() {
        Assert.assertTrue(checkoutPage.isCheckoutPageDisplayed());
    }


    @When("user enters the checkout details")
    public void userEntersTheCheckoutDetails() {
        checkoutPage.userEntersTheDetails();
    }

    @And("user click on continue button")
    public void userClickOnContinueButton() {
        checkoutPage.clickOnContinueBtn();
    }

}
