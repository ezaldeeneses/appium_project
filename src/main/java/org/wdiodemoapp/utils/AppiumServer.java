package org.wdiodemoapp.utils;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.wdiodemoapp.constants.FrameworkCons;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.HashMap;

public class AppiumServer {

    FrameworkCons cons = new FrameworkCons();


    public AppiumDriverLocalService getAppiumService() {

        HashMap<String, String> environment = new HashMap<String, String>();

        environment.put(cons.ANDROID_HOME,cons.ANDROID_HOME_PATH);

        return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .usingDriverExecutable(new File(cons.NODE_INSTALLATION_PATH))
                .withAppiumJS(new File(cons.APPIUM_INSTALLATION_PATH)).usingPort(4723)
                .withArgument(() -> "-pa", "/wd/hub")
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE).withEnvironment(environment));
    }

    public static boolean checkIfAppiumServerIsRunning(int port) throws Exception {
        boolean isAppiumServerRunning = false;
        ServerSocket socket;
        try {
            socket = new ServerSocket(port);
            socket.close();
        } catch (IOException e) {
            isAppiumServerRunning = true;
        } finally {
            socket = null;
        }
        return isAppiumServerRunning;
    }

}
