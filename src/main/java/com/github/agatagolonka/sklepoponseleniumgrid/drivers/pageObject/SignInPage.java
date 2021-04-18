package com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject;

import com.github.agatagolonka.sklepoponseleniumgrid.drivers.PropertyManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends HomePage{
    protected SignInPage signInPage;
    @FindBy(xpath = "//input[@data-pristine-type]")
    private static WebElement MAIL;

    @FindBy(xpath = "//input[@id=\"haslo\"]")
    private static WebElement PASSWORD;

    @FindBy(xpath = "//*[@id=\"login-form\"]/button")
    private static WebElement SIGN_IN;

    @FindBy(xpath = "//*[@id=\"account\"]/div/div/div[1]/div/p[3]/strong")
    private static WebElement CHECK_MAIL;

    public SignInPage(WebDriver driver, PropertyManager propertyManager) {
        super(driver, propertyManager);
    }

    public void enterUsername(String userMail) {
        MAIL.sendKeys(userMail);
    }

    public void enterPassword(String password) {
        PASSWORD.sendKeys(password);
    }

    public void clickLogin() throws Exception {
        SIGN_IN.click();
    }
    @Step("Open home page")
    public SignInPage open() {
        openWebPage(SKLEPOPON_HOMEPAGE);
        return this;
    }



}
