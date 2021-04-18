package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import static com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject.HomePage.SEARCH;

public class AddToCartTest extends BaseTest{

    @FindBy(xpath = "//div[@class=\"recommended-product-list border border-yellow-base w-full flex flex-col xl:flex-row pt-6 xl:px-11 bg-white sm:rounded mb-4 shadow-productlist\"][1]/div[2]/div/div[2]/button\n")
    private static WebElement TESTED_ITEM;

    @Test
    public void addItemtoCart() throws Exception {

        homePage.open()
                .click(SEARCH);
        homePage.click(TESTED_ITEM);
        cartPage.open();

    }
}
