package org.wdiodemoapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.wdiodemoapp.base.Common;
import org.wdiodemoapp.constants.FrameworkCons;
import org.wdiodemoapp.utils.Driver;

public class SignUpPage {

    FrameworkCons cons = new FrameworkCons();
    Common com = new Common();
    Driver driver = new Driver();


    //For sure using accessibility id is better than Xpath, but most of the elements doesn't have ID

    public void pressSignUpTab() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_SignUp.getString("signUpTab"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_SignUp.getString("signUpTab"))).click();
    }
    public void pressSignUpBtn() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_SignUp.getString("signUpBtn"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_SignUp.getString("signUpBtn"))).click();
    }
     public void signUpFillEmail() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_SignUp.getString("signUpEmailField"))));
         driver.getDriver().findElement(By.xpath(cons.jsonObject_SignUp.getString("signUpEmailField"))).sendKeys(cons.jsonObject_SignUpData.getString("signUpEmail"));
    }
    public void signUpFillPassword() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_SignUp.getString("signUpPasswordField"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_SignUp.getString("signUpPasswordField"))).sendKeys(cons.jsonObject_SignUpData.getString("signUpPass"));
    }
    public void signUpFillRePassword() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_SignUp.getString("signUpRepeatPasswordField"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_SignUp.getString("signUpRepeatPasswordField"))).sendKeys(cons.jsonObject_SignUpData.getString("signUpPass"));
    }
    public void signUpSuccessMsg() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_SignUp.getString("signUpAlertMessage"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_SignUp.getString("signUpAlertMessage"))).isDisplayed();
        System.out.println("SignUp Success");
    }
    public void signUpSuccessMsgOKBtn() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_SignUp.getString("signUpAlertOKBtn"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_SignUp.getString("signUpAlertOKBtn"))).click();
    }

}

