package demo.com.phptravels.maven.project.pages;

import demo.com.phptravels.maven.project.utility.Util;
import org.openqa.selenium.By;

public class RegisterPage extends Util {

    By registerLink = By.linkText("Register");
    By welcomeText = By.xpath("//h1[contains(text(),'Register')]");

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }

    public String WelcomeText(){
        return getTextFromElement(welcomeText);
    }
}
