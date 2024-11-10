package org.wdiodemoapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.wdiodemoapp.base.Common;
import org.wdiodemoapp.constants.FrameworkCons;
import org.wdiodemoapp.utils.Driver;

public class LoginPage {



    FrameworkCons cons = new FrameworkCons();
    Common com = new Common();
    Driver driver = new Driver();

    //For sure using accessibility id is better than Xpath, but most of the elements doesn't have ID
    public void pressLoginScreen() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_Login.getString("loginScreen"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_Login.getString("loginScreen"))).click();
    }
    public void pressLoginTab() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_Login.getString("loginTab"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_Login.getString("loginTab"))).click();
    }
    public void pressLoginBtn() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_Login.getString("loginBtn"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_Login.getString("loginBtn"))).click();
    }
    public void pressLoginMsgOkBtn() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_Login.getString("signInAlertOKBtn"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_Login.getString("signInAlertOKBtn"))).click();
    }
    public void checkLoginSuccess() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_Login.getString("loginSuccessMsg"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_Login.getString("loginSuccessMsg"))).isDisplayed();
        System.out.println("Logged in successfully");
    }


}
