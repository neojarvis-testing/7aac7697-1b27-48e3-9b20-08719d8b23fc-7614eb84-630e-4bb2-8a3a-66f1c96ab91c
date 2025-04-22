package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.HomePageActions_Shambhavi01;
import pages.HomePageActions_Vinay01;
import pages.HomePageActions_Vinay02;
import pages.HomePageActions_tapaswini01;
import pages.HomePageActions_Shambhavi02;
import pages.HomePageActions_tapaswini02;
import pages.HomePageActions_arun01;
import pages.HomePageActions_arun02;
import utils.Base;
import utils.Reporter;
import pages.HomePageActions_Deekshitha01;
import pages.HomePageActions_Deekshitha02;

public class TestRunner extends Base {
    ExtentReports reports;
    ExtentTest test;

    @BeforeMethod
    public void launchRelianceJewels() {
        openBrowser();
        reports = Reporter.generateTestReport("Reliance_Report");
        test = reports.createTest("Reliance_TestFile");
    }
    @Test
    public void executeTestCase9() {
        HomePageActions_Shambhavi01 obj9 = new HomePageActions_Shambhavi01(test);
        obj9.testCase9();
    }
    @Test
    public void executeTestCase10() {
        HomePageActions_Shambhavi02 obj10 = new HomePageActions_Shambhavi02(test);
        obj10.testCase10();
    }
    @Test
    public void Test1() {
        HomePageActions_Deekshitha01 hp = new HomePageActions_Deekshitha01();
        hp.TestCase1();
    }
    @Test
    public void Test2() {
        HomePageActions_Deekshitha02 hp2 = new HomePageActions_Deekshitha02(test);
        hp2.TestCase2();
    }
    @Test
    public void testCase1() {
        HomePageActions_Vinay01 obj1 = new HomePageActions_Vinay01(test);
        obj1.test1();
    }
    @Test
    public void testCase2() {
        HomePageActions_Vinay02 obj1 = new HomePageActions_Vinay02(test);
        obj1.test2();
    }
    @Test
    public void vivahamTest() {
        HomePageActions_tapaswini01 vivahamPageActions = new HomePageActions_tapaswini01(driver,test);
        vivahamPageActions.vivaham();
    }

    @Test
    public void testCase1Arun() {
        HomePageActions_arun01 obj1 = new HomePageActions_arun01();
    @Test
    public void vivahamTest() {
        HomePageActions_tapaswini01 vivahamPageActions = new HomePageActions_tapaswini01(driver);
        // vivahamPageActions.verifyLogo();
        vivahamPageActions.hoverWhatsTrending();
        vivahamPageActions.clickVivaham();
        // vivahamPageActions.verifyUrlVivaham();
        vivahamPageActions.clickLocateAStore();
        vivahamPageActions.storeListPageVerify();
        vivahamPageActions.selectState();
        vivahamPageActions.selectCity();
        // vivahamPageActions.verifyStoreLocatorUrl();
        vivahamPageActions.clickSearch();
        vivahamPageActions.switchToMainWindow();
        vivahamPageActions.scrollToDelhiText();
        vivahamPageActions.clickDelhi();
        // vivahamPageActions.verifyDelhiPage();
        // vivahamPageActions.verifySortByText();
    }
    @Test
    public void testCase1Arun() {
        HomePageActions_arun01 obj1 = new HomePageActions_arun01();
        // vivahamPageActions.verifyDelhiPage();
        // vivahamPageActions.verifySortByText();
    }
    @Test
    public void executeTestCase1() {
        HomePageActions_arun01 obj1 = new HomePageActions_arun01(test);
        obj1.test1();
    }

    @Test
    public void testCase2Arun() {
        HomePageActions_arun02 obj2 = new HomePageActions_arun02();
    public void executeTestCase2() {
        HomePageActions_arun02 obj2 = new HomePageActions_arun02(test);
        obj2.test2();
    }
    @Test
    public void diamondEarrings(){
        HomePageActions_tapaswini02 diamondEarringsActions = new HomePageActions_tapaswini02(driver,test);
        diamondEarringsActions.earrings();
    }
    @AfterMethod
    public void closeRelianceJewels() {
        driver.quit();
        reports.flush();
    }
}
