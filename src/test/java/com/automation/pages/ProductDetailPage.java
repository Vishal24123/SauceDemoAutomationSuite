package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends BasePage {

    @FindBy(xpath = "//div[@class='inventory_details_name large_size']")
    WebElement productTitle ;

    @FindBy(xpath = "//div[@class='inventory_details_price']")
    WebElement productPrice ;

    @FindBy(id = "add-to-cart")
    WebElement addToCartBtn ;

    public void clickOnAddToCartBtn(){
        addToCartBtn.click();
    }

    public boolean isProductDetailPageDisplayed(){
        return isElementPresent(productTitle);
    }
}
