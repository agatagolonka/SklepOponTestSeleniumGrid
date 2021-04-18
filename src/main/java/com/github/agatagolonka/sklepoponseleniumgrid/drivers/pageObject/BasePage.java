package com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject;

import com.github.agatagolonka.sklepoponseleniumgrid.drivers.PropertyManager;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver, PropertyManager propertyManager){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    protected void openWebPage(String url) {
        driver.navigate().to(url);
    }

    public void click(WebElement element) {
        Actions actions = new Actions(driver);
        actions.click(element).perform();
    }

    protected void enterText(WebElement element, String text) {
        Actions actions = new Actions(driver);
        actions.sendKeys(element, text).perform();
    }

}
