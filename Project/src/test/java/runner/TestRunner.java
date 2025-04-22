package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePageActions_arun01;
import pages.HomePageActions_arun02;
import utils.Base;

public class TestRunner extends Base {
    @BeforeMethod
    public void launchRelianceJewels() {
        openBrowser();
    }

    @Test
    public void testCase1() {
        HomePageActions_arun01 obj1 = new HomePageActions_arun01();
        obj1.test1();
    }

    @Test
    public void testCase2() {
        HomePageActions_arun02 obj2 = new HomePageActions_arun02();
        obj2.test2();
    }

    @AfterMethod
    public void closeRelianceJewels() {
        driver.quit();
    }
}
