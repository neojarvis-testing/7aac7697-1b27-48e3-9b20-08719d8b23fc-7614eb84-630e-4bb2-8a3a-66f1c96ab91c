package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.DropsPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class DropPageActions {
 
    WebDriverHelper helper;
    Assertion asserts;
    ExtentTest test;
 
    public DropPageActions(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        asserts = new Assertion(Base.driver);
        this.test = test;
    }
 
    /*
     * Method Name: ValidateLogo
     * Author Name: vinay
     * Description: This method validates logo.
     * Return Type: void
     * Parameter List: NA
     */
 
    public void validateLogo() {
        try {
            helper.waitForTheElementToBeVisible(DropsPageLocators.logoCheck, 10);
            asserts.verifyLogo(DropsPageLocators.logoCheck);
            LoggerHandler.info("Validated logo");
            test.info("Validated logo");
            test.log(Status.PASS, "Validated logo");
        } catch (Exception e) {
            LoggerHandler.error("Validated logo");
            test.fail("Validated logo");
            test.log(Status.FAIL, "Validated logo");
        }
 
    }
    /*
     * Method Name: hoverOverEarRings
     * Author Name: vinay
     * Description: This method performs a hover action over the "Earrings" element.
     * Return Type: void
     * Parameter List: NA
     */
 
    public void hoverOverEarRings() {
        try {
            helper.hoverOverElement(DropsPageLocators.earRings);
            helper.waitForTheElementToBeVisible(DropsPageLocators.drops, 10);
            LoggerHandler.info("Hovered on Earrings");
            test.info("Hovered on Earrings");
            test.log(Status.PASS, "Hovered on Earrings");
        } catch (Exception e) {
            LoggerHandler.error("Hovered on Earrings");
            test.fail("Hovered on Earrings");
            test.log(Status.FAIL, "Hovered on Earrings");
        }
 
    }
    /*
     * Method Name: clickOnDrops
     * Author Name: vinay
     * Description: This method clicks on the "Drops" element.
     * Return Type: void
     * Parameter List: NA
     */
 
    public void clickOnDrops() {
        try {
            helper.clickOnElement(DropsPageLocators.drops);
            LoggerHandler.info("clicked on Drops");
            test.info("clicked on Drops");
            test.log(Status.PASS, "clicked on Drops");
        } catch (Exception e) {
            LoggerHandler.error("clicked on Drops");
            test.fail("clicked on Drops");
            test.log(Status.FAIL, "clicked on Drops");
        }
 
    }
    /*
     * Method Name: verifyDrops
     * Author Name: vinay
     * Description: This method verifies if the "Drops" page is loaded.
     * Return Type: void
     * Parameter List: NA
     */
 
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
 
    /*
     * Method Name: clickOnCategories
     * Author Name: vinay
     * Description: This method clicks on the "Categories" element.
     * Return Type: void
     * Parameter List: NA
     */
 
    public void clickOnCategories() {
        try {
            helper.clickOnElement(DropsPageLocators.categories);
            helper.waitForTheElementToBeVisible(DropsPageLocators.gold, 10);
            LoggerHandler.info("clicked on categories");
            test.info("clicked on categories");
            test.log(Status.PASS, "clicked on categories");
        } catch (Exception e) {
            LoggerHandler.error("clicked on categories");
            test.fail("clicked on categories");
            test.log(Status.FAIL, "clicked on categories");
        }
 
    }
    /*
     * Method Name: clickOnGold
     * Author Name: vinay
     * Description: This method clicks on the "Gold" category.
     * Return Type: void
     * Parameter List: NA
     */
 
    public void clickOnGold() {
        try {
            helper.clickOnElement(DropsPageLocators.gold);
            helper.waitForTheElementToBeVisible(DropsPageLocators.morefilters, 10);
            LoggerHandler.info("clicked on Gold");
            test.info("clicked on Gold");
            test.log(Status.PASS, "clicked on Gold");
        } catch (Exception e) {
            LoggerHandler.error("clicked on Gold");
            test.fail("clicked on Gold");
            test.log(Status.FAIL, "clicked on Gold");
        }
 
    }
 
    /*
     * Method Name: clickOnMoreFilters
     * Author Name: vinay
     * Description: This method clicks on the "More Filters" option.
     * Return Type: void
     * Parameter List: NA
     */
 
    public void clickOnMoreFilters() {
        try {
            helper.clickOnElement(DropsPageLocators.morefilters);
            helper.waitForTheElementToBeVisible(DropsPageLocators.metalPurity, 10);
            LoggerHandler.info("clicked on more filters");
            test.info("clicked on more filters");
            test.log(Status.PASS, "clicked on more filters");
        } catch (Exception e) {
            LoggerHandler.error("clicked on more filters");
            test.fail("clicked on more filters");
            test.log(Status.FAIL, "clicked on more filters");
        }
 
    }
    /*
     * Method Name: clickMetalPurity
     * Author Name: vinay
     * Description: This method clicks on the "Metal Purity" option.
     * Return Type: void
     * Parameter List: NA
     */
 
    public void clickMetalPurity() {
        try {
            helper.clickOnElement(DropsPageLocators.metalPurity);
            helper.waitForTheElementToBeVisible(DropsPageLocators.purity22kt, 10);
            LoggerHandler.info("clicked on Metalpurity");
            test.info("clicked on search Metalpurity");
            test.log(Status.PASS, "clicked on Metalpurity");
        } catch (Exception e) {
            LoggerHandler.error("clicked on Metalpurity");
            test.fail("clicked on Metalpurity");
            test.log(Status.FAIL, "clicked on Metalpurity");
        }
 
    }
 
    /*
     * Method Name: clickOn22Kt
     * Author Name: vinay
     * Description: This method clicks on the "22Kt Purity" option.
     * Return Type: void
     * Parameter List: NA
     */
   
    public void clickOn22Kt() {
        try {
            helper.clickOnElement(DropsPageLocators.purity22kt);
            helper.waitForTheElementToBeVisible(DropsPageLocators.firstProduct, 10);
            LoggerHandler.info("clicked on 22kt");
            test.info("clicked on search 22kt");
            test.log(Status.PASS, "clicked on 22kt");
        } catch (Exception e) {
            LoggerHandler.error("clicked on 22kt");
            test.fail("clicked on 22kt");
            test.log(Status.FAIL, "clicked on 22kt");
        }
 
    }
    /*
     * Method Name: clickOnFirstProduct
     * Author Name: vinay
     * Description: This method clicks on the first product in the list.
     * Return Type: void
     * Parameter List: NA
     */
 
    public void clickOnFirstproduct() {
        try {
            helper.clickOnElement(DropsPageLocators.firstProduct);
            helper.waitForTheElementToBeVisible(DropsPageLocators.keyFeatures, 10);
            LoggerHandler.info("clicked on first product");
            test.info("clicked on first product");
            test.log(Status.PASS, "clicked on first product");
        } catch (Exception e) {
            LoggerHandler.error("clicked on first product");
            test.fail("clicked on first product");
            test.log(Status.FAIL, "clicked on first product");
        }
 
    }
    /*
     * Method Name: verifyFeatures
     * Author Name: vinay
     * Description: This method verifies the key features section on the product
     * page.
     * Return Type: void
     * Parameter List: NA
     */
 
    public void verifyFeatures() {
        try {
            asserts.verifyText(DropsPageLocators.keyFeatures, "Key Features");
            helper.waitForTheElementToBeVisible(DropsPageLocators.buyNow, 10);
            LoggerHandler.info("Key Features");
            test.info("Key Features");
            test.log(Status.PASS, "Key Features");
        } catch (Exception e) {
            LoggerHandler.error("Key Features");
            test.fail("Key Features");
            test.log(Status.FAIL, "Key Features");
        }
    }
 
    /*
     * Method Name: clickOnBuynow
     * Author Name: vinay
     * Description: This method clicks on the "Buy Now" button and takes a
     * screenshot.
     * Return Type: void
     * Parameter List: NA
     */
 
    public void clickOnBuynow() {
        try {
            helper.clickOnElement(DropsPageLocators.buyNow);
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
 
    /*
     * Method Name: test5
     * Author Name: vinay
     * Description: This method executes a sequence of actions to validate the
     * purchase workflow.
     * Return Type: void
     * Parameter List: NA
     */
 
    public void test5() {
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