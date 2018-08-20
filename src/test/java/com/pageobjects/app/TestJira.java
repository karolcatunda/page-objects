package com.pageobjects.app;

import com.pageobjects.environment.Environment;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TestJira extends TestCase {
    private String loginPageUrl = "https://jira.atlantico.com.br/login.jsp";
    private Config configFile;

    @Override
    protected void setUp() {
        Environment.openBrowser();
        configFile = new Config();
    }

    @Override
    protected void tearDown() {
        Environment.closeBrowser();
    }

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.navigateToPage(loginPageUrl);
        String username = this.configFile.getConfigProperty("username");
        String password = this.configFile.getConfigProperty("password");
        InitialPage initialPage = loginPage.signIn(username, password);
        Assert.assertTrue(initialPage.isOnInitialPage());
    }

}
