package org.wdiodemoapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.wdiodemoapp.base.Common;
import org.wdiodemoapp.constants.FrameworkCons;
import org.wdiodemoapp.utils.Driver;

public class FormPage {

    FrameworkCons cons = new FrameworkCons();
    Common com = new Common();
    Driver driver = new Driver();

    //For sure using accessibility id is better than Xpath, but most of the elements doesn't have ID
    public void pressFormPage() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_Form.getString("formScreen"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_Form.getString("formScreen"))).click();
    }
    public void pressFormSwitch() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_Form.getString("tabSwitchToggle"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_Form.getString("tabSwitchToggle"))).click();
    }
    public void pressFormList() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_Form.getString("dropDownList"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_Form.getString("dropDownList"))).click();
    }
    public void pressFormListOp2() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_Form.getString("selectDropListOP2"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_Form.getString("selectDropListOP2"))).click();
    }
    public void pressFormActiveBtn() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_Form.getString("activeBtn"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_Form.getString("activeBtn"))).click();
    }
    public void pressOkFormActiveMsg() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_Form.getString("activeOkBtn"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_Form.getString("activeOkBtn"))).click();
    }

    public void checkFormPage() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_Form.getString("checkFormScreen"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_Form.getString("checkFormScreen"))).isDisplayed();
        System.out.println("Form screen is opened");
    }
    public void checkFormInputField() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_Form.getString("checkFormInput"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_Form.getString("checkFormInput"))).isDisplayed();
        System.out.println("Form input Passed");
    }
    public void checkFormSwitchOn() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_Form.getString("checkSwitchOnMsg"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_Form.getString("checkSwitchOnMsg"))).isDisplayed();
        System.out.println("Form switch is on");
    }
    public void checkFormSwitchOff() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_Form.getString("checkSwitchOffMsg"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_Form.getString("checkSwitchOffMsg"))).isDisplayed();
        System.out.println("Form switch is off");
    }
    public void checkFormListOp2() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_Form.getString("checkDropListOP2"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_Form.getString("checkDropListOP2"))).isDisplayed();
        System.out.println("Form list option 2 is selected");
    }
    public void checkFormActiveBtnMsg() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_Form.getString("checkActiveBtn"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_Form.getString("checkActiveBtn"))).isDisplayed();
        System.out.println("Form active button is pressed");
    }

    public void formInputField() {
        com.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(cons.jsonObject_Form.getString("formInputField"))));
        driver.getDriver().findElement(By.xpath(cons.jsonObject_Form.getString("formInputField"))).sendKeys(cons.jsonObject_FormData.getString("formInputData"));
    }




}
