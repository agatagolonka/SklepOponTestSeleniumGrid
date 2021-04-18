package tests;

import com.github.agatagolonka.sklepoponseleniumgrid.drivers.drivers.DriverManager;
import com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject.HomePage;
import com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject.ProductPage;
import com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject.SearchResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.time.Duration;


public class BaseTest {
    protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    protected DriverManager driverManager;

    protected HomePage homePage;
    protected ProductPage productPage;

    @Parameters("browserName")
    @BeforeClass
    public void preparation(@Optional("Chrome") String browserName){
        driverManager = new DriverManager();
        driver.set(driverManager.getDriver(browserName, "Grid"));
        ITestContext context = Reporter.getCurrentTestResult().getTestContext();
        context.setAttribute("WebDriver", driver.get());

        homePage = new HomePage(driver.get());
        SearchResultPage searchResultsPage = new SearchResultPage(driver.get());
        ProductPage productPage = new ProductPage(driver.get());
    }

    @AfterMethod
    public void browserReset(){
        driver.get()
                .manage()
                .deleteAllCookies();
    }

    @AfterClass
    public void cleanUp(){
        driver.get()
                .quit();
        driver.remove();
    }

    WebElement waitPresent(String xPath, long seconds) {
        return new WebDriverWait(driver.get(), Duration.ofSeconds(seconds))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
    }

    WebElement waitClickable(String xPath, long seconds) {
        return new WebDriverWait(driver.get(), Duration.ofSeconds(seconds))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(xPath)));
    }
}
