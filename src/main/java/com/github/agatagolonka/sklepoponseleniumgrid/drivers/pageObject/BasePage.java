package com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    protected void openWebPage(String url) {
        driver.navigate().to(url);
    }
}
