package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.DiamondPageLocators;
import utils.Assertion;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class DiamondPageActions {
    WebDriverHelper webDriverHelper;
    Assertion assertion;
    ExtentTest test;

    public DiamondPageActions(WebDriver driver, ExtentTest test) {
        webDriverHelper = new WebDriverHelper(driver);
        assertion = new Assertion(driver);
        this.test = test;
    }

    DiamondPageLocators diamondEarrings = new DiamondPageLocators();

    /*
     * Method Name: verifyLogo
     * Author Name: tapaswini
     * Description: This method verifies logo
     * Return Type: void
     * Parameter List: NA
     */
    public void verifyLogo() {
        try {
            assertion.verifyLogo(diamondEarrings.relianceJewelsLogo);
            LoggerHandler.info("Verified logo");
            test.info("Verified logo");
            test.log(Status.PASS, "Verified logo");

        } catch (Exception e) {
            LoggerHandler.error("Failed to verify logo");
            test.fail("Failed to verify logo");
            test.log(Status.FAIL, "Failed to verify logo");

        }
    }

    /*
     * Method Name: hoverEarrings
     * Author Name: tapaswini
     * Description: This method hovers earrings
     * Return Type: void
     * Parameter List: NA
     */
    public void hoverEarrings() {
        try {
            webDriverHelper.hoverOverElement(diamondEarrings.earrringsText);
            LoggerHandler.info("Hovered earrings");
            test.info("Hovered earrings");
            test.log(Status.PASS, "Hovered earrings");
        } catch (Exception e) {
            LoggerHandler.error("Failed to hover earrings");
            test.fail("Failed to hover earrings");
            test.log(Status.FAIL, "Failed to hover earrings");

        }
    }

    /*
     * Method Name: clickDiamond
     * Author Name: tapaswini
     * Description: This method clciks on diamond
     * Return Type: void
     * Parameter List: NA
     */
    public void clickDiamond() {
        try {
            webDriverHelper.clickOnElement(diamondEarrings.diamondText);
            LoggerHandler.info("Clicked on diamond");
            test.info("Clicked on diamond");
            test.log(Status.PASS, "Clicked on diamond");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on diamond");
            test.fail("Failed to click on diamond");
            test.log(Status.FAIL, "Failed to click on diamond");
        }
    }

    /*
     * Method Name: verifyDiamondText
     * Author Name: tapaswini
     * Description: This method verifies on diamond text
     * Return Type: void
     * Parameter List: NA
     */
    public void verifyDiamondText() {
        try {
            Thread.sleep(3000);
            assertion.verifyText(diamondEarrings.diamondKeyword, "Diamond");
            LoggerHandler.info("Verified diamond text");
            test.info("Verified diamond text");
            test.log(Status.PASS, "Verified diamond text");
        } catch (Exception e) {
            LoggerHandler.error("Failed to verify diamond text");
            test.fail("Failed to verify diamond text");
            test.log(Status.FAIL, "Failed to verify diamond text");
        }
    }

    /*
     * Method Name: clickGender
     * Author Name: tapaswini
     * Description: This method clicks in gender
     * Return Type: void
     * Parameter List: NA
     */
    public void clickGender() {
        try {
            webDriverHelper.clickOnElement(diamondEarrings.genderText);
            LoggerHandler.info("Clicked on gender");
            test.info("Clicked on gender");
            test.log(Status.PASS, "Clicked on gender");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on gender");
            test.fail("Failed to click on gender");
            test.log(Status.FAIL, "Failed to click on gender");
        }
    }

    /*
     * Method Name: clickWomen
     * Author Name: tapaswini
     * Description: This method clciks on women
     * Return Type: void
     * Parameter List: NA
     */
    public void clickWomen() {
        try {
            webDriverHelper.waitForTheElementToBeVisible(diamondEarrings.womenDiamond, 10);
            webDriverHelper.clickOnElement(diamondEarrings.womenDiamond);
            LoggerHandler.info("Clicked on women");
            test.info("Clicked on women");
            test.log(Status.PASS, "Clicked on women");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on women");
            test.fail("Failed to click on women");
            test.log(Status.FAIL, "Failed to click on women");
        }
    }

    /*
     * Method Name: hoverPopularity
     * Author Name: tapaswini
     * Description: This method hovers on popularity
     * Return Type: void
     * Parameter List: NA
     */
    public void hoverPopularity() {
        try {
            webDriverHelper.hoverOverElement(diamondEarrings.popularityButton);
            LoggerHandler.info("Hovered over popularity");
            test.info("Hovered over popularity");
            test.log(Status.PASS, "Hovered over popularity");
        } catch (Exception e) {
            LoggerHandler.error("Failed to hover over popularity");
            test.fail("Failed to hover over popularity");
            test.log(Status.FAIL, "Failed to hover over popularity");
        }
    }

    /*
     * Method Name: clickNewArrivals
     * Author Name: tapaswini
     * Description: This method clicks on new arrivals
     * Return Type: void
     * Parameter List: NA
     */
    public void clickNewArrivals() {
        try {
            webDriverHelper.clickOnElement(diamondEarrings.newArrivals);
            LoggerHandler.info("Clicked on new arrivals");
            test.info("Clicked on new arrivals");
            test.log(Status.PASS, "Clicked on new arrivals");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on new arrivals");
            test.fail("Failed to click on new arrivals");
            test.log(Status.FAIL, "Failed to click on new arrivals");
        }
    }

    /*
     * Method Name: clickFirstProduct
     * Author Name: tapaswini
     * Description: This method clicks on first product
     * Return Type: void
     * Parameter List: NA
     */
    public void clickFirstProduct() {
        try {
            webDriverHelper.clickOnElement(diamondEarrings.firstProduct);
            LoggerHandler.info("Clicked on first product");
            test.info("Clicked on first product");
            test.log(Status.PASS, "Clicked on first product");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on first product");
            test.fail("Failed to click on first product");
            test.log(Status.FAIL, "Failed to click on first product");
        }
    }

    /*
     * Method Name: verifyKeywordEarrings
     * Author Name: tapaswini
     * Description: This method verifies earrings
     * Return Type: void
     * Parameter List: NA
     */
    public void verifyKeywordEarrings() {
        try {
            Thread.sleep(3000);
            assertion.verifyText(diamondEarrings.earringsKeyword, "Earrings");
            LoggerHandler.info("Verified keyword earrings");
            test.info("Verified keyword earrings");
            test.log(Status.PASS, "Verified keyword earrings");
        } catch (Exception e) {
            LoggerHandler.error("Failed to verify earrings keyword");
            test.fail("Failed to verify earrings keyword");
            test.log(Status.FAIL, "Failed to verify earrings keyword");
        }
    }

    /*
     * Method Name: clickAddToCart
     * Author Name: tapaswini
     * Description: This method clicks on add to cart button
     * Return Type: void
     * Parameter List: NA
     */
    public void clickAddToCart() {
        try {
            webDriverHelper.clickOnElement(diamondEarrings.addToCart);
            LoggerHandler.info("Clicked on add to cart");
            test.info("Clicked on add to cart");
            test.log(Status.PASS, "Clicked on add to cart");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on add to cart");
            test.fail("Failed to click on add to cart");
            test.log(Status.FAIL, "Failed to click on add to cart");
        }
    }

    /*
     * Method Name: verifyOtherKeyword
     * Author Name: tapaswini
     * Description: This method verifies other keyword
     * Return Type: void
     * Parameter List: NA
     */
    public void verifyOtherKeyword() {
        try {
            Thread.sleep(3000);
            assertion.verifyText(diamondEarrings.otherKeyword, "OTHER");
            LoggerHandler.info("Other Keyword verified");
            Screenshot.takeScreenshotWithTimestamp("Earrings");
            test.info("Other Keyword verified");
            test.log(Status.PASS, "Other Keyword verified");
        } catch (Exception e) {
            LoggerHandler.error("Failed to verify other keyword");
            test.fail("Failed to verify other keyword");
            test.log(Status.FAIL, "Failed to verify other keyword");
        }
    }

    /*
     * Method Name: earrings
     * Author Name: tapaswini
     * Description: This method calls all the other methods
     * Return Type: void
     * Parameter List: NA
     */
    public void test4() {
        verifyLogo();
        hoverEarrings();
        clickDiamond();
        verifyDiamondText();
        clickGender();
        clickWomen();
        hoverPopularity();
        clickNewArrivals();
        clickFirstProduct();
        verifyKeywordEarrings();
        clickAddToCart();
        verifyOtherKeyword();
    }
}
