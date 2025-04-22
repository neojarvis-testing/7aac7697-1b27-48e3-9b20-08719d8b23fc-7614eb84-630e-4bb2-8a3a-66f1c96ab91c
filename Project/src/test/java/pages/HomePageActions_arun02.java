package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators_arun02;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomePageActions_arun02 {
    WebDriverHelper helper;
    Assertion asserts;
    ExtentTest test;
    public HomePageActions_arun02(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        this.test=test;
    }

    public void clickSearch() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun02.search, 10);
            helper.clickOnElement(HomePageLocators_arun02.search);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterNecklace() {
        try {
            helper.sendKeys(HomePageLocators_arun02.search, "Necklace");
            helper.enterAction(HomePageLocators_arun02.search);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyNecklace() {
        try {
            asserts.verifyText(HomePageLocators_arun02.necklaceText, "Necklace");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hoverProduct() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun02.necklace, 15);
            helper.hoverOverElement(HomePageLocators_arun02.necklace);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickQuickView() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun02.quick, 10);
            helper.clickOnElement(HomePageLocators_arun02.quick);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickPopup() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun02.close, 10);
            helper.clickOnElement(HomePageLocators_arun02.close);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickNecklaceProduct() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun02.necklace, 10);
            helper.clickOnElement(HomePageLocators_arun02.necklace);
            LoggerHandler.info("click on the first product");
            test.info("click on the first product");
            test.log(Status.PASS,"click on the first product");
        } catch (Exception e) {
            LoggerHandler.info("click on the first product");
            test.info("click on the first product");
            test.log(Status.FAIL,"click on the first product");
        }
    }

    public void selectWeight() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun02.weight, 10);
            helper.clickOnElement(HomePageLocators_arun02.weight);
            helper.selectDropDown(HomePageLocators_arun02.weight, "Gross Weight-2.34g");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickBuyNow() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun02.buy, 10);
            helper.clickOnElement(HomePageLocators_arun02.buy);
            Screenshot.takeScreenshotWithTimestamp("My Cart");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickProceedToPay(){
        try{
            helper.waitForTheElementToBeVisible(HomePageLocators_arun02.pay, 10);
            helper.clickOnElement(HomePageLocators_arun02.pay);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void test2() {
        clickSearch();
        enterNecklace();
        verifyNecklace();
        hoverProduct();
        clickQuickView();
        clickPopup();
        clickNecklaceProduct();
        selectWeight();
        clickBuyNow();
        clickProceedToPay();
    }
}
