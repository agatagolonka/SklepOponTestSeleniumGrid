package com.github.agatagolonka.sklepoponseleniumgrid.drivers.drivers.stepdefinitions;

import com.github.agatagolonka.sklepoponseleniumgrid.drivers.drivers.DriverManager;
import com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject.HomePage;
import io.cucumber.core.logging.Logger;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseStep {

    protected WebDriver driver;

    protected HomePage homePage = null;
    protected DriverManager driverManager = null;


   // @Parameters("browserName")
    @Before
    public void setup()
        //(@Optional("Chrome") String browserName, ITestContext context) {
    { driverManager = new DriverManager();
        driver = driverManager.getDriver("Chrome");

        homePage.open();
    }
    @After
    public void cleanUp(){
        driver.quit();
    }
}
