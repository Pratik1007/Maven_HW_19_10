package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;

/**
 * Crated By Pratik
 */
public class ComputerPage extends Util {

    By computersLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')] ");
    By welcomeTextOfComputers = By.xpath("//h1[contains(text(),'Computers')]");
    By deskTopsLink = By.xpath("//h2[@class='title']//a[contains(text(),'Desktops')]");
    By noteBooksLink = By.xpath("//h2[@class='title']//a[contains(text(),'Notebooks')]");
    By softwareLink = By.xpath("//h2[@class='title']//a[contains(text(),'Software')]");


    public void clickOnComputersLink(){
        clickOnElement(computersLink);
    }

    public void clickOnDesktopsLink(){
        clickOnElement(deskTopsLink);
    }

    public void clickOnNotebooksLink(){
        clickOnElement(noteBooksLink);
    }

    public void clickOnSoftwareLink(){
        clickOnElement(softwareLink);
    }

    public String welcomeText(){
        return getTextFromElement(welcomeTextOfComputers);
    }
}