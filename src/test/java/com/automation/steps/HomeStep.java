package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeStep {

    HomePage homePage = new HomePage();
    Boolean sortingDone;

    @Then("verify user is on home page")
    public void verifyUserIsOnHomePage() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }


    @When("user clicks on add to cart button of the first product")
    public void userClicksOnAddToCartButtonOfTheFirstProduct() {
        homePage.clickOnAddToCartOfFirstItem();
    }

    @Then("verify cart quantity equals {int}")
    public void verifyCartQuantityEquals(int value) {
        Assert.assertEquals(homePage.getCartIconQuantity(),value);
    }

    @When("user clicks on cart button")
    public void userClicksOnCartButton() {
        homePage.clickOnShoppingCartLink();
    }


    @When("user clicks on A-Z sorting")
    public void userClicksOnAZSorting() {
        homePage.selection();
        sortingDone = homePage.nameAToZ();
    }

    @When("user clicks on Z-A sorting")
    public void userClicksOnZASorting() {
        homePage.selection();
        sortingDone = homePage.nameZToA();
    }

    @When("user clicks on low-high sorting")
    public void userClicksOnLowHighSorting() {
        homePage.selection();
        sortingDone = homePage.priceLowToHigh();
    }
    @When("user clicks on high-low sorting")
    public void userClicksOnHighLowSorting() {
        homePage.selection();
        sortingDone = homePage.priceHighToLow();
    }

    @Then("verify sorting is completed")
    public void verifySortingIsCompleted() {
        Assert.assertTrue(sortingDone);
    }

    @When("user clicks on add to cart button of {int} product")
    public void userClicksOnAddToCartButtonOfProduct(int value) {
        homePage.addItemsToCart(value);
    }

    @And("verify product images are rendered")
    public void verifyProductImagesAreRendered() {
        homePage.verifyProductImagesAreVisible();
    }

    @When("user clicks on hamburger menu")
    public void userClicksOnHamburgerMenu() {
        homePage.clickOnHamburgerMenu();
    }

    @And("user clicks on logout option")
    public void userClicksOnLogoutOption() {
        homePage.clickOnLogoutLink();
    }

    @Then("verify cart quantity is null")
    public void verifyCartQuantityIsNull() {
        Assert.assertTrue(homePage.isCartQuantityNull());
    }

    @And("verify each product has add to cart button")
    public void verifyEachProductHasAddToCartButton() {
        Assert.assertTrue(homePage.isAddToCartButtonPresentForAllItems());
    }

    @Then("verify the button changed to remove button")
    public void verifyTheButtonChangedToRemoveButton() {
        Assert.assertTrue(homePage.isRemoveButtonPresent());
    }

    @Then("verify button response should occur within {int} second")
    public void verifyButtonResponseShouldOccurWithinSecond(int seconds) {
        Assert.assertTrue(homePage.clickAndCheckResponseTime(seconds));
    }
}
