package com.pageobjects.app;

import org.junit.Assert;
import org.junit.Test;

public class TestJira {
    protected SeleniumDriverSetup testSetup = new SeleniumDriverSetup();
    protected LoginPage loginPage;
    protected InitialPage initialPage;

    private String loginPageUrl = "https://jira.atlantico.com.br/login.jsp";
    private String username = "username"; // Change before run the tests
    private String password = "password"; // Change before run the tests


    @Test
    public void testJira() {
        accessLoginPage();
        doLogin();
        checkIfIsOnInitialPage();
        closeBrowser();
    }

    private void accessLoginPage() {
        this.testSetup.navigateToPage(loginPageUrl);

    }

    private void doLogin(){
        this.loginPage = new LoginPage(this.testSetup.getBrowser());
        this.initialPage = loginPage.signIn(username, password);

    }

    private void checkIfIsOnInitialPage() {
        Assert.assertTrue(this.initialPage.isOnInitialPage());
    }

    private void closeBrowser() {
        this.testSetup.closeBrowser();
    }

}
