package com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject;

import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    public static final String CART_PAGE = "https://www.sklepopon.com/koszyk";

    public CartPage(WebDriver driver) {
        super(driver);
    }
}
