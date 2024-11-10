package org.wdiodemoapp.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import org.wdiodemoapp.constants.FrameworkCons;
import org.wdiodemoapp.utils.*;

import java.net.URL;

public class Base {

    AppiumDriver driverr;

    FrameworkCons cons = new FrameworkCons();
    AppiumServer appiumServer = new AppiumServer();
    Driver driver = new Driver();

    private AppiumDriverLocalService server;

   //@Parameters to run from XML file added capabilities
    @Parameters({ "platformName", "udid", "deviceName", "systemPort"})
    @BeforeTest
    //@Optional -> means we are setting the default value
    public void beforeTest( String platformName, String udid, String deviceName, @Optional String systemPort) throws Exception {

        //This will get appium url from config file
        URL url = new URL(Config.getInstance().getAppiumURL());

        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(cons.CAPABILITY_PLATFORM_NAME, platformName);
            caps.setCapability(cons.CAPABILITY_DEVICE_NAME, deviceName);
            caps.setCapability(cons.CAPABILITY_AUTOMATION_NAME, Config.getInstance().getAndroidAutomationName());
            caps.setCapability(cons.CAPABILITY_UDID, udid);
            caps.setCapability(cons.CAPABILITY_ANDROID_AVD, deviceName);
            caps.setCapability(cons.CAPABILITY_ANDROID_AVD_LunchTime,500000);
            caps.setCapability(cons.CAPABILITY_APP, Config.getInstance().getAndroidApplication());
            caps.setCapability(cons.CAPABILITY_ANDROID_SYSTEM_PORT, systemPort);


            driverr = new AndroidDriver(url,caps);
            driver.setDriver(driverr);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @AfterTest
    public void afterTest() {
        driver.getDriver().quit();
    }


    @BeforeSuite
    public void beforeSuite() throws Exception {

        server = appiumServer.getAppiumService();
        if (!AppiumServer.checkIfAppiumServerIsRunning(4723)) {
            server.start();
            server.clearOutPutStreams();//This will not print the Appium server Logs in IDE console

        }

    }

    @AfterSuite
    public void afterSuite() {
        server.stop();
    }
}
