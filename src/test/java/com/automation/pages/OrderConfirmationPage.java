package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPage extends BasePage{

    @FindBy(xpath = "//h2[@class='complete-header']")
    WebElement orderConfirmationText ;

    @FindBy(id = "back-to-products")
    WebElement backHomeBtn ;

    public boolean isOrderConfirmationPageDisplayed(){
        return isElementPresent(orderConfirmationText);
    }

    public void clickOnBackHomeBtn(){
        backHomeBtn.click();
    }
}
