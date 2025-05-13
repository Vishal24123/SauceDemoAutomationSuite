package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{

    @FindBy(id = "first-name")
    WebElement firstNameInput ;

    @FindBy(id = "last-name")
    WebElement lastNameInput ;

    @FindBy(id = "postal-code")
    WebElement zipCodeInput ;

    @FindBy(id = "continue")
    WebElement continueBtn ;

    public boolean isCheckoutPageDisplayed(){
        return isElementPresent(continueBtn);
    }

    public void userEntersTheDetails(){
        firstNameInput.sendKeys(ConfigReader.getConfigValue("first.name"));
        lastNameInput.sendKeys(ConfigReader.getConfigValue("last.name"));
        zipCodeInput.sendKeys(ConfigReader.getConfigValue("zip.code"));
    }

    public void clickOnContinueBtn(){
        continueBtn.click();
    }
}
