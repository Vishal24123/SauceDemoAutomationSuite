package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomePage extends BasePage{

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement cartIcon ;

    @FindBy(xpath = "//button[contains(@id,'add-to-cart')]")
    List<WebElement> addToCartBtnList;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    WebElement cartItems;

    @FindBy(id = "react-burger-menu-btn")
    WebElement hamburgerMenu;

    @FindBy(id = "logout_sidebar_link")
    WebElement logOut;

    Select dropdown;

    @FindBy(css = ".inventory_item_img img")
    List<WebElement> productImages;

    @FindBy(xpath = "//div[@class='inventory_item']")
    List<WebElement> productListCard ;


    public boolean isHomePageDisplayed() {
        pause(2000);
        return isElementPresent(cartIcon);
    }

    public void clickOnAddToCartOfFirstItem() {
        addToCartBtnList.get(0).click();
    }

    public void clickOnShoppingCartLink() {
        cartIcon.click();
    }

    public int getCartIconQuantity() {
        return Integer.parseInt(cartItems.getText());
    }

    public void clickOnHamburgerMenu() {
        hamburgerMenu.click();
    }

    public void clickOnLogoutLink() {
        logOut.click();
    }

    public void selection(){
        dropdown = new Select(driver.findElement(By.xpath("//select[@data-test='product-sort-container']")));
    }

    public boolean priceHighToLow(){
        List<WebElement> productPrices = driver.findElements(By.cssSelector(".inventory_item_price"));
        dropdown.selectByValue("hilo");
        List<WebElement> productPrices1 = driver.findElements(By.cssSelector(".inventory_item_price"));
        List<Double> prices = new ArrayList<>();
        List<Double> prices1 = new ArrayList<>();
        for (WebElement priceElement : productPrices) {
            String priceText = priceElement.getText().trim().replace("$", "");
            prices.add(Double.parseDouble(priceText));
        }
        for (WebElement priceElement : productPrices1) {
            String priceText = priceElement.getText().trim().replace("$", "");
            prices1.add(Double.parseDouble(priceText));
        }
        Collections.sort(prices,Collections.reverseOrder());
        return prices1.equals(prices);
    }

    public boolean nameZToA(){
        List<WebElement> productElement = driver.findElements(By.cssSelector(".inventory_item_name"));
        dropdown.selectByValue("za");
        List<WebElement>  productElement1 = driver.findElements(By.cssSelector(".inventory_item_name "));
        List<String> productNames = new ArrayList<>();
        List<String> productNames1 = new ArrayList<>();
        for (WebElement nameElement : productElement) {
            productNames.add(nameElement.getText().trim());
        }
        for (WebElement nameElement : productElement1) {
            productNames1.add(nameElement.getText().trim());
        }
        Collections.sort(productNames, Collections.reverseOrder());
        return productNames.equals(productNames1);
    }

    public boolean priceLowToHigh(){
        List<WebElement> productPrices = driver.findElements(By.cssSelector(".inventory_item_price"));
        dropdown.selectByValue("lohi");
        List<WebElement> productPrices1 = driver.findElements(By.cssSelector(".inventory_item_price"));
        List<Double> prices = new ArrayList<>();
        List<Double> prices1 = new ArrayList<>();
        for (WebElement priceElement : productPrices) {
            String priceText = priceElement.getText().trim().replace("$", "");
            prices.add(Double.parseDouble(priceText));
        }
        for (WebElement priceElement : productPrices1) {
            String priceText = priceElement.getText().trim().replace("$", "");
            prices1.add(Double.parseDouble(priceText));
        }
        Collections.sort(prices);
        return prices1.equals(prices);
    }

    public boolean nameAToZ(){
        List<WebElement> productElement = driver.findElements(By.cssSelector(".inventory_item_name"));
        dropdown.selectByValue("az");
        List<WebElement>  productElement1 = driver.findElements(By.cssSelector(".inventory_item_name "));
        List<String> productNames = new ArrayList<>();
        List<String> productNames1 = new ArrayList<>();
        for (WebElement nameElement : productElement) {
            productNames.add(nameElement.getText().trim());
        }
        for (WebElement nameElement : productElement1) {
            productNames1.add(nameElement.getText().trim());
        }
        Collections.sort(productNames);
        return productNames.equals(productNames1);
    }

    public void clickOnAddToCartOfAllItem() {
        for(WebElement button:addToCartBtnList)
            button.click();
    }

    public int allAddToCartBtnPresent(){
        return addToCartBtnList.size();
    }

    public void addItemsToCart(int value) {
        for(int i = 0; i < value; i++)
            addToCartBtnList.get(i).click();
    }

    public void verifyProductImagesAreVisible() {
        for (WebElement image : productImages) {
            if (!image.isDisplayed()) {
                throw new AssertionError("Product image is not visible.");
            }
        }
    }
    public boolean isCartQuantityNull() {
        return !isElementPresent(cartItems);
    }

    public boolean isAddToCartButtonPresentForAllItems() {
        return addToCartBtnList.size() == productListCard.size() ;
    }

    public boolean isRemoveButtonPresent() {
        List<WebElement> removeBtns = driver.findElements(By.xpath("//button[@class='btn btn_secondary btn_small btn_inventory ']"));
        return !removeBtns.isEmpty();
    }

    public boolean clickAndCheckResponseTime(int seconds) {
        long startTime = System.currentTimeMillis();
        WebElement removeBtn = driver.findElement(By.xpath("//button[@class='btn btn_secondary btn_small btn_inventory ']"));
        if(removeBtn.getText().equalsIgnoreCase("Remove")){
            long endTime = System.currentTimeMillis();
            return (endTime - startTime) <= seconds * 1000;
        }
        return false;
    }

}
