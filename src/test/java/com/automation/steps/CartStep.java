package com.automation.steps;

import com.automation.pages.CartPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartStep {

    CartPage cartPage = new CartPage();

    @Then("verify user is on cart page")
    public void verifyUserIsOnCartPage() {
        Assert.assertTrue(cartPage.isCartPageDisplayed());
    }

    @And("verify the product is add to the cart")
    public void verifyTheProductIsAddToTheCart() {
        Assert.assertTrue(cartPage.ItemsAdded());
    }

    @When("user clicks on remove button of the product")
    public void userClicksOnRemoveButtonOfTheProduct() {
        cartPage.clickOnRemoveBtn();
    }

    @Then("verify cart page is empty")
    public void verifyCartPageIsEmpty() {
        Assert.assertTrue(cartPage.isCartPageEmpty());
    }

    @When("user click on checkout button")
    public void userClickOnCheckoutButton() {
        cartPage.clickOnCheckoutBtn();
    }

    @And("verify {int} products are add to the cart")
    public void verifyProductsAreAddToTheCart(int actualValue) {
        Assert.assertTrue(cartPage.verifyNumberOfProducts(actualValue));
    }

    @When("user navigates back to the home page")
    public void userNavigatesBackToTheHomePage() {
        cartPage.navigateToHomePage();
    }

    @And("verify checkout button is disabled")
    public void verifyCheckoutButtonIsDisabled() {
        Assert.assertTrue(cartPage.isCheckoutButtonDisabled());
    }

}
