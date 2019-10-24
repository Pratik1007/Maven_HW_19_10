package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;

/**
 * Crated By Pratik
 */
public class ShoppingCartPage extends Util {

    By shoppingCartLink = By.xpath("//span[@class='cart-label']");
    By welcomTextshoppingcart = By.xpath("//h1[contains(text(),'Shopping cart')]");

    public void clickOnShoppinCartLink() {
        clickOnElement(shoppingCartLink);
        // clickOnElement(shoppingCartLink);
    }

    public String varifyWelcomeText() {
        return getTextFromElement(welcomTextshoppingcart);
    }
}
