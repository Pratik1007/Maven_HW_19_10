package com.nopcommerce.demo.testsuite;
import com.nopcommerce.demo.loadproperty.LoadProperty;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Crated By Paratik
 */

public class LoginTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    LoadProperty loadProperty = new LoadProperty();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        Assert.assertEquals(loginPage.welcomeText(), expectedText);
    }

    @Test
    public void userShouldLoginSuccessfully(){
        loginPage.enterEmail(loadProperty.getProperty("email"));
        loginPage.password(loadProperty.getProperty("password"));
        loginPage.clickOnLoginButton();
    }

}
