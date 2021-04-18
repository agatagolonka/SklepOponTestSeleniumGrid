package tests;

import com.github.agatagolonka.sklepoponseleniumgrid.drivers.pageObject.HomePage;
import org.testng.annotations.Test;

public class SklepOponTest extends BaseTest{

    @Test
    public void goToHomepageTest(){
        homePage.open();
    }
}
