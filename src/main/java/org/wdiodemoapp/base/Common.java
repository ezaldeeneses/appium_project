package org.wdiodemoapp.base;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.wdiodemoapp.utils.Driver;


public class Common {

    Driver driver = new Driver();

    public WebDriverWait wait = new WebDriverWait(driver.getDriver(),10); //Will be used to wait till element is visible

}






