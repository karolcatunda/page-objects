package com.pageobjects.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InitialPage extends SeleniumDriverSetup {
    public InitialPage(WebDriver webDriver){
        super(webDriver);
    }

    public boolean isOnInitialPage() {
        return getBrowser().findElement(By.id("header-details-user-fullname")).isDisplayed();
    }
}
