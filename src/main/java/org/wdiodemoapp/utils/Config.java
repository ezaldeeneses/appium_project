package org.wdiodemoapp.utils;

import org.wdiodemoapp.constants.FrameworkCons;

import java.util.Properties;


public class Config {


    FrameworkCons cons = new FrameworkCons();
    Property property = new Property();

    private static final String APPIUM_URL = "appiumURL";
    private static final String ANDROID_AUTOMATION_NAME = "androidAutomationName";
    private static final String ANDROID_APP_LOCATION = "androidAppLocation";
    private static final String CONFIG_PROPERTIES = "config.properties";
    private Properties properties;
    private static Config configLoader;

    private Config() {

        properties = getConfigPropertyFile(CONFIG_PROPERTIES);
    }

    private Properties getConfigPropertyFile(String configFile) {
        return property.propertyLoader(cons.RESOURCES_MAIN_PATH + configFile);
    }

    private String getPropertyValue(String propertyKey) {
        String prop = properties.getProperty(propertyKey);
        if (prop != null) {
            return prop.trim();
        } else {
            throw new RuntimeException("Property " + propertyKey + " is not specified in the config.properties file");
        }
    }

    public static Config getInstance() {
        if (configLoader == null) {
            configLoader = new Config();
        }
        return configLoader;
    }

    public String getAppiumURL() {
        return getPropertyValue(APPIUM_URL);
    }

    public String getAndroidAutomationName() {

        return getPropertyValue(ANDROID_AUTOMATION_NAME);
    }

    public String getAndroidApplication() {
        return getPropertyValue(ANDROID_APP_LOCATION);
    }
}