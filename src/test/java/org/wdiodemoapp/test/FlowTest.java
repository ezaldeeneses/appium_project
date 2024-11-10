package org.wdiodemoapp.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.wdiodemoapp.base.Base;
import org.wdiodemoapp.base.Common;
import org.wdiodemoapp.constants.FrameworkCons;
import org.wdiodemoapp.pages.FormPage;
import org.wdiodemoapp.pages.LoginPage;
import org.wdiodemoapp.pages.SignUpPage;
import org.wdiodemoapp.pages.SwipePage;

import java.lang.reflect.Method;

public class FlowTest extends Base {

    FrameworkCons cons;
    LoginPage login;
    SignUpPage signUpPage;
    FormPage formPage;
    Common com;
    SwipePage swipePage;


    @BeforeMethod
    public void beforeMethod(Method method){
        this.cons = new FrameworkCons();
        this.login = new LoginPage();
        this.signUpPage = new SignUpPage();
        this.formPage = new FormPage();
        this.com = new Common();
        this.swipePage = new SwipePage();
    }

    @Test
    public void fullFlow()  {
        login.pressLoginScreen(); //Will press on login bottom tab
        signUpPage.pressSignUpTab(); //Will press on signup tab
        signUpPage.signUpFillEmail(); //Will fill signup email field
        signUpPage.signUpFillPassword(); //Will fill sign password field
        signUpPage.signUpFillRePassword(); //Will fill signup retype password field
        signUpPage.pressSignUpBtn(); //Will press on signup button
        signUpPage.signUpSuccessMsg(); //Will check signup success message appearance
        signUpPage.signUpSuccessMsgOKBtn(); //Will press on message alert OK button
        login.pressLoginTab(); //Will press on login tab
        login.pressLoginBtn(); //Information already filled, will press on sign in button
        login.checkLoginSuccess(); //Will check login success message appearance
        login.pressLoginMsgOkBtn(); //Will press on message alert ok button
        formPage.pressFormPage(); //Will press on form bottom tab
        formPage.checkFormPage(); //Will check form page appearance
        formPage.formInputField(); //Will fill form input field
        formPage.checkFormInputField(); //Will check form input field value
        formPage.checkFormSwitchOn(); //Will check switch message status
        formPage.pressFormSwitch(); //Will press on switch toggle
        formPage.checkFormSwitchOff(); //Will check switch status after pressing on it
        formPage.pressFormList(); // Will press on form dropdown list
        formPage.pressFormListOp2(); //Will press on second option in form dropdown list
        formPage.checkFormListOp2(); //Will check if second option is selected
        formPage.pressFormActiveBtn(); //Will press on active button
        formPage.checkFormActiveBtnMsg(); //Will check message after pressing on active button
        formPage.pressOkFormActiveMsg(); //Will press on message alert OK button
        swipePage.pressSwipeScreen(); //Will press on bottom swipe button
        swipePage.swipeRightTillSupportVideo(); //Will swipe horizontally till support videos element appears

    }
}
