package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;

/**
 * Crated By Pratik
 */
public class ItemPage extends Util {

    By buildYourOwnComputer = By.xpath("//div[@class='product-grid home-page-product-grid']//div[1]//div[1]//div[1]//a[1]//img[1]");
    By itemWelcomeText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By hddOption = By.xpath("//input[@id='product_attribute_3_7']");
    By addToCartBtn = By.xpath("//input[@id='add-to-cart-button-1']");
    By addtoCartNotification = By.xpath("//div[@class='bar-notification success']");

    public void clickOnBuildYourOwnComputer(){
        clickOnElement(buildYourOwnComputer);
    }

    public String itemWelcomeText(){
        return getTextFromElement(itemWelcomeText);
    }

    public void clickOnhddOption(){
        clickOnElement(hddOption);
    }

    public void clickOnAddToCartBtn(){
        clickOnElement(addToCartBtn);
    }

    public String itemNotification(){
        return getTextFromElement(addtoCartNotification);
    }

}

