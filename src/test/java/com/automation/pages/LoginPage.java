package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "user-name")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "login-button")
    WebElement loginBtn ;

    @FindBy(xpath = "//div[@class='login_logo']")
    WebElement loginLogo ;

    public void openApplication(){
        driver.get(ConfigReader.getConfigValue("application.url"));
    }

    public boolean isLoginPageDisplayed() {
        return isElementPresent(loginLogo);
    }

    public void enterCredentials(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
    }

    public void clickOnLoginBtn() {
        loginBtn.click();
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed();
    }

    public boolean isLoginButtonEnabled() {
        return loginBtn.isEnabled();
    }
}
