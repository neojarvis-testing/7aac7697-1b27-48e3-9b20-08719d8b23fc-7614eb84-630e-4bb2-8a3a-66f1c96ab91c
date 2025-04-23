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
        this.test = test;
    }

    /*
     * Method Name: clickSearch()
     * Author Name: Kandula Arun Kumar
     * Description: click on search field.
     * Return Type: N/A
     * Parameters: void
     */
    public void clickSearch() {
        try {
            helper.waitForTheElementToBeVisible(NecklacePageLocators.search, 10);
            helper.clickOnElement(NecklacePageLocators.search);
            LoggerHandler.info("clicked on search field");
            test.info("clicked on search field");
            test.log(Status.PASS, "clicked on search field");
        } catch (Exception e) {
            LoggerHandler.error("clicked on search field");
            test.fail("clicked on search field");
            test.log(Status.FAIL, "clicked on search field");
        }
    }

    /*
     * Method Name: enterNecklace()
     * Author Name: Kandula Arun Kumar
     * Description: enter Necklace as input.
     * Return Type: N/A
     * Parameters: void
     */
    public void enterNecklace() {
        try {
            helper.sendKeys(NecklacePageLocators.search, "Necklace");
            helper.enterAction(NecklacePageLocators.search);
            LoggerHandler.info("entered necklace");
            test.info("entered necklace");
            test.log(Status.PASS, "entered necklace");
        } catch (Exception e) {
            LoggerHandler.error("entered necklace");
            test.fail("entered necklace");
            test.log(Status.FAIL, "entered necklace");
        }
    }

    /*
     * Method Name: hoverProduct()
     * Author Name: Kandula Arun Kumar
     * Description: hover over first product.
     * Return Type: N/A
     * Parameters: void
     */
    public void hoverProduct() {
        try {
            helper.waitForTheElementToBeVisible(NecklacePageLocators.necklace, 15);
            helper.hoverOverElement(NecklacePageLocators.necklace);
            LoggerHandler.info("click on necklace");
            test.info("click on necklace");
            test.log(Status.PASS, "click on necklace");
        } catch (Exception e) {
            LoggerHandler.error("click on necklace");
            test.fail("click on necklace");
            test.log(Status.FAIL, "click on necklace");
        }
    }

    /*
     * Method Name: clickQuickView()
     * Author Name: Kandula Arun Kumar
     * Description: click on QuickView button.
     * Return Type: N/A
     * Parameters: void
     */
    public void clickQuickView() {
        try {
            helper.waitForTheElementToBeVisible(NecklacePageLocators.quick, 10);
            helper.clickOnElement(NecklacePageLocators.quick);
            LoggerHandler.info("click on Quick View");
            test.info("click on Quick View");
            test.log(Status.PASS, "click on Quick View");
        } catch (Exception e) {
            LoggerHandler.error("click on Quick View");
            test.fail("click on Quick View");
            test.log(Status.FAIL, "click on Quick View");
        }
    }

    /*
     * Method Name: clickPopup()
     * Author Name: Kandula Arun Kumar
     * Description: closes pop-up.
     * Return Type: N/A
     * Parameters: void
     */
    public void clickPopup() {
        try {
            helper.waitForTheElementToBeVisible(NecklacePageLocators.close, 10);
            helper.clickOnElement(NecklacePageLocators.close);
            LoggerHandler.info("click on close");
            test.info("click on close");
            test.log(Status.PASS, "click on close");
        } catch (Exception e) {
            LoggerHandler.error("click on close");
            test.fail("click on close");
            test.log(Status.FAIL, "click on close");
        }
    }

    /*
     * Method Name: clickNecklaceProduct()
     * Author Name: Kandula Arun Kumar
     * Description: click on Necklace product.
     * Return Type: N/A
     * Parameters: void
     */
    public void clickNecklaceProduct() {
        try {
            helper.waitForTheElementToBeVisible(NecklacePageLocators.necklace, 10);
            helper.clickOnElement(NecklacePageLocators.necklace);
            LoggerHandler.info("click on the first product");
            test.info("click on the first product");
            test.log(Status.PASS, "click on the first product");
        } catch (Exception e) {
            LoggerHandler.error("click on the first product");
            test.fail("click on the first product");
            test.log(Status.FAIL, "click on the first product");
        }
    }

    /*
     * Method Name: selectWeight()
     * Author Name: Kandula Arun Kumar
     * Description: selects weight.
     * Return Type: N/A
     * Parameters: void
     */
    public void selectWeight() {
        try {
            helper.waitForTheElementToBeVisible(NecklacePageLocators.weight, 10);
            helper.clickOnElement(NecklacePageLocators.weight);
            helper.selectDropDown(NecklacePageLocators.weight, "Gross Weight-2.34g");
            LoggerHandler.info("select gross weight");
            test.info("select gross weight");
            test.log(Status.PASS, "select gross weight");
        } catch (Exception e) {
            LoggerHandler.error("select gross weight");
            test.fail("select gross weight");
            test.log(Status.FAIL, "select gross weight");
        }
    }

    /*
     * Method Name: clickBuyNow()
     * Author Name: Kandula Arun Kumar
     * Description: click on Buy Now.
     * Return Type: N/A
     * Parameters: void
     */
    public void clickBuyNow() {
        try {
            helper.waitForTheElementToBeVisible(NecklacePageLocators.buy, 10);
            helper.clickOnElement(NecklacePageLocators.buy);
            LoggerHandler.info("click on by now");
            test.info("click on buy now");
            test.log(Status.PASS, "click on buy now");
            Screenshot.takeScreenshotWithTimestamp("My Cart");
        } catch (Exception e) {
            LoggerHandler.error("click on buy now");
            test.fail("click on buy now");
            test.log(Status.FAIL, "click on buy now");
        }
    }

    /*
     * Method Name: clickProceedToPay()
     * Author Name: Kandula Arun Kumar
     * Description: click on proceed to pay.
     * Return Type: N/A
     * Parameters: void
     */
    public void clickProceedToPay() {
        try {
            helper.waitForTheElementToBeVisible(NecklacePageLocators.pay, 10);
            helper.clickOnElement(NecklacePageLocators.pay);
            LoggerHandler.info("click on proceed to pay");
            test.info("click on proceed to pay");
            test.log(Status.PASS, "click on proceed to pay");
        } catch (Exception e) {
            LoggerHandler.error("click on proceed to pay");
            test.fail("click on proceed to pay");
            test.log(Status.FAIL, "click on proceed to pay");
        }
    }

    /*
     * Method Name: test2()
     * Author Name: Kandula Arun Kumar
     * Description: cluster method of Necklace page actions methods.
     * Return Type: N/A
     * Parameters: void
     */
    public void test2() {
        clickSearch();
        enterNecklace();
        hoverProduct();
        clickQuickView();
        clickPopup();
        clickNecklaceProduct();
        selectWeight();
        clickBuyNow();
        clickProceedToPay();
    }
}
