package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;

/**
 * Crated By Pratik
 */

public class LoginPage extends Util {
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginBtn = By.xpath("//input[@class='button-1 login-button']");
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    /*method for sending email to emailfield*/

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    /*method for sending password to password field*/

    public void password(String password) {
        sendTextToElement(passwordField, password);
    }

    /*method for click login button*/

    public void clickOnLoginButton() {
        clickOnElement(loginBtn);
    }

    /*method to get welcome text*/

    public String welcomeText() {
        return getTextFromElement(welcomeText);
    }
}