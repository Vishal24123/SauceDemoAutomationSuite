package com.automation.steps;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStep {

    LoginPage loginPage = new LoginPage();

    @Given("user opens the application")
    public void userOpensTheApplication() {
        loginPage.openApplication();
    }

    @Then("verify user is on login page")
    public void verifyUserIsOnLoginPage() {
        Assert.assertTrue(loginPage.isLoginPageDisplayed());
    }

    @When("user enters {string} and {string}")
    public void userEntersAnd(String username, String password) {
        loginPage.enterCredentials(username,password);
    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton() {
        loginPage.clickOnLoginBtn();
    }

    @Then("verify error message")
    public void verifyErrorMessage() {
        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
    }

    @Then("verify login button is enabled")
    public void verifyLoginButtonIsEnabled() {
        Assert.assertTrue(loginPage.isLoginButtonEnabled());
    }
}
