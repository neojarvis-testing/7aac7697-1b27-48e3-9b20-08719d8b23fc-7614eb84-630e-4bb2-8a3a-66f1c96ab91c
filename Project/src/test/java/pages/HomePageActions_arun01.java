package pages;

import utils.WebDriverHelper;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators_arun01;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;

public class HomePageActions_arun01 {
    WebDriverHelper helper;
    Assertion asserts;
    ExtentTest test;
    public HomePageActions_arun01(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        asserts = new Assertion(Base.driver);
        this.test=test;
    }

    public void clickSearch() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun01.search, 10);
            helper.clickOnElement(HomePageLocators_arun01.search);
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
            helper.sendKeys(HomePageLocators_arun01.search, "Rings");
            helper.enterAction(HomePageLocators_arun01.search);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyRings() {
        try {
            asserts.verifyText(HomePageLocators_arun01.ringText, "Rings");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void applyGender() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun01.gender, 10);
            helper.clickOnElement(HomePageLocators_arun01.gender);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void applyMen() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun01.men, 10);
            helper.clickOnElement(HomePageLocators_arun01.men);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void applyMetal() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun01.metal, 10);
            helper.clickOnElement(HomePageLocators_arun01.metal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void applyGold() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun01.gold, 10);
            helper.clickOnElement(HomePageLocators_arun01.gold);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickRingProduct() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun01.ringProduct, 10);
            helper.clickOnElement(HomePageLocators_arun01.ringProduct);
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
            helper.waitForTheElementToBeVisible(HomePageLocators_arun01.cart, 10);
            helper.clickOnElement(HomePageLocators_arun01.cart);
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
        clickProduct();
        clickRingProduct();
        clickCart();
    }
}
