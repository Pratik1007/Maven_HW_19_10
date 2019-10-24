package demo.com.phptravels.maven.project.pages;

import demo.com.phptravels.maven.project.utility.Util;
import org.openqa.selenium.By;

public class HomePage extends Util {


    By loginLink = By.className("button_to");


    /*method for click on login tab*/
    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }
}
