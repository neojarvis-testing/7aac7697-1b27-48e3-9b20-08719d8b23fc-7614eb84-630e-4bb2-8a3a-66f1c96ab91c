package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageActions_Vinay01;
import pages.HomePageActions_tapaswini01;
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
        HomePageActions_Vinay01 obj1 = new HomePageActions_Vinay01();
        obj1.test1();
    }
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
        vivahamPageActions.verifyDelhiPage();
        vivahamPageActions.verifySortByText();
    }
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
