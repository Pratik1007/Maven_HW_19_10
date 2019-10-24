package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ShoppingCartPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest extends TestBase {

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test

    public void userShouldNavigateToShoppingCartPage(){
        shoppingCartPage.clickOnShoppinCartLink();
        String expectedText = "Shopping cart";
        Assert.assertEquals(shoppingCartPage.varifyWelcomeText(), expectedText);
    }
}
