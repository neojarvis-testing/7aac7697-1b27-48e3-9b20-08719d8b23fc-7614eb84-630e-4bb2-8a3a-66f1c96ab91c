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

    /*
     * Method Name: verifyLogo
     * Author Name: tapaswini
     * Description: This method validates logo.
     * Return Type: void
     * Parameter List: NA
     */

    public void verifyLogo() {
        try {
            assertion.verifyLogo(homePageLocatorsVivaham.relianceJewelsLogo);
            LoggerHandler.info("Reliance Jewels logo verified");
            test.info("Reliance Jewels logo verified");
            test.log(Status.PASS, "Reliance Jewels logo verified");
        } catch (Exception e) {
            LoggerHandler.error("Reliance Jewels logo verification failed");
            test.fail("Reliance Jewels logo verification failed");
            test.log(Status.FAIL, "Reliance Jewels logo verification failed");
        }
    }

    /*
     * Method Name: hoverWhatsTrending
     * Author Name: tapaswini
     * Description: This method hovers on whta's trending text
     * Return Type: void
     * Parameter List: NA
     */
    public void hoverWhatsTrending() {
        try {
            webDriverHelper.hoverOverElement(homePageLocatorsVivaham.whatsTrendingtext);
            LoggerHandler.info("Hovered on What's trending");
            test.info("Hovered on What's trending");
            test.log(Status.PASS, "Hovered on What's trending");
        } catch (Exception e) {
            LoggerHandler.error("Failed to hover on What's trending");
            test.fail("Failed to hover on What's trending");
            test.log(Status.FAIL, "Failed to hover on What's trending");
        }
    }

    /*
     * Method Name: clickVivaham
     * Author Name: tapaswini
     * Description: This method clciks on vivaham
     * Return Type: void
     * Parameter List: NA
     */
    public void clickVivaham() {
        try {
            webDriverHelper.clickOnElement(homePageLocatorsVivaham.vivaham);
            LoggerHandler.info("Clicked on Vivaham text");
            test.info("Clicked on Vivaham text");
            test.log(Status.PASS, "Clicked on Vivaham text");
        } catch (Exception e) {
            e.printStackTrace();
            LoggerHandler.error("Failed to click on vivaham");
            test.fail("Failed to click on vivaham");
            test.log(Status.FAIL, "Failed to click on vivaham");
        }
    }

    /*
     * Method Name: verifyUrlVivaham
     * Author Name: tapaswini
     * Description: This method verifies vivaham url
     * Return Type: void
     * Parameter List: NA
     */
    public void verifyUrlVivaham() {
        try {
            assertion.verifyUrl("VIVAHAM");
            LoggerHandler.info("Vivaham url verified");
            test.info("Vivaham url verified");
            test.log(Status.PASS, "Vivaham url verified");
        } catch (Exception e) {
            LoggerHandler.error("Vivaham url verification failed");
            test.fail("Vivaham url verification failed");
            test.log(Status.FAIL, "Vivaham url verification failed");
        }
    }

    /*
     * Method Name: clickLocateAStore
     * Author Name: tapaswini
     * Description: This method clicks locate a store button
     * Return Type: void
     * Parameter List: NA
     */
    public void clickLocateAStore() {
        try {
            webDriverHelper.clickAndswitchForward(homePageLocatorsVivaham.locateAStore);
            LoggerHandler.info("Clicked on locate a store and switched window");
            test.info("Clicked on locate a store and switched window");
            test.log(Status.PASS, "Clicked on locate a store and switched window");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on a store and failed to switch window");
            test.fail("Failed to click on a store and failed to switch window");
            test.log(Status.FAIL, "Failed to click on a store and failed to switch window");
        }
    }

    /*
     * Method Name: storeListPageVerify
     * Author Name: tapaswini
     * Description: This method verifies store list page
     * Return Type: void
     * Parameter List: NA
     */
    public void storeListPageVerify() {
        try {
            assertion.verifyTitle("Reliance jewels store locator");
            LoggerHandler.info("Reliance jewels store locator title verified");
            test.info("Reliance jewels store locator title verified");
            test.log(Status.PASS, "Reliance jewels store locato title verifiedr");
        } catch (Exception e) {
            LoggerHandler.error("Reliance jewels store locator title verification failed");
            test.fail("Reliance jewels store locator title verification failed");
            test.log(Status.FAIL, "Reliance jewels store locator title verification failed");
        }
    }

    /*
     * Method Name: selectState
     * Author Name: tapaswini
     * Description: This method selects state
     * Return Type: void
     * Parameter List: NA
     */
    public void selectState() {
        try {
            webDriverHelper.selectDropDown(homePageLocatorsVivaham.stateDropdown, "Andhra Pradesh");
            LoggerHandler.info("Selected Andhra pradhesh");
            test.info("Selected Andhra pradhesh");
            test.log(Status.PASS, "Selected Andhra pradhesh");
        } catch (Exception e) {
            LoggerHandler.error("Failed to select Andhra pradesh");
            test.fail("Failed to select Andhra pradesh");
            test.log(Status.FAIL, "Failed to select Andhra pradesh");
        }
    }

    /*
     * Method Name: selectCity
     * Author Name: tapaswini
     * Description: This method selects city
     * Return Type: void
     * Parameter List: NA
     */
    public void selectCity() {
        try {
            webDriverHelper.selectDropDown(homePageLocatorsVivaham.cityDropdown, "Guntur");
            LoggerHandler.info("Selected Guntur");
            test.info("Selected Guntur");
            test.log(Status.PASS, "Selected Guntur");
        } catch (Exception e) {
            LoggerHandler.error("Failed to select Guntur");
            test.fail("Failed to select Guntur");
            test.log(Status.FAIL, "Failed to select Guntur");
        }
    }

    /*
     * Method Name: verifyStoreLocatorUrl
     * Author Name: tapaswini
     * Description: This method verifies storelocator url
     * Return Type: void
     * Parameter List: NA
     */
    public void verifyStoreLocatorUrl() {
        try {
            assertion.verifyUrl("storelocator");
            LoggerHandler.info("Verified store locator url");
            test.info("Verified store locator url");
            test.log(Status.PASS, "Verified store locator url");
        } catch (Exception e) {
            LoggerHandler.error(("Failed to verify store locator url"));
            test.fail("Failed to verify store locator url");
            test.log(Status.FAIL, "Failed to verify store locator url");
        }
    }

    /*
     * Method Name: clickSearch
     * Author Name: tapaswini
     * Description: This method clicks on search icon
     * Return Type: void
     * Parameter List: NA
     */
    public void clickSearch() {
        try {
            LoggerHandler.info("Clicked on search");
            webDriverHelper.clickOnElement(homePageLocatorsVivaham.searchButton);
            test.info("Clicked on search");
            test.log(Status.PASS, "Clicked on search");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on search");
            test.fail("Failed to click on search");
            test.log(Status.FAIL, "Failed to click on search");
        }

    }

    /*
     * Method Name: switchToMainWindow
     * Author Name: tapaswini
     * Description: This method switches to main window
     * Return Type: void
     * Parameter List: NA
     */
    public void switchToMainWindow() {
        try {
            driver.close();
            webDriverHelper.switchBackward(0);
            LoggerHandler.info("Switched to main window");
            test.info("Switched to main window");
            test.log(Status.PASS, "Switched to main window");
        } catch (Exception e) {
            LoggerHandler.error("Failed to switch to main window");
            test.fail("Failed to switch to main window");
            test.log(Status.FAIL, "Failed to switch to main window");
        }

    }

    /*
     * Method Name: scrollToDelhiText
     * Author Name: tapaswini
     * Description: This method scrolls to delhi text
     * Return Type: void
     * Parameter List: NA
     */
    public void scrollToDelhiText() {
        try {
            webDriverHelper.scrollByElement(homePageLocatorsVivaham.delhiText);
            Thread.sleep(3000);
            LoggerHandler.info("Scrolled to Delhi text");
            test.info("Scrolled to Delhi text");
            test.log(Status.PASS, "Scrolled to Delhi text");
        } catch (Exception e) {
            LoggerHandler.error("Failed to scroll to Delhi text");
            test.fail("Failed to scroll to Delhi text");
            test.log(Status.FAIL, "Failed to scroll to Delhi text");
        }

    }

    /*
     * Method Name: clickDelhi
     * Author Name: tapaswini
     * Description: This method clicks on delhi
     * Return Type: void
     * Parameter List: NA
     */
    public void clickDelhi() {
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            webDriverHelper.waitForTheElementToBeVisible(homePageLocatorsVivaham.delhiText, 10);
            webDriverHelper.clickAndswitchForward(homePageLocatorsVivaham.delhiText);
            Thread.sleep(3000);
            LoggerHandler.info("Clicked on delhi");
            test.info("Clicked on delhi");
            test.log(Status.PASS, "Clicked on delhi");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on delhi");
            test.fail("Failed to click on delhi");
            test.log(Status.FAIL, "Failed to click on delhi");
        }
    }

    /*
     * Method Name: verifyDelhiPage
     * Author Name: tapaswini
     * Description: This method verifies delhi page title
     * Return Type: void
     * Parameter List: NA
     */
    public void verifyDelhiPage() {
        try {
            assertion.verifyTitle("delhi");
            LoggerHandler.info("Verified delhi page title");
            test.info("Verified delhi page title");
            test.log(Status.PASS, "Verified delhi page title");
        } catch (Exception e) {
            LoggerHandler.error("Failed to verify delhi page title");
            test.fail("Failed to verify delhi page title");
            test.log(Status.FAIL, "Failed to verify delhi page title");
        }

    }

    /*
     * Method Name: verifySortByText
     * Author Name: tapaswini
     * Description: This method verifies "Sort by" text
     * Return Type: void
     * Parameter List: NA
     */
    public void verifySortByText() {
        try {
            assertion.verifyText(homePageLocatorsVivaham.sortBy, "Sort by");
            LoggerHandler.info("Sort By text verified");
            Screenshot.takeScreenshotWithTimestamp("SortBy");
            test.info("Sort By text verified");
            test.log(Status.PASS, "Sort By text verified");
        } catch (Exception e) {
            LoggerHandler.error("Failed to veriify Sort by text");
            test.fail("Failed to veriify Sort by text");
            test.log(Status.FAIL, "Failed to veriify Sort by text");
        }

    }/*
      * Method Name: vivaham
      * Author Name: tapaswini
      * Description: This method calls all the other methods
      * Return Type: void
      * Parameter List: NA
      */

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