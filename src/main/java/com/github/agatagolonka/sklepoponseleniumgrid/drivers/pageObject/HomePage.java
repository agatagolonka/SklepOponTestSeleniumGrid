package com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public static final String SKLEPOPON_HOMEPAGE = "https:\\sklepopon.com";

    @FindBy(xpath = "//*[@id=\"basketWidget\"]")
    private static WebElement CART;

    @FindBy(xpath = "//select[@class=\"w-full rounded-r-none font-bold pl-3 text-p14d\"]\n")
    private static WebElement WIDTH;

    @FindBy(xpath = "//button[@class=\"button-primary-general text-p5d no-underline font-semibold h-12 xl:h-18 mb-4 mt-3 xl:mt-0 xl:mb-0 w-full xl:w-68 p-0 loader-md\"]")
    private static WebElement PROFILE;

    @FindBy(xpath = "//select[@class=\"w-full border-r-0 border-l-0 rounded-none font-bold pl-3 text-p14d\"]")
    private static WebElement DIAMETER;

    @FindBy(xpath = "//select[@data-c-options=\"consecutive: 0;property: season;\"]")
    private static WebElement SEASON;

    @FindBy(xpath = "//div[@data-c-name][3]/a")
    private static WebElement LOGIN_PROFILE;

    @FindBy(xpath = "//a[@href=\"/zaloguj\"]")
    private static WebElement LOGIN;

    @FindBy(xpath = "//a[@href=\"/rejestracja\"]")
    private static WebElement REGISTER;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Open home page")
    public HomePage open() {
        openWebPage(SKLEPOPON_HOMEPAGE);
        System.out.println("cos");
        return this;
    }
}
