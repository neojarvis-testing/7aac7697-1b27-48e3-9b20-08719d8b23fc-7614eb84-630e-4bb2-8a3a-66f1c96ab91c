package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePageActions_Vinay01;
import utils.Base;

public class TestRunner extends Base {
    @BeforeMethod
    public void launchRelianceJewels() {
        openBrowser();
    }

    @Test
    public void testCase1() {
        HomePageActions_Vinay01 obj1 = new HomePageActions_Vinay01();
        obj1.test1();
    }

    @AfterMethod
    public void closeRelianceJewels() {
        driver.quit();
    }
}