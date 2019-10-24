package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;

/**
 * Crated By Pratik
 */
public class HomePage extends Util {

    By registerLink = By.linkText("Register");
    By loginLink = By.linkText("Log in");
    By currencyList = By.id("customerCurrency");
    By computersLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
    By electronicsLink = By.linkText("Electronics ");
    By apparelLink = By.linkText("Apparel ");
    By digitalDownloadsLink = By.linkText("Digital downloads ");
    By booksLink = By.linkText("Books ");
    By jewelryLink = By.linkText("Jewelry ");
    By giftCardsLink = By.linkText("Gift Cards ");
    By searchStoreField = By.id("small-searchterms");
    By searchLBtn = By.className("button-1 search-box-button");

    public void clickOnRegisterLink (){
        clickOnElement(registerLink);
    }

    public void clickOnLoginLink (){
        clickOnElement(loginLink);
    }

    public void selectCurrency (){
        clickOnElement(currencyList);
        selectByVisibleTextFromDropDown(By.xpath("//option[contains(text(),'US Dollar')]"), "US Dollar");
    }

    public void clickOnComputersLink (){
        clickOnElement(computersLink);
    }

    public void clickOnelectronicsLink(){
        clickOnElement(electronicsLink);
    }

    public void clickOnApparelLink(){
        clickOnElement(apparelLink);
    }

    public void clickOnDigitalDownloadsLink(){
        clickOnElement(digitalDownloadsLink);
    }

    public void clickOnBooksLink(){
        clickOnElement(booksLink);
    }

    public void clickOnJewelryLink(){
        clickOnElement(jewelryLink);
    }

    public void clickOnGiftCardsLink(){
        clickOnElement(giftCardsLink);
    }

    public void insertTxtInSearchField(){
        sendTextToElement(searchStoreField, "Laptops");
    }

    public void clickOnSearchBtn(){
        clickOnElement(searchLBtn);
    }

}
