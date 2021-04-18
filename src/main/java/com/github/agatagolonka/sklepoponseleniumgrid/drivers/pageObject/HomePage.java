package com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject;

import com.github.agatagolonka.sklepoponseleniumgrid.drivers.PropertyManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public static final String SKLEPOPON_HOMEPAGE = "https:\\sklepopon.com";

    @FindBy(xpath = "//*[@id=\"basketWidget\"]")
    public static WebElement CART;

    @FindBy(xpath = "//select[@class=\"w-full rounded-r-none font-bold pl-3 text-p14d\"]\n")
    public static WebElement WIDTH;

    @FindBy(xpath = "//button[@class=\"button-primary-general text-p5d no-underline font-semibold h-12 xl:h-18 mb-4 mt-3 xl:mt-0 xl:mb-0 w-full xl:w-68 p-0 loader-md\"]")
    public static WebElement PROFILE;

    @FindBy(xpath = "//select[@class=\"w-full border-r-0 border-l-0 rounded-none font-bold pl-3 text-p14d\"]")
    public static WebElement DIAMETER;

    @FindBy(xpath = "//select[@data-c-options=\"consecutive: 0;property: season;\"]")
    private static WebElement SEASON;

    @FindBy(xpath = "//button[@class=\"button-primary-general text-p5d no-underline font-semibold h-12 xl:h-18 mb-4 mt-3 xl:mt-0 xl:mb-0 w-full xl:w-68 p-0 loader-md\"]")
    public static WebElement SEARCH;

    @FindBy(xpath = "//div[@data-c-name][3]/a")
    public static WebElement LOGIN_PROFILE;

    @FindBy(xpath = "//a[@href=\"/zaloguj\"]")
    public static WebElement LOGIN;

    @FindBy(xpath = "//a[@href=\"/rejestracja\"]")
    public static WebElement REGISTER;


    public HomePage(WebDriver driver, PropertyManager propertyManager){
        super(driver, propertyManager);
    }


    @Step("Open home page")
    public HomePage open() {
        openWebPage(SKLEPOPON_HOMEPAGE);
        System.out.println("cos");
        return this;
    }


    protected void openWebPage(String url) {
        driver.navigate().to(url);
    }
}
