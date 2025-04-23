package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NecklacePageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class NecklacePageActions {
    WebDriverHelper helper;
    Assertion asserts;
    ExtentTest test;
    public NecklacePageActions(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        this.test=test;
    }

    public void clickSearch() {
        try {
            helper.waitForTheElementToBeVisible(NecklacePageLocators.search, 10);
            helper.clickOnElement(NecklacePageLocators.search);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterNecklace() {
        try {
            helper.sendKeys(NecklacePageLocators.search, "Necklace");
            helper.enterAction(NecklacePageLocators.search);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyNecklace() {
        try {
            asserts.verifyText(NecklacePageLocators.necklaceText, "Necklace");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hoverProduct() {
        try {
            helper.waitForTheElementToBeVisible(NecklacePageLocators.necklace, 15);
            helper.hoverOverElement(NecklacePageLocators.necklace);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickQuickView() {
        try {
            helper.waitForTheElementToBeVisible(NecklacePageLocators.quick, 10);
            helper.clickOnElement(NecklacePageLocators.quick);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickPopup() {
        try {
            helper.waitForTheElementToBeVisible(NecklacePageLocators.close, 10);
            helper.clickOnElement(NecklacePageLocators.close);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickNecklaceProduct() {
        try {
            helper.waitForTheElementToBeVisible(NecklacePageLocators.necklace, 10);
            helper.clickOnElement(NecklacePageLocators.necklace);
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
            helper.waitForTheElementToBeVisible(NecklacePageLocators.weight, 10);
            helper.clickOnElement(NecklacePageLocators.weight);
            helper.selectDropDown(NecklacePageLocators.weight, "Gross Weight-2.34g");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickBuyNow() {
        try {
            helper.waitForTheElementToBeVisible(NecklacePageLocators.buy, 10);
            helper.clickOnElement(NecklacePageLocators.buy);
            Screenshot.takeScreenshotWithTimestamp("My Cart");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickProceedToPay(){
        try{
            helper.waitForTheElementToBeVisible(NecklacePageLocators.pay, 10);
            helper.clickOnElement(NecklacePageLocators.pay);
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
