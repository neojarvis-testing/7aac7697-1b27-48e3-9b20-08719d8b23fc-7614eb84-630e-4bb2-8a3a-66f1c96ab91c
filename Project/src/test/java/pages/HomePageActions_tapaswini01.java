package pages;

import org.openqa.selenium.WebDriver;

import uistore.HomePageLocators_tapaswini01;
import utils.Assertion;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomePageActions_tapaswini01 {
    WebDriverHelper webDriverHelper;
    Assertion assertion;
    WebDriver driver;

    public HomePageActions_tapaswini01(WebDriver driver) {
        webDriverHelper = new WebDriverHelper(driver);
        assertion = new Assertion(driver);
        this.driver = driver;
    }

    HomePageLocators_tapaswini01 homePageLocatorsVivaham = new HomePageLocators_tapaswini01();

    public void verifyLogo() {
        try {
            assertion.verifyLogo(homePageLocatorsVivaham.relianceJewelsLogo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hoverWhatsTrending() {
        try {
            webDriverHelper.hoverOverElement(homePageLocatorsVivaham.whatsTrendingtext);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickVivaham() {
        try {
            webDriverHelper.clickOnElement(homePageLocatorsVivaham.vivaham);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyUrlVivaham() {
        try {
            assertion.verifyUrl("VIVAHAM");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickLocateAStore() {
        try {
            webDriverHelper.clickAndswitchForward(homePageLocatorsVivaham.locateAStore);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void storeListPageVerify() {
        try {
            // Thread.sleep(3000);
            assertion.verifyTitle("Reliance jewels store locator");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectState() {
        try {
            webDriverHelper.selectDropDown(homePageLocatorsVivaham.stateDropdown, "Andhra Pradesh");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCity() {
        try {
            webDriverHelper.selectDropDown(homePageLocatorsVivaham.cityDropdown, "Guntur");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyStoreLocatorUrl() {
        try {
            assertion.verifyUrl("storelocator");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickSearch() {
        try {
            webDriverHelper.clickOnElement(homePageLocatorsVivaham.searchButton);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void switchToMainWindow() {
        try {
            driver.close();
            webDriverHelper.switchBackward(0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void scrollToDelhiText() {
        try {
            webDriverHelper.scrollByElement(homePageLocatorsVivaham.delhiText);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void clickDelhi() {
        try {
            // Thread.sleep(3000);
            webDriverHelper.waitForTheElementToBeVisible(homePageLocatorsVivaham.delhiText, 10);
            webDriverHelper.clickAndswitchForward(homePageLocatorsVivaham.delhiText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyDelhiPage() {
        try {
            assertion.verifyTitle("delhi");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void verifySortByText() {
        try {
            assertion.verifyText(homePageLocatorsVivaham.sortBy, "Sort by");
            LoggerHandler.info("Sort By text verified");
            Screenshot.takeScreenshotWithTimestamp("SortBy");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
