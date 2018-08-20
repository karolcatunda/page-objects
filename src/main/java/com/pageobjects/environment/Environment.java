package com.pageobjects.environment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Environment {
    static WebDriver browser;

    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "./page-objects/chromedriver");
        WebDriverManager.chromedriver().setup();
        browser = new ChromeDriver();
    }

    public static void closeBrowser() {
        browser.close();
    }

    public static WebDriver getBrowser() {
        return browser;
    }

}
