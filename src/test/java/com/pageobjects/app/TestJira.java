package com.pageobjects.app;

import com.pageobjects.environment.Environment;
import org.junit.Assert;
import org.junit.Test;

public class TestJira {
    private String loginPageUrl = "https://jira.atlantico.com.br/login.jsp";
    private String username = "username"; // Change before run the tests
    private String password = "password"; // Change before run the tests


    @Test
    public void testLogin() {
        Environment.openBrowser();
        LoginPage loginPage = new LoginPage();
        loginPage.navigateToPage(loginPageUrl);
        InitialPage initialPage = loginPage.signIn(username, password);
        Assert.assertTrue(initialPage.isOnInitialPage());
        Environment.closeBrowser();
    }
}
