
Appium Installation Guide for Windows

This README provides a step-by-step guide to install Appium on Windows and run an Android project.

###################################################

Prerequisites

Before we begin, ensure that you have the following prerequisites installed:

1. Java Development Kit (JDK): Appium requires Java to run, as it depends on the Android SDK.
2. Node.js and NPM: Appium is a Node.js application, so you will need to have Node.js installed.
3. Android Studio: This includes the Android SDK, which is necessary to run Android tests.
4. Appium: The main automation tool for testing mobile applications.
5. IntelliJ IDEA Community Edition: Perfect IDE for Java development, we will use it for running Appium tests. 

###################################################

Step 1: Install Java Development Kit (JDK)

1. Download the latest version of JDK from (https://download.oracle.com/java/17/archive/jdk-17.0.8_windows-x64_bin.exe).
2. Run the installer and follow the instructions to complete the installation.
3. After installation, set the `JAVA_HOME` environment variable:
   - Right-click on "This PC", and click "Properties".
   - Click "Advanced System Settings", and then click "Environment Variables".
   - Under "System Variables", click "New" and enter:
     - Variable name: 'JAVA_HOME'
     - Variable value: Path to your JDK installation (e.g 'C:\Program Files\Java\jdk-17.0.8')
4. Add Java to the 'PATH' environment variable:
   - In the "Environment Variables" window, find the 'Path' variable under "System variables" and click "Edit".
   - Add the "bin" directory of the JDK to the path (e.g 'C:\Program Files\Java\jdk-17.0.8\bin').

5. Verify the installation by running the following command in Command Prompt (Terminal):

	--java -version

###################################################

Step 2: Install Node.js and NPM

1. Download the latest version of Node.js from (https://nodejs.org/).
2. Run the installer and follow the on-screen instructions.
3. Verify the installation by running the following command in Command Prompt (Terminal):

   	--node -v
   	--npm -v

###################################################

Step 3: Install Android Studio

1. Download Android Studio from the official website:(https://developer.android.com/studio).
2. Run the installer and follow the installation steps.
3. After installation, open Android Studio and complete the setup, ensuring that:
   - Android SDK is installed.
   - Android Virtual Device (AVD) is configured for testing on an emulator.
4. Set the 'ANDROID_HOME' environment variable:
   - Right-click on "This PC", click "Properties".
   - Click "Advanced System Settings", and then click "Environment Variables".
   - Under "System Variables", click "New" and enter:
     - Variable name: 'ANDROID_HOME'
     - Variable value: Path to the Android SDK (e.g 'C:\Users\<YourUsername>\AppData\Local\Android\Sdk').
5. Add the following directories to the 'Path' environment variable:
   - 'C:\Users\<YourUsername>\AppData\Local\Android\Sdk\platform-tools'
   - 'C:\Users\<YourUsername>\AppData\Local\Android\Sdk\tools'

6. Verify the installation by running the following command in Command Prompt (Terminal):
   
	--adb version


###################################################

Step 4: Install IntelliJ IDEA Community Edition

Download IntelliJ IDEA Community Edition from (https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC) .

- Run the installer and follow the installation steps.

- After installation, open IntelliJ IDEA.

Configure IntelliJ for Java development:

- Open IntelliJ IDEA and create a new Java project.
- Set the JDK path (usually IntelliJ will auto detect your JDK).
- If prompted, install Java SDK if you havent already done.

###################################################

Step 5: Install Appium

1. Open Command Prompt and install Appium globally using NPM:

   	--npm install -g appium

2. After installation, verify that Appium is installed:

	--appium -v

3. After verifiying, open Command Prompt and install UiAutomator2:

	--appium driver install uiautomator2

###################################################

Step 6: Install Appium Doctor

1. Appium Doctor helps you diagnose and fix any issues with your environment setup.
   To install it, run the following command:
 
   	--npm install -g appium-doctor

2. After installation, run:

   	--appium-doctor

   It will check your environment and show any missing dependencies or issues that need fixing, but if you follow the above steps everything should be good.

###################################################

Step 7: Install Android Dependencies for Appium

You may need to install additional dependencies for Appium to work with Android:

1. Android SDK Tools: Make sure the following Android tools are installed via Android Studio SDK Manager:
   - Android SDK Build-Tools
   - Android SDK Platform-Tools
   - Android SDK Tools

###################################################

Step 8: Configure Android Device (Emulator)

1. To run your tests on an Android Emulator:
   - Open Android Studio, go to "Tools" > "AVD Manager".
   - Create a new Virtual Device with a desired configuration (e.g Pixel 6, API Level 33).
   - Start the emulator.

###################################################

Step 9: Run Your Android Project with Appium

1. If you installed all tools in the default location, then just go to > wdiodemoapp_Android.xml, change the emulator name (device name) to yours, and run the xml.
2. If you installed the tools in another location, then you need to set the location for android sdk, appium, and node ( Instructions beside each one inside the project ).

###################################################

Troubleshooting

- Appium Not Starting: If Appium does not start, ensure that all dependencies are installed, and there are no conflicting processes. Use 'appium-doctor' to diagnose issues.
- Emulator Issues: If the emulator isn't launching or running tests properly, ensure that the Android Virtual Device (AVD) is correctly configured.

###################################################

Conclusion

You have now set up Appium on Windows and are ready to run Android tests.

