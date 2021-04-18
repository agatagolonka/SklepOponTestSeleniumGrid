package com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject;

import com.github.agatagolonka.sklepoponseleniumgrid.drivers.PropertyManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    public static final String CART_PAGE = "https://www.sklepopon.com/koszyk";

    @FindBy(xpath = "//span[@class=\"text-p4m md:text-p4d font-bold\"]")
    private static WebElement ITEM;

    public CartPage(WebDriver driver, PropertyManager propertyManager) {
        super(driver, propertyManager);
    }

    @Step("Open cart page")
    public CartPage open() {
        openWebPage(CART_PAGE);
        return this;
    }
}
