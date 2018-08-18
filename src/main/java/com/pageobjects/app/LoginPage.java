package com.pageobjects.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends SeleniumDriverSetup {

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public InitialPage signIn(String username, String password){
        doLogin(username, password);
        return new InitialPage(getBrowser());
    }

    private void doLogin(String username, String password) {
        getBrowser().findElement(By.id("login-form-username")).sendKeys(username);
        getBrowser().findElement(By.id("login-form-password")).sendKeys(password);
        getBrowser().findElement(By.id("login-form-submit")).click();

    }

}
