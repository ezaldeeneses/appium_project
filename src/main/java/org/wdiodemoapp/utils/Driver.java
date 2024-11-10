package org.wdiodemoapp.utils;

import io.appium.java_client.AppiumDriver;

public class Driver {

    private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<AppiumDriver>();

    public AppiumDriver getDriver() {
        return driver.get();
    }

    public void setDriver(AppiumDriver driverref) {
        driver.set(driverref);
    }

}
