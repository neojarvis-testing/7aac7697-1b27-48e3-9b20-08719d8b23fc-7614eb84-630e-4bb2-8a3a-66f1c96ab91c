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
    public RingPageActions(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        asserts = new Assertion(Base.driver);
        this.test = test;
    }
    /*
     * Method Name: clickSearch()
     * Author Name: Kandula Arun Kumar
     * Description: clicks on search bar.
     * Return Type: N/A
     * Parameters: void
     */
    public void clickSearch() {
        try {
            helper.waitForTheElementToBeVisible(RingPageLocators.search, 10);
            helper.clickOnElement(RingPageLocators.search);
            LoggerHandler.info("clicked on search field");
            test.info("clicked on search field"); 
            test.log(Status.PASS, "clicked on search field");   
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
    /*
     * Method Name: enterRings()
     * Author Name: Kandula Arun Kumar
     * Description: enter Rings as input.
     * Return Type: N/A
     * Parameters: void
     */
    public void enterRings() {
        try {
            helper.sendKeys(RingPageLocators.search, "Rings");
            LoggerHandler.info("entered Value Rings");
            test.info("entered value Rings");
            test.log(Status.PASS, "entered value Rings");
            helper.enterAction(RingPageLocators.search);
        } catch (Exception e) {
            LoggerHandler.error("entered Value Rings");
            test.fail("entered value Rings");
            test.log(Status.FAIL, "entered value Rings");
        }
    }

    /*
     * Method Name: verifyRings()
     * Author Name: Kandula Arun Kumar
     * Description: verify Rings keyword.
     * Return Type: N/A
     * Parameters: void
     */
    public void verifyRings() {
        try {
            asserts.verifyText(RingPageLocators.ringText, "Rings");
            LoggerHandler.info("verified Rings Keyword");
            test.info("verified Rings Keyword");
            test.log(Status.PASS, "verified Rings keyword");
        } catch (Exception e) {
            LoggerHandler.error("verified Rings Keyword");
            test.fail("verified Rings Keyword");
            test.log(Status.FAIL, "verified Rings keyword");
        }
    }

    /*
     * Method Name: applyGender()
     * Author Name: Kandula Arun Kumar
     * Description: selects Gender.
     * Return Type: N/A
     * Parameters: void
     */
    public void applyGender() {
        try {
            helper.waitForTheElementToBeVisible(RingPageLocators.gender, 10);
            helper.clickOnElement(RingPageLocators.gender);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
            LoggerHandler.info("click on gender");
            test.info("click on gender");
            test.log(Status.PASS, "click on gender");
        } catch (Exception e) {
            LoggerHandler.error("click on gender");
            test.fail("click on gender");
            test.log(Status.FAIL, "click on gender");
        }
    }

    /*
     * Method Name: applyMen()
     * Author Name: Kandula Arun Kumar
     * Description: selects Men.
     * Return Type: N/A
     * Parameters: void
     */
    public void applyMen() {
        try {
            helper.waitForTheElementToBeVisible(RingPageLocators.men, 10);
            helper.clickOnElement(RingPageLocators.men);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
            LoggerHandler.info("click on men");
            test.info("click on men");
            test.log(Status.PASS, "click on men");
        } catch (Exception e) {
            LoggerHandler.error("click on men");
            test.fail("click on men");
            test.log(Status.FAIL, "click on men");
        }
    }

    /*
     * Method Name: applyMetal()
     * Author Name: Kandula Arun Kumar
     * Description: selets Metal.
     * Return Type: N/A
     * Parameters: void
     */

    public void applyMetal() {
        try {
            helper.waitForTheElementToBeVisible(RingPageLocators.metal, 10);
            helper.clickOnElement(RingPageLocators.metal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
          LoggerHandler.info("click on metal");
            test.info("click on metal");
            test.log(Status.PASS, "click on metal");
        } catch (Exception e) {
            LoggerHandler.error("click on metal");
            test.info("click on metal");
            test.log(Status.FAIL, "click on metal");
        }
    }

    /*
     * Method Name: applyGold()
     * Author Name: Kandula Arun Kumar
     * Description: selects Gold.
     * Return Type: N/A
     * Parameters: void
     */
    public void applyGold() {
        try {
            helper.waitForTheElementToBeVisible(RingPageLocators.gold, 10);
            helper.clickOnElement(RingPageLocators.gold);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
            LoggerHandler.info("click on gold");
            test.info("click on gold");
            test.log(Status.PASS, "click on gold");
        } catch (Exception e) {
            LoggerHandler.error("click on gold");
            test.fail("click on gold");
            test.log(Status.FAIL, "click on gold");
        }
    }

    /*
     * Method Name: clickRingProduct()
     * Author Name: Kandula Arun Kumar
     * Description: clicks on first ring product.
     * Return Type: N/A
     * Parameters: void
     */
    public void clickRingProduct() {
        try {
            helper.waitForTheElementToBeVisible(RingPageLocators.ringProduct, 10);
            helper.clickOnElement(RingPageLocators.ringProduct);
            LoggerHandler.info("click on the first product");
            test.info("click on the first product");
            test.log(Status.PASS, "click on the first product");
        } catch (Exception e) {
            LoggerHandler.info("click on the first product");
            test.info("click on the first product");
            test.log(Status.PASS,"click on the first product");
        } catch (Exception e) {
            LoggerHandler.info("click on the first product");
            test.info("click on the first product");
            test.log(Status.FAIL,"click on the first product");
        }
    }
            test.log(Status.PASS, "click on the first product");
        } catch (Exception e) {
            LoggerHandler.error("click on the first product");
            test.fail("click on the first product");
            test.log(Status.FAIL, "click on the first product");
        }
    }

    /*
     * Method Name: clickCart()
     * Author Name: Kandula Arun Kumar
     * Description: clicks on add to cart.
     * Return Type: N/A
     * Parameters: void
     */
    public void clickCart() {
        try {
            helper.waitForTheElementToBeVisible(RingPageLocators.cart, 10);
            helper.clickOnElement(RingPageLocators.cart);
            LoggerHandler.info("click on add to cart");
            test.info("click on add to cart");
            test.log(Status.PASS, "click on add to cart");
            test.log(Status.PASS,"click on add to cart");
            Screenshot.takeScreenshotWithTimestamp("Rings");
        } catch (Exception e) {
            LoggerHandler.info("click on add to cart");
            test.info("click on add to cart");
            test.log(Status.FAIL,"click on add to cart");
        }
    }
            test.log(Status.PASS, "click on add to cart");
            Screenshot.takeScreenshotWithTimestamp("Rings");
        } catch (Exception e) {
            LoggerHandler.error("click on add to cart");
            test.fail("click on add to cart");
            test.log(Status.FAIL, "click on add to cart");
        }
    }

    /*
     * Method Name: test1()
     * Author Name: Kandula Arun Kumar
     * Description: cluster method of Ring page action methods.
     * Return Type: N/A
     * Parameters: void
     */
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
