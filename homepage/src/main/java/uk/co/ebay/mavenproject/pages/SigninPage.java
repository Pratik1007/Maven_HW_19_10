package uk.co.ebay.mavenproject.pages;

import org.openqa.selenium.By;
import uk.co.ebay.mavenproject.utility.Util;

public class SigninPage extends Util {

    By signInLink = By.xpath("//a[contains(text(),'Sign in')]");
    By hiText = By.xpath("//span[@id='GREET-HELLO']");

    public void clickOnSignInLink() {
        clickOnElement(signInLink);
    }

    public String  welcomeText() {
        return getTextFromElement(hiText);
    }
}
