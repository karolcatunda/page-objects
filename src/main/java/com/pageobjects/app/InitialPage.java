package com.pageobjects.app;

import com.pageobjects.environment.Environment;
import org.openqa.selenium.By;

public class InitialPage extends PageObjectBase {
    String userNameLabelId = "header-details-user-fullname";

    public boolean isOnInitialPage() {
        return Environment.getBrowser().findElement(By.id(userNameLabelId)).isDisplayed();
    }
}
