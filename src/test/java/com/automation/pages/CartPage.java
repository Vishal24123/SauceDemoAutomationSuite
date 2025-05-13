package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage{

    @FindBy(xpath = "//span[@class='title']")
    WebElement cartTitle ;

    @FindBy(xpath = "//button[@class='btn btn_secondary btn_small cart_button']")
    List<WebElement> removeBtns ;

    @FindBy(id = "checkout")
    WebElement checkoutBtn ;

    @FindBy(xpath = "//div[@class='cart_item']")
    List<WebElement> cartItems ;

    @FindBy(id = "continue-shopping")
    WebElement continueShoppingBtn ;

    public boolean isCartPageDisplayed(){
        return isElementPresent(cartTitle);
    }

    public void clickOnRemoveBtn(){
        for(WebElement removeBtn: removeBtns)
            removeBtn.click();
    }

    public void clickOnCheckoutBtn(){
        checkoutBtn.click();
    }

    public boolean ItemsAdded(){
        return !cartItems.isEmpty();
    }

    public boolean isCartPageEmpty() {
        return cartItems.isEmpty();
    }

    public boolean verifyNumberOfProducts(int actualValue) {
        return (removeBtns.size() == actualValue);
    }

    public void navigateToHomePage(){
        continueShoppingBtn.click();
    }

    public boolean isCheckoutButtonDisabled() {
        return !checkoutBtn.isEnabled();
    }


}
