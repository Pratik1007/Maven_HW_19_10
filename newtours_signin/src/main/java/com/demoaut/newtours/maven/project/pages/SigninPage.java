package com.demoaut.newtours.maven.project.pages;

import com.demoaut.newtours.maven.project.utility.Util;
import org.openqa.selenium.By;

public class SigninPage extends Util {

    By signInLink = By.xpath("//a[contains(text(),'SIGN-ON')]");
    By welcomeText = By.xpath("//b[contains(text(),'Welcome back to')]");

    public void clickOnSignInLink() {

        clickOnElement(signInLink);
    }

    public String welcomeText() {

        return getTextFromElement(welcomeText);
    }
}
