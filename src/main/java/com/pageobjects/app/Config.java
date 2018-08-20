package com.pageobjects.app;

import java.util.ResourceBundle;

public class Config {
    ResourceBundle resourceBundle;
    String configFileName = "config";

    public Config() {
        try {
            resourceBundle = ResourceBundle.getBundle(configFileName);

        } catch (Exception e){
            System.out.println("Exception occurred while get config.properties file: " + e.getMessage());
        }
    }

    public String getConfigProperty(String key) {
        String value = resourceBundle.getString(key);
        return value;
    }
}
