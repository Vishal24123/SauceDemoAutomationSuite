package com.automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverManager {

    static WebDriver driver;

    public static void createDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--disable-infobars");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-com.automation"});
        options.setExperimentalOption("useAutomationExtension", false);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static byte[] takeScreenshot() {
        return  ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}
