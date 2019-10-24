package com.orangehrmlive.demo.opensource.maven.project.testsuit;

import com.orangehrmlive.demo.opensource.maven.project.loadproperty.LoadProperty;
import com.orangehrmlive.demo.opensource.maven.project.pages.LoginPage;
import com.orangehrmlive.demo.opensource.maven.project.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPage loginPage = new LoginPage();
    LoadProperty loadProperty = new LoadProperty();

    @Test
    public void userShouldLoginSuccessfully(){
        loginPage.enterUsername(loadProperty.getProperty("username"));
        loginPage.enterPassword(loadProperty.getProperty("password"));
        loginPage.clickOnLoginBtn();
        String expectedText = "Dashboard";
        Assert.assertEquals(loginPage.welcomeText(), expectedText);
    }
}
