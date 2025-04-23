package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.DiamongPageLocators;
import uistore.DiamondPageLocators;
import utils.Assertion;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;
public class DiamondPageActions {
WebDriverHelper webDriverHelper;
Assertion assertion;
ExtentTest test;
public DiamondPageActions(WebDriver driver,ExtentTest test){
    webDriverHelper = new WebDriverHelper(driver);
    assertion = new Assertion(driver);
    this.test = test;
}
DiamongPageLocators diamondEarrings = new DiamongPageLocators();
DiamondPageLocators diamondEarrings = new DiamondPageLocators();
public void verifyLogo() {
    try {
        assertion.verifyLogo(diamondEarrings.relianceJewelsLogo);
        LoggerHandler.info("Verified logo");
        test.info("clicked on search field");
        test.log(Status.PASS, "clicked on search field");

    } catch (Exception e) {
        LoggerHandler.error("Failed to verify logo");
        test.fail("clicked on search field");
        test.log(Status.FAIL, "clicked on search");

    }
}
public void hoverEarrings(){
    try{
        webDriverHelper.hoverOverElement(diamondEarrings.earrringsText);
        LoggerHandler.info("Hovered earrings");
        test.info("clicked on search field");
        test.log(Status.PASS, "clicked on search field");
    }
    catch(Exception e){
        LoggerHandler.error("failed to hover earrings");
        test.fail("clicked on search field");
        test.log(Status.FAIL, "clicked on search");

    }
}
public void clickDiamond(){
    try{
        webDriverHelper.clickOnElement(diamondEarrings.diamondText);
        LoggerHandler.info("clicked on diamond");
        test.info("clicked on search field");
        test.log(Status.PASS, "clicked on search field");
    }
    catch(Exception e){
        LoggerHandler.error("failed to click on diamond");
        test.fail("clicked on search field");
        test.log(Status.FAIL, "clicked on search");
    }
}
public void verifyDiamondText(){
    try{
        Thread.sleep(3000);
        assertion.verifyText(diamondEarrings.diamondKeyword, "Diamond");
        LoggerHandler.info("verified diamond text");
        test.info("clicked on search field");
        test.log(Status.PASS, "clicked on search field");
    }
    catch(Exception e){
        LoggerHandler.error("faield to verify diamond text");
        test.fail("clicked on search field");
        test.log(Status.FAIL, "clicked on search");
    }
}
public void clickGender(){
    try{
        webDriverHelper.clickOnElement(diamondEarrings.genderText);
        LoggerHandler.info("clicked on gender");
        test.info("clicked on search field");
        test.log(Status.PASS, "clicked on search field");
    }
    catch(Exception e){
        LoggerHandler.error("failed to click on gender");
        test.fail("clicked on search field");
        test.log(Status.FAIL, "clicked on search");
    }
}
public void clickWomen(){
    try{
        webDriverHelper.waitForTheElementToBeVisible(diamondEarrings.womenDiamond,10);
        webDriverHelper.clickOnElement(diamondEarrings.womenDiamond);
        LoggerHandler.info("clicked on women");
        test.info("clicked on search field");
        test.log(Status.PASS, "clicked on search field");
    }
    catch(Exception e){
        LoggerHandler.error("failed to click on women");
        test.fail("clicked on search field");
        test.log(Status.FAIL, "clicked on search");
    }
}
public void hoverPopularity(){
    try{
        webDriverHelper.hoverOverElement(diamondEarrings.popularityButton);
        LoggerHandler.info("hovered over popularity");
        test.info("clicked on search field");
        test.log(Status.PASS, "clicked on search field");
    }
    catch(Exception e){
        LoggerHandler.error("falied to hover over popularity");
        test.fail("clicked on search field");
        test.log(Status.FAIL, "clicked on search");
    }
}
public void clickNewArrivals(){
    try{
        webDriverHelper.clickOnElement(diamondEarrings.newArrivals);
        LoggerHandler.info("clicked on new arrivals");
        test.info("clicked on search field");
        test.log(Status.PASS, "clicked on search field");
    }
    catch(Exception e){
        LoggerHandler.error("failed to click on new arrivals");
        test.fail("clicked on search field");
        test.log(Status.FAIL, "clicked on search");
    }
}
public void clickFirstProduct(){
    try{
        webDriverHelper.clickOnElement(diamondEarrings.firstProduct);
        LoggerHandler.info("clicked on first product");
        test.info("clicked on search field");
        test.log(Status.PASS, "clicked on search field");
    }
    catch(Exception e){
        LoggerHandler.error("fail to click on first product");
        test.fail("clicked on search field");
        test.log(Status.FAIL, "clicked on search");
    }
}
public void verifyKeywordEarrings(){
    try{
        Thread.sleep(3000);
        assertion.verifyText(diamondEarrings.earringsKeyword, "Earrings");
        LoggerHandler.info("verified keyword earrings");
        test.info("clicked on search field");
        test.log(Status.PASS, "clicked on search field");
    }
    catch(Exception e){
        LoggerHandler.error("failed to verify earrings keyword");
        test.fail("clicked on search field");
        test.log(Status.FAIL, "clicked on search");
    }
}
public void clickAddToCart(){
    try{
        webDriverHelper.clickOnElement(diamondEarrings.addToCart);
        LoggerHandler.info("clicked on add to cart");
        test.info("clicked on search field");
        test.log(Status.PASS, "clicked on search field");
    }
    catch(Exception e){
        LoggerHandler.error("failed to click on add to cart");
        test.fail("clicked on search field");
        test.log(Status.FAIL, "clicked on search");
    }
}
public void verifyOtherKeyword(){
    try{
        Thread.sleep(3000);
        assertion.verifyText(diamondEarrings.otherKeyword, "OTHER");
        LoggerHandler.info("Other Keyword verified");
        Screenshot.takeScreenshotWithTimestamp("Earrings");
        test.info("clicked on search field");
        test.log(Status.PASS, "clicked on search field");
    }
    catch(Exception e){
        LoggerHandler.error("failed to verify other keyword");
        test.fail("clicked on search field");
        test.log(Status.FAIL, "clicked on search");
    }
}
public void test4(){
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