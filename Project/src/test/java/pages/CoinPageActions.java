package pages;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import uistore.CoinPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class CoinPageActions {
    WebDriverHelper helper;
    Assertion assertion;
    ExtentTest test;
    public CoinPageActions(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        assertion = new Assertion(Base.driver);
        this.test = test;
    }

    /*
     * Method Name: clickOnChains
     * Author Name: Deekshitha
     * Description: This method clicks on chains.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnCoins() {
        try {
            assertion.verifyLogo(CoinPageLocators.logo);
            assertion.verifyLogo(CoinPageLocators.logo);
            helper.hoverOverElement(CoinPageLocators.coins);
            LoggerHandler.info("Hovered on Coins");
            test.info("Hovered on Coins");
            test.log(Status.PASS, "Hovered on Coins");
        } catch (Exception e) {
            LoggerHandler.error("Hovered on Coins");
            test.fail("Hovered on Coins");
            test.log(Status.FAIL, "Hovered on Coins");

        }
    }

    /*
     * Method Name: clickOnSilver
     * Author Name: Deekshitha
     * Description: This method clicks on Silver.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnSilver() {
        try {
            helper.clickOnElement(CoinPageLocators.silver);
            LoggerHandler.info("Clicked on Silver");
            test.info("Clicked on Silver");
            test.log(Status.PASS, "Clicked on Silver");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Silver");
            test.fail("Clicked on Coins");
            test.log(Status.FAIL, "Clicked on Silver");
        }
    }

    /*
     * Method Name: clickOnGender
     * Author Name: Deekshitha
     * Description: This method clicks on Gender.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnGender() {
        try {
            assertion.verifyText(CoinPageLocators.categories, "Categories");
            helper.clickOnElement(CoinPageLocators.gender);
            LoggerHandler.info("Clicked on Gender");
            test.info("Clicked on Gender");
            test.log(Status.PASS, "Clicked on Gender");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Gender");
            test.fail("Clicked on Gender");
            test.log(Status.FAIL, "Clicked on Gender");
        }
    }

    /*
     * Method Name: clickOnWomen
     * Author Name: Deekshitha
     * Description: This method clicks on Women.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnWomen() {
        try {
            helper.waitForTheElementToBeVisible(CoinPageLocators.women, 10);
            helper.clickOnElement(CoinPageLocators.women);
            LoggerHandler.info("Clicked on Women");
            test.info("Clicked on Women");
            test.log(Status.PASS, "Clicked on Women");

        } catch (Exception e) {
            LoggerHandler.error("Clicked on Women");
            test.fail("Clicked on Women");
            test.log(Status.FAIL, "Clicked on Women");
        }
    }

    /*
     * Method Name: clickOnMoreFilters
     * Author Name: Deekshitha
     * Description: This method clicks on More Filters.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnMoreFilters() {
        try {
            helper.clickOnElement(CoinPageLocators.morefilters);
            LoggerHandler.info("Clicked on More Filters");
            test.info("Clicked on More Filters");
            test.log(Status.PASS, "Clicked on More Filters");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on More Filters");
            test.fail("Clicked on More Filters");
            test.log(Status.FAIL, "Clicked on More Filters");
        }
    }

    /*
     * Method Name: clickOnTryOnAvailable
     * Author Name: Deekshitha
     * Description: This method clicks on Try On Available.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnTryOnAvailable() {
        try {
            helper.clickOnElement(CoinPageLocators.tryOnAvailable);
            LoggerHandler.info("Clicked on Available");
            test.info("Clicked on Available");
            test.log(Status.PASS, "Clicked on Available");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Available");
            test.fail("Clicked on Available");
            test.log(Status.FAIL, "Clicked on Available");
        }
    }

    /*
     * Method Name: clickOnYes
     * Author Name: Deekshitha
     * Description: This method clicks on Yes.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnYes() {
        try {
            helper.clickOnElement(CoinPageLocators.yes);
            LoggerHandler.info("Clicked on Yes");
            test.info("Clicked on Yes");
            test.log(Status.PASS, "Clicked on Yes");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Yes");
            test.fail("Clicked on Yes");
            test.log(Status.FAIL, "Clicked on Yes");
        }
    }

    /*
     * Method Name: clickOnFirstProduct
     * Author Name: Deekshitha
     * Description: This method clicks on the first product.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnFirstProduct() {
        try {
            helper.clickOnElement(CoinPageLocators.firstProduct);
            LoggerHandler.info("Clicked on Product");
            test.info("Clicked on Product");
            test.log(Status.PASS, "Clicked on Product");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Product");
            test.fail("Clicked on Product");
            test.log(Status.FAIL, "Clicked on Product");
        }
    }

    /*
     * Method Name: clickOnBuyNow
     * Author Name: Deekshitha
     * Description: This method clicks on Buy Now.
     * Return Type: void
     * Parameter List: NA
     */
    public CoinPageActions(ExtentTest test) {
        try {
            helper = new WebDriverHelper(Base.driver);
            assertion = new Assertion(Base.driver);
            this.test=test;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnCoins() {
        try {
            // assertion.verifyLogo(HomePageLocators_Deekshitha01.logo);
            //assertion.verifyLogo(HomePageLocators_Deekshitha01.logo);
            helper.hoverOverElement(CoinPageLocators.coins);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnSilver() {
        try {
            helper.clickOnElement(CoinPageLocators.silver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnGender() {
        try {
            // assertion.verifyText(HomePageLocators_Deekshitha01.categories, "categories");
            //assertion.verifyText(HomePageLocators_Deekshitha01.categories, "categories");
            helper.clickOnElement(CoinPageLocators.gender);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnWomen() {
        try {
            helper.waitForTheElementToBeVisible(CoinPageLocators.women,10);
            helper.clickOnElement(CoinPageLocators.women);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnMoreFilters() {
        try {
            helper.clickOnElement(CoinPageLocators.morefilters);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnTryOnAvailable() {
        try {
            helper.clickOnElement(CoinPageLocators.tryOnAvailable);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnYes() {
        try {
            helper.clickOnElement(CoinPageLocators.yes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnFirstProduct() {
        try {
            helper.clickOnElement(CoinPageLocators.firstProduct);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void clickOnBuyNow() {
        try {
            helper.waitForTheElementToBeVisible(CoinPageLocators.productCode, 10);
            helper.clickOnElement(CoinPageLocators.buyNow);
            assertion.verifyText(CoinPageLocators.productCode, "508198");
            Screenshot.takeScreenshotWithTimestamp("Screenshot1");
            LoggerHandler.info("Clicked on BuyNow");
            test.info("Clicked on BuyNow");
            test.log(Status.PASS, "Clicked on BuyNow");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on BuyNow");
            test.fail("Clicked on BuyNow");
            test.log(Status.FAIL, "Clicked on BuyNow");
        }
    }

    /*
     * Method Name: TestCase1
     * Author Name: Deekshitha
     * Description: This method executes Test Case 1 by performing a series of
     * actions.
     * Return Type: void
     * Parameter List: NA
     */
    public void test7() {
        clickOnCoins();
        clickOnSilver();
        clickOnGender();
        clickOnWomen();
        clickOnMoreFilters();
        clickOnTryOnAvailable();
        clickOnYes();
        clickOnFirstProduct();
        clickOnBuyNow();
            // assertion.verifyText(HomePageLocators_Deekshitha01.productCode, "508198");
            //assertion.verifyText(HomePageLocators_Deekshitha01.productCode, "508198");
            Screenshot.takeScreenshotWithTimestamp("Screenshot1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test7() {
        try {
            clickOnCoins();
            clickOnSilver();
            clickOnGender();
            clickOnWomen();
            clickOnMoreFilters();
            clickOnTryOnAvailable();
            clickOnYes();
            clickOnFirstProduct();
            clickOnBuyNow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
