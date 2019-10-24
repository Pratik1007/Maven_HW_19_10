package demo.com.phptravels.maven.project.testsuit;

import demo.com.phptravels.maven.project.pages.RegisterPage;
import demo.com.phptravels.maven.project.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        registerPage.clickOnRegisterLink();
        String expectedText = "Register Create an account with us . . .";
        Assert.assertEquals(registerPage.WelcomeText(), expectedText);
    }
}