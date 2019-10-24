package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.ItemPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ItemTest extends TestBase {

ItemPage itemPage = new ItemPage();

@Test

public void userShouldNavigateToDesktopPageSuccessfully(){
    itemPage.clickOnBuildYourOwnComputer();

    String expectedText = "Build your own computer";
    Assert.assertEquals(itemPage.itemWelcomeText(), expectedText);

    itemPage.clickOnhddOption();
    itemPage.clickOnAddToCartBtn();

    String addToCartText = "The product has been added to your shopping cart";
    Assert.assertEquals(itemPage.itemNotification(), addToCartText);
}
}
