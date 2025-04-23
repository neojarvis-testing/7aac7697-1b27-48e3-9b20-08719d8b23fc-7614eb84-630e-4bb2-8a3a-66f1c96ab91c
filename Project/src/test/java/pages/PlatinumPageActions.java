package pages;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.DropsPageLocators;
import uistore.PlatinumPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class PlatinumPageActions {

    WebDriverHelper helper;
    Assertion asserts;
    ExtentTest test;
    public PlatinumPageActions(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        asserts = new Assertion(Base.driver);
        this.test=test;
    }
    public void validateLogo(){
          try {
            helper.waitForTheElementToBeVisible(PlatinumPageLocators.verifyLogo, 10);
            asserts.verifyLogo(PlatinumPageLocators.verifyLogo);
            LoggerHandler.info("Validated logo");
            test.info("Validated logo");
            test.log(Status.PASS, "Validated logo");
        } catch (Exception e) {
            LoggerHandler.error("Validated logo");
            test.fail("Validated logo");
            test.log(Status.FAIL, "Validated logo");
        }
    }
    public void hoverOnRings(){
        try {
            helper.hoverOverElement(PlatinumPageLocators.hoverRings);
            helper.waitForTheElementToBeVisible(PlatinumPageLocators.casualwear, 10);
            LoggerHandler.info("hover on Rings");
            test.info("hover on Rings");
            test.log(Status.PASS, "hover on Rings");
        } catch (Exception e) {
            LoggerHandler.error("hover on Rings");
            test.fail("hover on Rings");
            test.log(Status.FAIL, "hover on Rings");
        }
    }
        public void clickOnCasualWear(){
            try {
                helper.clickOnElement(PlatinumPageLocators.casualwear);
                helper.waitForTheElementToBeVisible(PlatinumPageLocators.categories, 10);
                LoggerHandler.info("click on casual wear");
            test.info("click on casual wear");
            test.log(Status.PASS, "click on casual wear");
            } catch (Exception e) {
                LoggerHandler.error("click on casual wear");
                test.fail("click on casual wear");
                test.log(Status.FAIL, "click on casual wear");
            }
        }
        public void clickOnCategories(){
            try {
                helper.clickOnElement(PlatinumPageLocators.categories);
                helper.waitForTheElementToBeVisible(PlatinumPageLocators.platinum, 10);
                LoggerHandler.info("click on categories");
            test.info("click on categories");
            test.log(Status.PASS, "click on categories");
            } catch (Exception e) {
                LoggerHandler.error("click on categories");
                test.fail("click on categories");
                test.log(Status.FAIL, "click on categories");
            }
          
        }
        public void clickOnPlatinum(){
            try {
                helper.clickOnElement(PlatinumPageLocators.platinum);
                helper.waitForTheElementToBeVisible(PlatinumPageLocators.moreFilters, 10);
                LoggerHandler.info("click on platinum");
            test.info("click on platinum");
            test.log(Status.PASS, "click on platinum");
            } catch (Exception e) {
                LoggerHandler.error("click on platinum");
                test.fail("click on platinum");
                test.log(Status.FAIL, "click on platinum");
            }
        }
        public void clickOnMoreFilters(){
            try {
                helper.clickOnElement(PlatinumPageLocators.moreFilters);
                helper.waitForTheElementToBeVisible(PlatinumPageLocators.TryAvailable, 10);
                LoggerHandler.info("click on Morefilters");
            test.info("click on Morefilters");
            test.log(Status.PASS, "click on Morefilters");

            } catch (Exception e) {
                LoggerHandler.error("click on Morefilters");
                test.fail("click on Morefilters");
                test.log(Status.FAIL, "click on Morefilters");
            }
        }
        public void clickOnAvailable(){
            try {
                helper.clickOnElement(PlatinumPageLocators.TryAvailable);
                helper.waitForTheElementToBeVisible(PlatinumPageLocators.yes, 10);
                LoggerHandler.info("click on Available");
            test.info("click on Available");
            test.log(Status.PASS, "click on Available");
            } catch (Exception e) {
                LoggerHandler.error("click on Available");
                test.fail("click on Available");
                test.log(Status.FAIL, "click on Available");
            }
        }
        public void clickYes(){
            try {
                helper.clickOnElement(PlatinumPageLocators.yes);
                helper.waitForTheElementToBeVisible(PlatinumPageLocators.firstproduct, 10);
                LoggerHandler.info("click Yes");
            test.info("click Yes");
            test.log(Status.PASS, "click Yes");
            } catch (Exception e) {
                LoggerHandler.error("click Yes");
                test.fail("click Yes");
                test.log(Status.FAIL, "click Yes");
            }
        }
        public void clickOnFirstProduct(){
            try {
                helper.clickOnElement(PlatinumPageLocators.firstproduct);
                helper.waitForTheElementToBeVisible(PlatinumPageLocators.buynow, 10);
                LoggerHandler.info("click on firstproduct");
            test.info("click on firstproduct");
            test.log(Status.PASS, "click on firstproduct");
            } catch (Exception e) {
                LoggerHandler.error("click on firstproduct");
                test.fail("click on firstproduct");
                test.log(Status.FAIL, "click on firstproduct");
            }
        }

        public void verifyProducts(){
            try {
                asserts.verifyText(PlatinumPageLocators.productcode,"Product Code");
             helper.waitForTheElementToBeVisible(PlatinumPageLocators.buynow, 10);
            LoggerHandler.info("Verified products");
            test.info("Verified products");
            test.log(Status.PASS, "Verified products");
            } catch (Exception e) {
                LoggerHandler.error("Verified products");
                test.fail("Verified products");
                test.log(Status.FAIL, "Verified products");
            }
        }
        public void buyNow(){
            try {
                helper.clickOnElement(PlatinumPageLocators.buynow);
                LoggerHandler.info("clicked on buynow");
            test.info("clicked on buynow");
            test.log(Status.PASS, "clicked on buynow");
            } catch (Exception e) {
                LoggerHandler.error("clicked on buynow");
                test.fail("clicked on buynow");
                test.log(Status.FAIL, "clicked on buynow");
            }
        }

        public void test6(){
            validateLogo();
            hoverOnRings();
            clickOnCasualWear();
            clickOnCategories();
            clickOnPlatinum();
            clickOnMoreFilters();
            clickOnAvailable();
            clickYes();
            clickOnFirstProduct();
            buyNow();
        }
    }

