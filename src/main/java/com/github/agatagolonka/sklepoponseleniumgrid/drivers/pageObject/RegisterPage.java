package com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject;

import com.github.agatagolonka.sklepoponseleniumgrid.drivers.PropertyManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
    @FindBy(xpath = "//input[@id=\"imie\"]")
    private static WebElement NAME;

    @FindBy(xpath = "//input[@id=\"nazwisko\"]")
    private static WebElement LAST_NAME;

    @FindBy(xpath = "//input[@data-pristine-type]")
    private static WebElement MAIL;

    @FindBy(xpath = "//input[@data-pristine-passwordstrength]")
    private static WebElement PASSWORD;

    @FindBy(xpath = "//input[@type=\"checkbox\"]")
    private static WebElement ACCEPT_STATUTE;

    @FindBy(xpath = "//*[@id=\"register-form\"]/button")
    private static WebElement REGISTER;


    public RegisterPage(WebDriver driver, PropertyManager propertyManager) {
        super(driver, propertyManager);
    }
}
