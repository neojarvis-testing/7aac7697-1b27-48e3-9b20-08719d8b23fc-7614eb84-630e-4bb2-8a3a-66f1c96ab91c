package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Base;
import pages.HomePageActions_Deekshitha01;

public class TestRunner extends Base {

    @BeforeMethod
    public void launchRelianceJewels() {
        openBrowser();
    }

    @Test
    public void Test1() {
        HomePageActions_Deekshitha01 hp = new HomePageActions_Deekshitha01();
        hp.TestCase1();
    }

    @AfterMethod
    public void closeRelianceJewels() {
        driver.quit();
    }
}
