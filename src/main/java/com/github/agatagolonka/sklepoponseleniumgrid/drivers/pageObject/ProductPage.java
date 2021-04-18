package com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject;

import com.github.agatagolonka.sklepoponseleniumgrid.drivers.PropertyManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"main_add_to_basket\"]/svg")
    private static WebElement ADD_TO_CART;

    public ProductPage(WebDriver driver, PropertyManager propertyManager) {
        super(driver, propertyManager);
    }


}
