package tests;

import com.github.agatagolonka.sklepoponseleniumgrid.drivers.PropertyManager;
import com.github.agatagolonka.sklepoponseleniumgrid.drivers.drivers.DriverManager;
import com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject.*;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public abstract class BaseTest {

    protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static final Logger assertLogger = LogManager.getLogger("Assert");

    protected DriverManager driverManager;
    protected PropertyManager propertyManager;

    protected HomePage homePage;
    protected RegisterPage registerPage;
    protected SignInPage signInPage;
    protected ProductPage productPage;
    protected CartPage cartPage;


    @Parameters({"browserName","testDataFileName"})
    @BeforeClass
    public void setup(@Optional("Chrome") String browserName
            , @Optional("default.properties") String testDataFileName){
        driverManager = new DriverManager();
        driver.set(driverManager.getDriver(browserName, "Grid"));
        ITestContext context = Reporter.getCurrentTestResult().getTestContext();
        context.setAttribute("WebDriver", driver.get());

        propertyManager = new PropertyManager(testDataFileName);
        homePage = new HomePage(driver.get(), propertyManager);
        signInPage = new SignInPage(driver.get(), propertyManager);
        registerPage = new RegisterPage(driver.get(), propertyManager);
        cartPage = new CartPage(driver.get(), propertyManager);
    }

    @AfterMethod
    public void browserReset(){
        driver.get().manage().deleteAllCookies();

    }

    @AfterClass
    public void cleanUp(){
        driver.get().quit();
        driver.remove();
    }

}
