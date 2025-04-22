package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePageActions_Shambhavi01;
import utils.Base;

public class TestRunner extends Base {
    @BeforeMethod
    public void launchRelianceJewels() {
        openBrowser();
    }

    @Test
    public void reliance() {
        HomePageActions_Shambhavi01 hp = new HomePageActions_Shambhavi01();
        hp.testcase1();
    }

    @AfterMethod
    public void closeRelianceJewels() {
        driver.quit();
    }
}
