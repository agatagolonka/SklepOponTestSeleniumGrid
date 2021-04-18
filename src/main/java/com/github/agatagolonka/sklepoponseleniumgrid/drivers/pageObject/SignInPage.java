package com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{
    @FindBy(xpath = "//input[@data-pristine-type]")
    private static WebElement MAIL;

    @FindBy(xpath = "//input[@id=\"haslo\"]")
    private static WebElement PASSWORD;

    @FindBy(xpath = "//*[@id=\"login-form\"]/button")
    private static WebElement SIGN_IN;

    public SignInPage(WebDriver driver) {
        super(driver);
    }
}
