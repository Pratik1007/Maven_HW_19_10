package com.orangehrmlive.demo.opensource.maven.project.pages;

import com.orangehrmlive.demo.opensource.maven.project.utility.Util;
import org.openqa.selenium.By;

public class LoginPage extends Util {

    By userNameField = By.id("txtUsername");
    By passwordField = By.id("txtPassword");
    By loginBtn = By.id("btnLogin");
    By welcomeText = By.xpath("//h1[contains(text(),'Dashboard')]");

    /*method for sending username in usernamefiled */
public void enterUsername (String username){
    sendTextToElement(userNameField, username);
}
/*method for sending password in passwordfield*/
    public void enterPassword (String password){
        sendTextToElement(passwordField, password);
    }
    /*method for click on login tab*/
    public void clickOnLoginBtn(){
        clickOnElement(loginBtn);
    }

    /*method to get wecomtext*/
    public String welcomeText(){
        return getTextFromElement(welcomeText);
    }
}
