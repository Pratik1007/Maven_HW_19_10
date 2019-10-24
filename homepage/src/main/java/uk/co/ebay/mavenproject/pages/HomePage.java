package uk.co.ebay.mavenproject.pages;

import org.openqa.selenium.By;
import uk.co.ebay.mavenproject.utility.Util;

public class HomePage extends Util {
    By homepageLogo = By.id("gh-logo");

    public void verifyLogoIsDisplayed(){
        verifyThatElementIsDisplayed(homepageLogo);
    }
}
