package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject.HomePage.LOGIN_PROFILE;
import static com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject.HomePage.SEARCH;


public class SearchTest extends BaseTest {

    private static final String RESULT_PAGE="https://www.sklepopon.com/opony/letnie/205/55/r16";

    @Test
    public void searchTest() throws Exception {

        homePage.open()
                .click(SEARCH);
        String url = driver.get().getCurrentUrl();
        Assert.assertEquals(url,RESULT_PAGE);
    }
}
