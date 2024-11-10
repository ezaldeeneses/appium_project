package org.wdiodemoapp.constants;

import org.json.JSONObject;
import org.wdiodemoapp.utils.JSONLoader;
import org.wdiodemoapp.utils.Username;


public class FrameworkCons {

    Username username = new Username();

    public final String PROJECT_LOCATION = System.getProperty("user.dir");
    public final String RESOURCES_MAIN_PATH = PROJECT_LOCATION + "/src/main/resources/";
    public final String NODE_INSTALLATION_PATH = "C:\\Program Files\\nodejs\\node.exe"; //This is nodeJs default location, can be found by typing in terminal where node
    public final String APPIUM_INSTALLATION_PATH = "\\Users\\"+ username.getUserName()+"\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"; // This is appium default location, can be found by typing in terminal where appium

    public final String ANDROID_HOME_PATH = "\\Users\\"+username.getUserName()+"\\AppData\\Local\\Android\\Sdk"; //Android SDK Default Location
    public final String ANDROID_HOME = "ANDROID_HOME";

    public final String JSON_Element_FILE = "data/elements.json"; //Define elements json location
    public final String JSON_DATA_FILE = "data/data.json"; //Define elements json location

    public final String SignUpData = "signUpData";
    public final String FormData = "formData";


    public final String LoginPageElement = "loginPage";
    public final String SignUpPageElement = "signUp";
    public final String FormPageElement = "formSection";
    public final String SwipePageElement = "swipeSection";


    public final String CAPABILITY_APP = "app";
    public final String CAPABILITY_PLATFORM_NAME = "platformName";
    public final String CAPABILITY_DEVICE_NAME = "deviceName";
    public final String CAPABILITY_AUTOMATION_NAME = "automationName";
    public final String CAPABILITY_UDID = "udid";

    public final String CAPABILITY_ANDROID_SYSTEM_PORT = "systemPort";
    public final String CAPABILITY_ANDROID_AVD = "avd";
    public final String CAPABILITY_ANDROID_AVD_LunchTime = "avdLaunchTimeout";


    public JSONObject jsonObject_SignUpData =
            new JSONLoader().getJSONObject(JSON_DATA_FILE).getJSONObject(SignUpData);

    public JSONObject jsonObject_FormData =
            new JSONLoader().getJSONObject(JSON_DATA_FILE).getJSONObject(FormData);

    public JSONObject jsonObject_Login =
            new JSONLoader().getJSONObject(JSON_Element_FILE).getJSONObject(LoginPageElement);

    public JSONObject jsonObject_SignUp =
            new JSONLoader().getJSONObject(JSON_Element_FILE).getJSONObject(SignUpPageElement);

    public JSONObject jsonObject_Form =
            new JSONLoader().getJSONObject(JSON_Element_FILE).getJSONObject(FormPageElement);

    public JSONObject jsonObject_Swipe =
            new JSONLoader().getJSONObject(JSON_Element_FILE).getJSONObject(SwipePageElement);

}
