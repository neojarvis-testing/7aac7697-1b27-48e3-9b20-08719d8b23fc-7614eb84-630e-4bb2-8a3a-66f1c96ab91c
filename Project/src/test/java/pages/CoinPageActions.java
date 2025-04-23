package pages;

import com.aventstack.extentreports.ExtentTest;

import uistore.CoinPageLocators;
import utils.Assertion;
import utils.Base;
import utils.Screenshot;
import utils.WebDriverHelper;

public class CoinPageActions {
    WebDriverHelper helper;
    Assertion assertion;
    ExtentTest test;
    public CoinPageActions(ExtentTest test) {
        try {
            helper = new WebDriverHelper(Base.driver);
            assertion = new Assertion(Base.driver);
            this.test=test;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnCoins() {
        try {
            // assertion.verifyLogo(HomePageLocators_Deekshitha01.logo);
            //assertion.verifyLogo(HomePageLocators_Deekshitha01.logo);
            helper.hoverOverElement(CoinPageLocators.coins);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnSilver() {
        try {
            helper.clickOnElement(CoinPageLocators.silver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnGender() {
        try {
            // assertion.verifyText(HomePageLocators_Deekshitha01.categories, "categories");
            //assertion.verifyText(HomePageLocators_Deekshitha01.categories, "categories");
            helper.clickOnElement(CoinPageLocators.gender);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnWomen() {
        try {
            helper.waitForTheElementToBeVisible(CoinPageLocators.women,10);
            helper.clickOnElement(CoinPageLocators.women);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnMoreFilters() {
        try {
            helper.clickOnElement(CoinPageLocators.morefilters);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnTryOnAvailable() {
        try {
            helper.clickOnElement(CoinPageLocators.tryOnAvailable);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnYes() {
        try {
            helper.clickOnElement(CoinPageLocators.yes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnFirstProduct() {
        try {
            helper.clickOnElement(CoinPageLocators.firstProduct);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnBuyNow() {
        try {
            helper.waitForTheElementToBeVisible(CoinPageLocators.productCode, 10);
            helper.clickOnElement(CoinPageLocators.buyNow);
            // assertion.verifyText(HomePageLocators_Deekshitha01.productCode, "508198");
            //assertion.verifyText(HomePageLocators_Deekshitha01.productCode, "508198");
            Screenshot.takeScreenshotWithTimestamp("Screenshot1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test7() {
        try {
            clickOnCoins();
            clickOnSilver();
            clickOnGender();
            clickOnWomen();
            clickOnMoreFilters();
            clickOnTryOnAvailable();
            clickOnYes();
            clickOnFirstProduct();
            clickOnBuyNow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
