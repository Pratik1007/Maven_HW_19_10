package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.loadproperty.LoadProperty;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {

    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();
    LoadProperty loadProperty = new LoadProperty();

    @Test

    public void userShouldNavigateToRegistePagerSuccessfully(){
        homePage.clickOnRegisterLink();
        String expectedText = "Register";
        Assert.assertEquals(registerPage.registerText(), expectedText);
        registerPage.clickOnGender();
        registerPage.enterFirstName(loadProperty.getProperty("firstname"));
        registerPage.enterLastName(loadProperty.getProperty("lastname"));
        registerPage.enterDayOfBirth(loadProperty.getProperty("dob-day"));
        registerPage.enterMonthOfBirth(loadProperty.getProperty("dob-month"));
        registerPage.enterYearOfBirth(loadProperty.getProperty("dob-year"));
        registerPage.enterEmail(loadProperty.getProperty("email"));
        registerPage.enterCompanyName(loadProperty.getProperty("companyname"));
        registerPage.enterPassword(loadProperty.getProperty("password"));
        registerPage.enterPasswordInConfirmPassword(loadProperty.getProperty("confirmPassword"));
        registerPage.clickOnRegisterBtn();

        String registrationConfirm = "Your registration completed";
        Assert.assertEquals(registerPage.welcomeText(),registrationConfirm);
    }

}
