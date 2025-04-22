package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators_Vinay01;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomePageActions_Vinay01 {

    WebDriverHelper helper;
    Assertion asserts;
    ExtentTest test;
    public HomePageActions_Vinay01(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        asserts = new Assertion(Base.driver);
        this.test=test;
    }

    public void validateLogo() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_Vinay01.logoCheck, 10);
            asserts.verifyLogo(HomePageLocators_Vinay01.logoCheck);
            LoggerHandler.info("Validated logo");
            test.info("Validated logo");
            test.log(Status.PASS, "Validated logo");
        } catch (Exception e) {
            LoggerHandler.error("Validated logo");
            test.fail("Validated logo");
            test.log(Status.FAIL, "Validated logo");
        }

    }

    public void hoverOverEarRings() {
        try {
            helper.hoverOverElement(HomePageLocators_Vinay01.earRings);
            helper.waitForTheElementToBeVisible(HomePageLocators_Vinay01.drops, 10);
            LoggerHandler.info("Hovered on Earrings");
            test.info("Hovered on Earrings");
            test.log(Status.PASS, "Hovered on Earrings");
        } catch (Exception e) {
            LoggerHandler.error("Hovered on Earrings");
            test.fail("Hovered on Earrings");
            test.log(Status.FAIL, "Hovered on Earrings");
        }

    }

    public void clickOnDrops() {
        try {
            helper.clickOnElement(HomePageLocators_Vinay01.drops);
            LoggerHandler.info("clicked on Drops");
            test.info("clicked on Drops");
            test.log(Status.PASS, "clicked on Drops");
        } catch (Exception e) {
            LoggerHandler.error("clicked on Drops");
            test.fail("clicked on Drops");
            test.log(Status.FAIL, "clicked on Drops");
        }

    }

    public void verifyDrops() {
        try {
            asserts.verifyUrl("Drops");
            LoggerHandler.info("Verified Drops");
            test.info("Verified Drops");
            test.log(Status.PASS, "Verified Drops");
        } catch (Exception e) {
            LoggerHandler.error("Verified Drops");
            test.fail("Verified Drops");
            test.log(Status.FAIL, "Verified Drops");
        }
    }

    public void clickOnCategories() {
        try {
            helper.clickOnElement(HomePageLocators_Vinay01.categories);
            helper.waitForTheElementToBeVisible(HomePageLocators_Vinay01.gold, 10);
            LoggerHandler.info("clicked on categories");
            test.info("clicked on categories");
            test.log(Status.PASS, "clicked on categories");
        } catch (Exception e) {
            LoggerHandler.error("clicked on categories");
            test.fail("clicked on categories");
            test.log(Status.FAIL, "clicked on categories");
        }

    }

    public void clickOnGold() {
        try {
            helper.clickOnElement(HomePageLocators_Vinay01.gold);
            helper.waitForTheElementToBeVisible(HomePageLocators_Vinay01.morefilters, 10);
            LoggerHandler.info("clicked on Gold");
            test.info("clicked on Gold");
            test.log(Status.PASS, "clicked on Gold");
        } catch (Exception e) {
            LoggerHandler.error("clicked on Gold");
            test.fail("clicked on Gold");
            test.log(Status.FAIL, "clicked on Gold");
        }

    }

    public void clickOnMoreFilters() {
        try {
            helper.clickOnElement(HomePageLocators_Vinay01.morefilters);
            helper.waitForTheElementToBeVisible(HomePageLocators_Vinay01.metalPurity, 10);
            LoggerHandler.info("clicked on more filters");
            test.info("clicked on more filters");
            test.log(Status.PASS, "clicked on more filters");
        } catch (Exception e) {
            LoggerHandler.error("clicked on more filters");
            test.fail("clicked on more filters");
            test.log(Status.FAIL, "clicked on more filters");
        }

    }

    public void clickMetalPurity() {
        try {
            helper.clickOnElement(HomePageLocators_Vinay01.metalPurity);
            helper.waitForTheElementToBeVisible(HomePageLocators_Vinay01.purity22kt, 10);
            LoggerHandler.info("clicked on Metalpurity");
            test.info("clicked on search Metalpurity");
            test.log(Status.PASS, "clicked on Metalpurity");
        } catch (Exception e) {
            LoggerHandler.error("clicked on Metalpurity");
            test.fail("clicked on Metalpurity");
            test.log(Status.FAIL, "clicked on Metalpurity");
        }

    }

    public void clickOn22Kt() {
        try {
            helper.clickOnElement(HomePageLocators_Vinay01.purity22kt);
            helper.waitForTheElementToBeVisible(HomePageLocators_Vinay01.firstProduct, 10);
            LoggerHandler.info("clicked on 22kt");
            test.info("clicked on search 22kt");
            test.log(Status.PASS, "clicked on 22kt");
        } catch (Exception e) {
            LoggerHandler.error("clicked on 22kt");
            test.fail("clicked on 22kt");
            test.log(Status.FAIL, "clicked on 22kt");
        }

    }

    public void clickOnFirstproduct() {
        try {
            helper.clickOnElement(HomePageLocators_Vinay01.firstProduct);
            helper.waitForTheElementToBeVisible(HomePageLocators_Vinay01.keyFeatures, 10);
            LoggerHandler.info("clicked on first product");
            test.info("clicked on first product");
            test.log(Status.PASS, "clicked on first product");
        } catch (Exception e) {
            LoggerHandler.error("clicked on first product");
            test.fail("clicked on first product");
            test.log(Status.FAIL, "clicked on first product");
        }

    }

    public void verifyFeatures() {
        try {
            asserts.verifyText(HomePageLocators_Vinay01.keyFeatures, "Key Features");
            helper.waitForTheElementToBeVisible(HomePageLocators_Vinay01.buyNow, 10);
            LoggerHandler.info("Key Features");
            test.info("Key Features");
            test.log(Status.PASS, "Key Features");
        } catch (Exception e) {
            LoggerHandler.error("Key Features");
            test.fail("Key Features");
            test.log(Status.FAIL, "Key Features");
        }
    }

    public void clickOnBuynow() {
        try {
            helper.clickOnElement(HomePageLocators_Vinay01.buyNow);
            Screenshot.takeScreenshotWithTimestamp("reliancejewels");
            LoggerHandler.info("clicked on Buynow");
            test.info("clicked on Buynow");
            test.log(Status.PASS, "clicked on Buynow");
        } catch (Exception e) {
            LoggerHandler.error("clicked on Buynow");
            test.fail("clicked on Buynow");
            test.log(Status.FAIL, "clicked on Buynow");
        }

    }

    public void test1() {
        validateLogo();
        hoverOverEarRings();
        clickOnDrops();
        verifyDrops();
        clickOnCategories();
        clickOnGold();
        clickOnMoreFilters();
        clickMetalPurity();
        clickOn22Kt();
        clickOnFirstproduct();
        verifyFeatures();
        clickOnBuynow();
    }
}
