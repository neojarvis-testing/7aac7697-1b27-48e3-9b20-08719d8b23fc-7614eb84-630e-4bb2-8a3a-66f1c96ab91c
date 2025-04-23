package pages;

import utils.WebDriverHelper;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.RingPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;

public class RingPageActions {
    WebDriverHelper helper;
    Assertion asserts;
    ExtentTest test;
    public RingPageActions(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        asserts = new Assertion(Base.driver);
        this.test=test;
    }

    public void clickSearch() {
        try {
            helper.waitForTheElementToBeVisible(RingPageLocators.search, 10);
            helper.clickOnElement(RingPageLocators.search);
            LoggerHandler.info("clicked on search field");
            test.info("clicked on search field"); 
            test.log(Status.PASS, "clicked on search field");   
        } catch (Exception e) {
            LoggerHandler.error("clicked on search field");
            test.fail("clicked on search field");
            test.log(Status.FAIL, "clicked on search");
        }
    }

    public void enterRings() {
        try {
            helper.sendKeys(RingPageLocators.search, "Rings");
            helper.enterAction(RingPageLocators.search);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyRings() {
        try {
            asserts.verifyText(RingPageLocators.ringText, "Rings");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void applyGender() {
        try {
            helper.waitForTheElementToBeVisible(RingPageLocators.gender, 10);
            helper.clickOnElement(RingPageLocators.gender);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void applyMen() {
        try {
            helper.waitForTheElementToBeVisible(RingPageLocators.men, 10);
            helper.clickOnElement(RingPageLocators.men);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void applyMetal() {
        try {
            helper.waitForTheElementToBeVisible(RingPageLocators.metal, 10);
            helper.clickOnElement(RingPageLocators.metal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void applyGold() {
        try {
            helper.waitForTheElementToBeVisible(RingPageLocators.gold, 10);
            helper.clickOnElement(RingPageLocators.gold);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickRingProduct() {
        try {
            helper.waitForTheElementToBeVisible(RingPageLocators.ringProduct, 10);
            helper.clickOnElement(RingPageLocators.ringProduct);
            LoggerHandler.info("click on the first product");
            test.info("click on the first product");
            test.log(Status.PASS,"click on the first product");
        } catch (Exception e) {
            LoggerHandler.info("click on the first product");
            test.info("click on the first product");
            test.log(Status.FAIL,"click on the first product");
        }
    }

    public void clickCart() {
        try {
            helper.waitForTheElementToBeVisible(RingPageLocators.cart, 10);
            helper.clickOnElement(RingPageLocators.cart);
            LoggerHandler.info("click on add to cart");
            test.info("click on add to cart");
            test.log(Status.PASS,"click on add to cart");
            Screenshot.takeScreenshotWithTimestamp("Rings");
        } catch (Exception e) {
            LoggerHandler.info("click on add to cart");
            test.info("click on add to cart");
            test.log(Status.FAIL,"click on add to cart");
        }
    }

    public void test1() {
        clickSearch();
        enterRings();
        applyGender();
        applyMen();
        applyMetal();
        applyGold();
        clickRingProduct();
        clickCart();
    }
}
