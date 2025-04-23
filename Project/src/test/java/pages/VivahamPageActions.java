package pages;

import java.time.Duration;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.VivahamPageLocators;
import utils.Assertion;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class VivahamPageActions {
    WebDriverHelper webDriverHelper;
    Assertion assertion;
    WebDriver driver;
    ExtentTest test;

    public VivahamPageActions(WebDriver driver, ExtentTest test) {
        webDriverHelper = new WebDriverHelper(driver);
        assertion = new Assertion(driver);
        this.driver = driver;
        this.test = test;
    }

    VivahamPageLocators homePageLocatorsVivaham = new VivahamPageLocators();

    public void verifyLogo() {
        try {
            assertion.verifyLogo(homePageLocatorsVivaham.relianceJewelsLogo);
            LoggerHandler.info("Reliance Jewels logo verified");
            test.info("clicked on search field");
            test.log(Status.PASS, "clicked on search field");
        } catch (Exception e) {
            LoggerHandler.error("Reliance Jewels logo verification failed");
            test.fail("clicked on search field");
            test.log(Status.FAIL, "clicked on search");
        }
    }

    public void hoverWhatsTrending() {
        try {
            webDriverHelper.hoverOverElement(homePageLocatorsVivaham.whatsTrendingtext);
            LoggerHandler.info("Hovered on What's trending");
            test.info("clicked on search field");
            test.log(Status.PASS, "clicked on search field");
        } catch (Exception e) {
            LoggerHandler.error("Failed to hover on What's trending");
            test.fail("clicked on search field");
            test.log(Status.FAIL, "clicked on search");
        }
    }

    public void clickVivaham() {
        try {
            webDriverHelper.clickOnElement(homePageLocatorsVivaham.vivaham);
            LoggerHandler.info("Clicked on Vivaham");
            test.info("clicked on search field");
            test.log(Status.PASS, "clicked on search field");
        } catch (Exception e) {
            e.printStackTrace();
            LoggerHandler.error("Failed to click on vivaham");
            test.fail("clicked on search field");
            test.log(Status.FAIL, "clicked on search");
        }
    }

    public void verifyUrlVivaham() {
        try {
            assertion.verifyUrl("VIVAHAM");
            LoggerHandler.info("Vivaham url verified");
            test.info("clicked on search field");
            test.log(Status.PASS, "clicked on search field");
        } catch (Exception e) {
            LoggerHandler.error("Vivaham url verification failed");
            test.fail("clicked on search field");
            test.log(Status.FAIL, "clicked on search");
        }
    }

    public void clickLocateAStore() {
        try {
            webDriverHelper.clickAndswitchForward(homePageLocatorsVivaham.locateAStore);
            LoggerHandler.info("Clicked on locate a store and switched window");
            test.info("clicked on search field");
            test.log(Status.PASS, "clicked on search field");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on a store and failed to switch window");
            test.fail("clicked on search field");
            test.log(Status.FAIL, "clicked on search");
        }
    }

    public void storeListPageVerify() {
        try {
            // Thread.sleep(3000);
            assertion.verifyTitle("Reliance jewels store locator");
            LoggerHandler.info("Reliance jewels store locator title verified");
            test.info("clicked on search field");
            test.log(Status.PASS, "clicked on search field");
        } catch (Exception e) {
            LoggerHandler.error("Reliance jewels store locator title verified");
            test.fail("clicked on search field");
            test.log(Status.FAIL, "clicked on search");
        }
    }

    public void selectState() {
        try {
            webDriverHelper.selectDropDown(homePageLocatorsVivaham.stateDropdown, "Andhra Pradesh");
            LoggerHandler.info("Selected Andhra pradhesh");
            test.info("clicked on search field");
            test.log(Status.PASS, "clicked on search field");
        } catch (Exception e) {
            LoggerHandler.error("Failed to select Andhra pradesh");
            test.fail("clicked on search field");
            test.log(Status.FAIL, "clicked on search");
        }
    }

    public void selectCity() {
        try {
            webDriverHelper.selectDropDown(homePageLocatorsVivaham.cityDropdown, "Guntur");
            LoggerHandler.info("Selected Guntur");
            test.info("clicked on search field");
            test.log(Status.PASS, "clicked on search field");
        } catch (Exception e) {
            LoggerHandler.error("Failed to select Guntur");
            test.fail("clicked on search field");
            test.log(Status.FAIL, "clicked on search");
        }
    }

    public void verifyStoreLocatorUrl() {
        try {
            assertion.verifyUrl("storelocator");
            LoggerHandler.info("Verified store locator url");
            test.info("clicked on search field");
            test.log(Status.PASS, "clicked on search field");
        } catch (Exception e) {
            LoggerHandler.error(("Failed to verify store locator url"));
            test.fail("clicked on search field");
            test.log(Status.FAIL, "clicked on search");
        }
    }

    public void clickSearch() {
        try {
            LoggerHandler.info("Clicked on search");
            webDriverHelper.clickOnElement(homePageLocatorsVivaham.searchButton);
            test.info("clicked on search field");
            test.log(Status.PASS, "clicked on search field");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on search");
            test.fail("clicked on search field");
            test.log(Status.FAIL, "clicked on search");
        }

    }

    public void switchToMainWindow() {
        try {
            driver.close();
            webDriverHelper.switchBackward(0);
            LoggerHandler.info("Switched to main window");
            test.info("clicked on search field");
            test.log(Status.PASS, "clicked on search field");
        } catch (Exception e) {
            LoggerHandler.error("Failed to switch to main window");
            test.fail("clicked on search field");
            test.log(Status.FAIL, "clicked on search");
        }

    }

    public void scrollToDelhiText() {
        try {
            webDriverHelper.scrollByElement(homePageLocatorsVivaham.delhiText);
            Thread.sleep(3000);
            LoggerHandler.info("Scrolled to Delhi text");
            test.info("clicked on search field");
            test.log(Status.PASS, "clicked on search field");
        } catch (Exception e) {
            LoggerHandler.error("Failed to scroll to Delhi text");
            test.fail("clicked on search field");
            test.log(Status.FAIL, "clicked on search");
        }

    }

    public void clickDelhi() {
        try {
            // Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            webDriverHelper.waitForTheElementToBeVisible(homePageLocatorsVivaham.delhiText, 10);
            webDriverHelper.clickAndswitchForward(homePageLocatorsVivaham.delhiText);
            Thread.sleep(3000);
            LoggerHandler.info("Clicked on delhi");
            test.info("clicked on search field");
            test.log(Status.PASS, "clicked on search field");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on delhi");
            test.fail("clicked on search field");
            test.log(Status.FAIL, "clicked on search");
        }
    }

    public void verifyDelhiPage() {
        try {
            assertion.verifyTitle("delhi");
            LoggerHandler.info("Verified delhi page title");
            test.info("clicked on search field");
            test.log(Status.PASS, "clicked on search field");
        } catch (Exception e) {
            LoggerHandler.error("Failed to verify page title");
        }

    }

    public void verifySortByText() {
        try {
            assertion.verifyText(homePageLocatorsVivaham.sortBy, "Sort by");
            LoggerHandler.info("Sort By text verified");
            Screenshot.takeScreenshotWithTimestamp("SortBy");
            LoggerHandler.info("Verified Sort by text");
            test.info("clicked on search field");
            test.log(Status.PASS, "clicked on search field");
        } catch (Exception e) {
            LoggerHandler.error("Failed to veriify Sort by text");
            test.fail("clicked on search field");
            test.log(Status.FAIL, "clicked on search");
        }

    }

    public void test3() {
        verifyLogo();
        hoverWhatsTrending();
        clickVivaham();
        verifyUrlVivaham();
        clickLocateAStore();
        storeListPageVerify();
        selectState();
        selectCity();
        verifyStoreLocatorUrl();
        clickSearch();
        switchToMainWindow();
        scrollToDelhiText();
        clickDelhi();
        verifyDelhiPage();
        verifySortByText();

    }
}