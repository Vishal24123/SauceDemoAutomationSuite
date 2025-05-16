package com.automation.steps;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.File;

public class Hooks {

    @Before
    public void setUp(){
        ConfigReader.initConfigurations();
        DriverManager.createDriver();
    }

    @After
    public void cleanUp(){
        DriverManager.getDriver().quit();
    }

    @AfterStep
    public void takeScreenshot(Scenario scenario) {
        String path = System.getProperty("user.dir") + "\\target\\screenshots";
        File screenshotDir = new File(path);
        if (!screenshotDir.exists()) {
            screenshotDir.mkdirs();
        }
        try {
            final byte[] screenshot = DriverManager.takeScreenshot();
            scenario.attach(screenshot, "image/png", scenario.getName());
        } catch (Exception e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
        }
    }
}
