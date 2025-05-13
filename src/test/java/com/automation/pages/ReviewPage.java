package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPage extends BasePage{

    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    WebElement itemTotal ;

    @FindBy(xpath = "//div[@class='summary_tax_label']")
    WebElement tax ;

    @FindBy(xpath = "//div[@class='summary_total_label']")
    WebElement totalPrice ;

    @FindBy(id = "finish")
    WebElement finishBtn ;

    public boolean isReviewPageDisplayed(){
        return isElementPresent(finishBtn);
    }

    public void clickOnFinishBtn(){
        finishBtn.click();
    }
}
