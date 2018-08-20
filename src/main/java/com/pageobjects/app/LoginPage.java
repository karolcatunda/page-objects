package com.pageobjects.app;

import com.pageobjects.environment.Environment;
import org.openqa.selenium.By;

public class LoginPage extends PageObjectBase {
    String usernameLabelId = "login-form-username";
    String passwordLabelId = "login-form-password";
    String submitButtonLabelId = "login-form-submit";



    public InitialPage signIn(String username, String password){
        doLogin(username, password);
        return new InitialPage();
    }

    private void doLogin(String username, String password) {
        Environment.getBrowser().findElement(By.id(usernameLabelId)).sendKeys(username);
        Environment.getBrowser().findElement(By.id(passwordLabelId)).sendKeys(password);
        Environment.getBrowser().findElement(By.id(submitButtonLabelId)).click();

    }

}
