package tests;

import com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject.HomePage.LOGIN;
import static com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject.HomePage.LOGIN_PROFILE;

public class SignInTest extends BaseTest{

    private static final String USER_MAIL = "annanowaktestuser@gmail.com";
    private static final String USER_PASSWD = "Anna90opl;";
    private static final String TEST_USER= "//*[@id=\"account\"]/div/div/div[1]/div/p[3]/strong";





    @Test
    public void addItemtoCart() throws Exception {

        homePage.open()
        .click(LOGIN_PROFILE);
        homePage.click(LOGIN);
        signInPage.enterUsername(USER_MAIL);
        signInPage.enterPassword(USER_PASSWD);
        signInPage.clickLogin();
        Assert.assertTrue(driver.get().findElement(By.xpath(TEST_USER)).isDisplayed());

    }
}
