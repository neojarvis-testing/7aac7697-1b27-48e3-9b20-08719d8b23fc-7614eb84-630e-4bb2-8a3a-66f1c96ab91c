package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.PendantPageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class PendantPageActions {
    ExtentTest test;
    WebDriverHelper helper;
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
        }catch (Exception e) {
            LoggerHandler.error("hover on pendants");
            test.fail("hover on pendants");
            test.log(Status.FAIL, "hover on pendants");
        }
    }
    public void clickGifting(){
        try{
            helper.waitForTheElementToBeVisible(PendantPageLocators.gifting, 10);
            helper.clickOnElement(PendantPageLocators.gifting);
            LoggerHandler.info("clicked on Gifting");
            test.info("clicked on Gifting");
            test.log(Status.PASS, "clicked on Gifting");  
        }catch (Exception e) {
            LoggerHandler.error("clicked on Gifting");
            test.fail("clicked on Gifting");
            test.log(Status.FAIL, "clicked on Gifting");
        }
    }

    public void clickGender(){
        try{
            helper.waitForTheElementToBeVisible(PendantPageLocators.gender, 10);
            helper.clickOnElement(PendantPageLocators.gender);
            LoggerHandler.info("clicked on Gender");
            test.info("clicked on Gender");
            test.log(Status.PASS, "clicked on Gender");  
        }catch (Exception e) {
            LoggerHandler.error("clicked on Gender");
            test.fail("clicked on Gender");
            test.log(Status.FAIL, "clicked on Gender");
        }
    }
    public void clickKids(){
        try{
            helper.waitForTheElementToBeVisible(PendantPageLocators.kids, 10);
            helper.clickOnElement(PendantPageLocators.kids);
            LoggerHandler.info("clicked on Kids");
            test.info("clicked on Kids");
            test.log(Status.PASS, "clicked on Kids");  
        }catch (Exception e) {
            LoggerHandler.error("clicked on Kids");
            test.fail("clicked on Kids");
            test.log(Status.FAIL, "clicked on Kids");
        }
    }
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
        }catch (Exception e) {
            LoggerHandler.error("click on the first product");
            test.fail("click on the first product");
            test.log(Status.FAIL, "click on the first product");
        }
    }
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
        clickAddToCart();

    }



}
