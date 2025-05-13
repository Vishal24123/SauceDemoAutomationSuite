package com.automation.steps;

import com.automation.pages.OrderConfirmationPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class OrderConfirmationStep {

    OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();

    @Then("verify is on order confirmation page")
    public void verifyIsOnOrderConfirmationPage() {
        Assert.assertTrue(orderConfirmationPage.isOrderConfirmationPageDisplayed());
    }
}
