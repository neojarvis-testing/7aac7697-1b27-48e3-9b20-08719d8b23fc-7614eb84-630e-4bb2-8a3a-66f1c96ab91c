package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.HomePageActions_Shambhavi01;
import pages.HomePageActions_Vinay01;
import pages.HomePageActions_tapaswini01;
import pages.HomePageActions_arun01;
import pages.HomePageActions_arun02;
import utils.Base;
import utils.Reporter;
import pages.HomePageActions_Deekshitha01;

public class TestRunner extends Base {
    static ExtentTest test;
    static ExtentReports reports;
    @BeforeMethod
    public void launchRelianceJewels() {
        openBrowser();
        reports = Reporter.generateTestReport("Reliance_Report");
        test=reports.createTest("Reliance_TestFile");

    }
    @Test
    public void reliance() {
        HomePageActions_Shambhavi01 hp = new HomePageActions_Shambhavi01();
        hp.testcase1();
    }
    @Test
    public void Test1() {
        HomePageActions_Deekshitha01 hp = new HomePageActions_Deekshitha01();
        hp.TestCase1();
    }
    @Test
    public void testCase1() {
        HomePageActions_Vinay01 obj1 = new HomePageActions_Vinay01();
        obj1.test1();
    }
    @Test
    public void vivahamTest() {
        HomePageActions_tapaswini01 vivahamPageActions = new HomePageActions_tapaswini01(driver);
        vivahamPageActions.verifyLogo();
        vivahamPageActions.hoverWhatsTrending();
        vivahamPageActions.clickVivaham();
        vivahamPageActions.verifyUrlVivaham();
        vivahamPageActions.clickLocateAStore();
        vivahamPageActions.storeListPageVerify();
        vivahamPageActions.selectState();
        vivahamPageActions.selectCity();
        vivahamPageActions.verifyStoreLocatorUrl();
        vivahamPageActions.clickSearch();
        vivahamPageActions.switchToMainWindow();
        vivahamPageActions.scrollToDelhiText();
        vivahamPageActions.clickDelhi();
        // vivahamPageActions.verifyDelhiPage();
        // vivahamPageActions.verifySortByText();
    }
    @Test
    public void executeTestCase1() {
        HomePageActions_arun01 obj1 = new HomePageActions_arun01(test);
        obj1.test1();
    }
    @Test
    public void executeTestCase2() {
        HomePageActions_arun02 obj2 = new HomePageActions_arun02(test);
        obj2.test2();
    }
    @AfterMethod
    public void closeRelianceJewels() {
        driver.quit();
        reports.flush();
    }
}
