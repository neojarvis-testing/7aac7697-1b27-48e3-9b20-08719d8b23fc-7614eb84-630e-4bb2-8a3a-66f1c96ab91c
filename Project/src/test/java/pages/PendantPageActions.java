package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.PendantPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class PendantPageActions {
    ExtentTest test;
    WebDriverHelper helper;
    Assertion assertion;

    public PendantPageActions(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        assertion = new Assertion(Base.driver);
        this.test = test;
    }
    /*
     * Method Name: hoverPendant
     * Author Name: Shambhavi
     * Description: This method hovers over the "Pendants" section.
     * Return Type: void
     * Parameter List: NA
     */

    public void hoverPendant() {
        try {
=======
    public PendantPageActions(ExtentTest test) {
            helper = new WebDriverHelper(Base.driver);
            this.test=test;
    }
    public void hoverPendant(){
        try{
            helper.waitForTheElementToBeVisible(PendantPageLocators.pendants, 10);
            helper.hoverOverElement(PendantPageLocators.pendants);
            LoggerHandler.info("hover on pendants");
            test.info("hover on pendants");
            test.log(Status.PASS, "hover on pendants");
        } catch (Exception e) {
            test.log(Status.PASS, "hover on pendants");  
        }catch (Exception e) {
            LoggerHandler.error("hover on pendants");
            test.fail("hover on pendants");
            test.log(Status.FAIL, "hover on pendants");
        }
    }
    /*
     * Method Name: clickGifting
     * Author Name: Shambhavi
     * Description: This method clicks on the "Gifting" section.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickGifting() {
        try {
    public void clickGifting(){
        try{
            helper.waitForTheElementToBeVisible(PendantPageLocators.gifting, 10);
            helper.clickOnElement(PendantPageLocators.gifting);
            LoggerHandler.info("clicked on Gifting");
            test.info("clicked on Gifting");
            test.log(Status.PASS, "clicked on Gifting");
        } catch (Exception e) {
            test.log(Status.PASS, "clicked on Gifting");  
        }catch (Exception e) {
            LoggerHandler.error("clicked on Gifting");
            test.fail("clicked on Gifting");
            test.log(Status.FAIL, "clicked on Gifting");
        }
    }
    /*
     * Method Name: urlVerification
     * Author Name: Shambhavi
     * Description: This method verifies the presence of "pendant" in the URL.
     * Return Type: void
     * Parameter List: NA
     */

    public void urlVerification() {
        try {
            assertion.verifyUrl("pendant");
            LoggerHandler.info("verified Url");
            test.info("verified Url");
            test.log(Status.PASS, "verified Url");
        } catch (Exception e) {
            LoggerHandler.error("verified Url");
            test.fail("verified Url");
            test.log(Status.FAIL, "verified Url");

        }
    }
    /*
     * Method Name: clickGender
     * Author Name: Shambhavi
     * Description: This method clicks on the "Gender" section.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickGender() {
        try {
    public void clickGender(){
        try{
            helper.waitForTheElementToBeVisible(PendantPageLocators.gender, 10);
            helper.clickOnElement(PendantPageLocators.gender);
            LoggerHandler.info("clicked on Gender");
            test.info("clicked on Gender");
            test.log(Status.PASS, "clicked on Gender");
        } catch (Exception e) {
            test.log(Status.PASS, "clicked on Gender");  
        }catch (Exception e) {
            LoggerHandler.error("clicked on Gender");
            test.fail("clicked on Gender");
            test.log(Status.FAIL, "clicked on Gender");
        }
    }
    /*
     * Method Name: clickKids
     * Author Name: Shambhavi
     * Description: This method clicks on the "Kids" section.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickKids() {
        try {
    public void clickKids(){
        try{
            helper.waitForTheElementToBeVisible(PendantPageLocators.kids, 10);
            helper.clickOnElement(PendantPageLocators.kids);
            LoggerHandler.info("clicked on Kids");
            test.info("clicked on Kids");
            test.log(Status.PASS, "clicked on Kids");
        } catch (Exception e) {
            test.log(Status.PASS, "clicked on Kids");  
        }catch (Exception e) {
            LoggerHandler.error("clicked on Kids");
            test.fail("clicked on Kids");
            test.log(Status.FAIL, "clicked on Kids");
        }
    }
    /*
     * Method Name: clickFilter
     * Author Name: Shambhavi
     * Description: This method clicks on "More Filters".
     * Return Type: void
     * Parameter List: NA
     */

    public void clickFilter() {
        try {
            helper.waitForTheElementToBeVisible(PendantPageLocators.moreFilters, 10);
            helper.clickOnElement(PendantPageLocators.moreFilters);
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
     * Method Name: clickType
     * Author Name: Shambhavi
     * Description: This method clicks on "Type".
     * Return Type: void
     * Parameter List: NA
     */

    public void clickType() {
        try {
            helper.waitForTheElementToBeVisible(PendantPageLocators.type, 10);
            helper.clickOnElement(PendantPageLocators.type);
            LoggerHandler.info("clicked on type");
            test.info("clicked on type");
            test.log(Status.PASS, "clicked on type");
        } catch (Exception e) {
            LoggerHandler.error("clicked on type");
            test.fail("clicked on type");
            test.log(Status.FAIL, "clicked on type");
        }
    }
    /*
     * Method Name: clickCheckboxPendant
     * Author Name: Shambhavi
     * Description: This method clicks on the checkbox for "Pendant".
     * Return Type: void
     * Parameter List: NA
     */

    public void clickCheckboxPendant() {
        try {
            helper.waitForTheElementToBeVisible(PendantPageLocators.checkBoxPendant, 10);
            helper.clickOnElement(PendantPageLocators.checkBoxPendant);
            LoggerHandler.info("clicked on checkbox pendant");
            test.info("clicked on checkbox pendant");
            test.log(Status.PASS, "clicked on checkbox pendant");
        } catch (Exception e) {
            LoggerHandler.error("clicked on checkbox pendant");
            test.fail("clicked on checkbox pendant");
            test.log(Status.FAIL, "clicked on checkbox pendant");
        }
    }
    /*
     * Method Name: clickProduct
     * Author Name: Shambhavi
     * Description: This method clicks on the first listed product.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickProduct() {
        try {
    public void clickFilter(){
        try{
            helper.waitForTheElementToBeVisible(PendantPageLocators.moreFilters, 10);
            helper.clickOnElement(PendantPageLocators.moreFilters);
            LoggerHandler.info("clicked on search field");
            test.info("clicked on search field");
            test.log(Status.PASS, "clicked on search field");  
        }catch (Exception e) {
            LoggerHandler.error("clicked on search field");
            test.fail("clicked on search field");
            test.log(Status.FAIL, "clicked on search");
        }
    }
    public void clickType(){
        try{
            helper.waitForTheElementToBeVisible(PendantPageLocators.type, 10);
            helper.clickOnElement(PendantPageLocators.type);
            LoggerHandler.info("clicked on search field");
            test.info("clicked on search field");
            test.log(Status.PASS, "clicked on search field");  
        }catch (Exception e) {
            LoggerHandler.error("clicked on search field");
            test.fail("clicked on search field");
            test.log(Status.FAIL, "clicked on search");
        }
    }
    public void clickCheckboxPendant(){
        try{
            helper.waitForTheElementToBeVisible(PendantPageLocators.checkBoxPendant, 10);
            helper.clickOnElement(PendantPageLocators.checkBoxPendant);
            LoggerHandler.info("clicked on search field");
            test.info("clicked on search field");
            test.log(Status.PASS, "clicked on search field");  
        }catch (Exception e) {
            LoggerHandler.error("clicked on search field");
            test.fail("clicked on search field");
            test.log(Status.FAIL, "clicked on search");
        }
    }
    public void clickProduct(){
        try{
            helper.waitForTheElementToBeVisible(PendantPageLocators.firstProduct, 10);
            helper.clickOnElement(PendantPageLocators.firstProduct);
            LoggerHandler.info("click on the first product");
            test.info("click on the first product");
            test.log(Status.PASS, "click on the first product");
        } catch (Exception e) {
            test.log(Status.PASS, "click on the first product");  
        }catch (Exception e) {
            LoggerHandler.error("click on the first product");
            test.fail("click on the first product");
            test.log(Status.FAIL, "click on the first product");
        }
    }
    /*
     * Method Name: priceVerification
     * Author Name: Shambhavi
     * Description: This method verifies the presence of "Price" in the text.
     * Return Type: void
     * Parameter List: NA
     */
    public void priceVerification() {
        try {
            assertion.verifyText(PendantPageLocators.price, "Price");
            LoggerHandler.info("verified Price");
            test.info("verified Price");
            test.log(Status.PASS, "verified Price");

        } catch (Exception e) {
            LoggerHandler.error("verified Price");
            test.fail("verified Price");
            test.log(Status.FAIL, "verified Price");
        }

    }
    /*
     * Method Name: clickAddToCart
     * Author Name: Shambhavi
     * Description: This method clicks on "Add to Cart" and takes a screenshot.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickAddToCart() {
        try {
            helper.waitForTheElementToBeVisible(PendantPageLocators.addToCart, 10);
            helper.clickOnElement(PendantPageLocators.addToCart);
            LoggerHandler.info("clicked on add to cart");
            test.info("clicked on add to cart");
            test.log(Status.PASS, "clicked on add to cart");
            Screenshot.takeScreenshotWithTimestamp("reliancejewels");
            Reporter.addScreenshotToReport("reliancejewels", test, "reliancejewels", Base.driver);

        } catch (Exception e) {
            LoggerHandler.error("clicked on add to cart");
            test.fail("clicked on add to cart");
            test.log(Status.FAIL, "clicked on add to cart");
        }
    }
    /*
     * Method Name: testCase10
     * Author Name: Shambhavi
     * Description: This method executes test case 10 by performing several actions.
     * Return Type: void
     * Parameter List: NA
     */

    public void test10() {
        hoverPendant();
        clickGifting();
        urlVerification();
    public void clickAddToCart(){
        try{
            helper.waitForTheElementToBeVisible(PendantPageLocators.addToCart, 10);
            helper.clickOnElement(PendantPageLocators.addToCart);
            LoggerHandler.info("clicked on search field");
            test.info("clicked on search field");
            test.log(Status.PASS, "clicked on search field");
            
        }catch (Exception e) {
            LoggerHandler.error("clicked on search field");
            test.fail("clicked on search field");
            test.log(Status.FAIL, "clicked on search");
        }
    }
    public void test10(){
        hoverPendant();
        clickGifting();
        clickGender();
        clickKids();
        clickFilter();
        clickType();
        clickCheckboxPendant();
        clickProduct();
        priceVerification();
        clickAddToCart();
    }
}
