package com.automation.steps;

import com.automation.pages.ReviewPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ReviewStep {

    ReviewPage reviewPage =  new ReviewPage();

    @Then("verify user is on review page")
    public void verifyUserIsOnReviewPage() {
        Assert.assertTrue(reviewPage.isReviewPageDisplayed());
    }


    @When("user clicks on finish button")
    public void userClicksOnFinishButton() {
        reviewPage.clickOnFinishBtn();
    }

}
