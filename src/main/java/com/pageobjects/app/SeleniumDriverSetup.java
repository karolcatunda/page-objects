package com.pageobjects.app;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumDriverSetup {
    WebDriver browser;

    public SeleniumDriverSetup(WebDriver webDriver) {
        this.browser = webDriver;
    }

    public SeleniumDriverSetup() {
        System.setProperty("webdriver.chrome.driver", "./page-objects/chromedriver");
        WebDriverManager.chromedriver().setup();
        this.browser = new ChromeDriver();
    }

    public WebDriver getBrowser() {
        return browser;
    }

    public void navigateToPage(String urlPage) {
        browser.navigate().to(urlPage);
    }

    public void closeBrowser() {
        getBrowser().close();
    }
}
