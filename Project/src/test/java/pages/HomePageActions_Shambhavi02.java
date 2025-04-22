package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators_Shambhavi02;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HomePageActions_Shambhavi02 {
    ExtentTest test;
    WebDriverHelper helper;
    public HomePageActions_Shambhavi02(ExtentTest test) {
            helper = new WebDriverHelper(Base.driver);
            this.test=test;
    }
    public void hoverPendant(){
        try{
            helper.waitForTheElementToBeVisible(HomePageLocators_Shambhavi02.pendants, 10);
            helper.hoverOverElement(HomePageLocators_Shambhavi02.pendants);
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
            helper.waitForTheElementToBeVisible(HomePageLocators_Shambhavi02.gifting, 10);
            helper.clickOnElement(HomePageLocators_Shambhavi02.gifting);
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
            helper.waitForTheElementToBeVisible(HomePageLocators_Shambhavi02.gender, 10);
            helper.clickOnElement(HomePageLocators_Shambhavi02.gender);
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
            helper.waitForTheElementToBeVisible(HomePageLocators_Shambhavi02.kids, 10);
            helper.clickOnElement(HomePageLocators_Shambhavi02.kids);
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
            helper.waitForTheElementToBeVisible(HomePageLocators_Shambhavi02.moreFilters, 10);
            helper.clickOnElement(HomePageLocators_Shambhavi02.moreFilters);
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
            helper.waitForTheElementToBeVisible(HomePageLocators_Shambhavi02.type, 10);
            helper.clickOnElement(HomePageLocators_Shambhavi02.type);
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
            helper.waitForTheElementToBeVisible(HomePageLocators_Shambhavi02.checkBoxPendant, 10);
            helper.clickOnElement(HomePageLocators_Shambhavi02.checkBoxPendant);
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
            helper.waitForTheElementToBeVisible(HomePageLocators_Shambhavi02.firstProduct, 10);
            helper.clickOnElement(HomePageLocators_Shambhavi02.firstProduct);
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
            helper.waitForTheElementToBeVisible(HomePageLocators_Shambhavi02.addToCart, 10);
            helper.clickOnElement(HomePageLocators_Shambhavi02.addToCart);
            LoggerHandler.info("clicked on search field");
            test.info("clicked on search field");
            test.log(Status.PASS, "clicked on search field");
            
        }catch (Exception e) {
            LoggerHandler.error("clicked on search field");
            test.fail("clicked on search field");
            test.log(Status.FAIL, "clicked on search");
        }
    }
    public void testCase10(){
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
