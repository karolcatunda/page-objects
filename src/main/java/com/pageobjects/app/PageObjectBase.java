package com.pageobjects.app;

import com.pageobjects.environment.Environment;

public abstract class PageObjectBase {

    public void navigateToPage(String urlPage) {
        Environment.getBrowser().navigate().to(urlPage);
    }


}
