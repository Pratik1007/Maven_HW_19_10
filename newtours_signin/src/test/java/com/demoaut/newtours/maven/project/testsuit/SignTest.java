package com.demoaut.newtours.maven.project.testsuit;

import com.demoaut.newtours.maven.project.loadproperty.LoadProperty;
import com.demoaut.newtours.maven.project.pages.SigninPage;
import com.demoaut.newtours.maven.project.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignTest extends TestBase {

    SigninPage signinPage = new SigninPage();
    LoadProperty loadProperty = new LoadProperty();

    @Test
    public void userShouldNavigateToSigninPageSuccessfully() {

        signinPage.clickOnSignInLink();

        String expectedText = "Welcome back to Mercury Tours!";

    Assert.assertEquals(signinPage.welcomeText(), expectedText);

    }

}

