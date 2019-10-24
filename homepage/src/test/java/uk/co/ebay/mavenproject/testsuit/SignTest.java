package uk.co.ebay.mavenproject.testsuit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.ebay.mavenproject.loadproperty.LoadProperty;
import uk.co.ebay.mavenproject.pages.HomePage;
import uk.co.ebay.mavenproject.pages.SigninPage;
import uk.co.ebay.mavenproject.testbase.TestBase;
import uk.co.ebay.mavenproject.utility.Util;

public class SignTest extends TestBase {

    SigninPage signinPage = new SigninPage();

    @Test
    public void userShouldNavigateToSigninPageSuccessfully() {
        signinPage.clickOnSignInLink();
    }
//        String expectedText = "Hi";
//        Assert.assertEquals(signinPage.welcomeText(), expectedText);
//    }

}

