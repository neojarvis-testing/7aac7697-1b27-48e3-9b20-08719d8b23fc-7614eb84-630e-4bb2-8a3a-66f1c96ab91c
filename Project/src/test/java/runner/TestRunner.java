package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePageActions_tapaswini01;
import utils.Base;

public class TestRunner extends Base {
    @BeforeMethod
    public void launchRelianceJewels() {
        openBrowser();
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
        vivahamPageActions.verifyDelhiPage();
        vivahamPageActions.verifySortByText();
    }

    @AfterMethod
    public void closeRelianceJewels() {
        driver.quit();
    }
}
