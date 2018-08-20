package com.pageobjects.environment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Environment {
    static WebDriver browser;

    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "./page-objects/chromedriver");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        browser = new ChromeDriver(options);
    }

    public static void closeBrowser() {
        browser.close();
    }

    public static WebDriver getBrowser() {
        return browser;
    }

}
