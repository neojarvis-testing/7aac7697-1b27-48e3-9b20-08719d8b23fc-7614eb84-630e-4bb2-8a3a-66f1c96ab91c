package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.ExtentTest;

import uistore.ShippingPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class ShippingPageActions {
    WebDriverHelper helper;
    Assertion assertion;
    static ExtentTest test;
    public ShippingPageActions(ExtentTest test) {
        try {
            helper = new WebDriverHelper(Base.driver);
            assertion = new Assertion(Base.driver);
            this.test=test;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
     * Method Name: clickOnAboutUs
     * Author Name: Deekshitha
     * Description: This method clicks on the About Us link and navigates back.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnAboutUs() {
        try {
            helper.clickOnElement(ShippingPageLocators.aboutUs);
            assertion.verifyText(ShippingPageLocators.aboutUs, "About Us");
            Base.driver.navigate().back();
            LoggerHandler.info("Clicked on About Us");
            test.info("Clicked on About Us");
            test.log(Status.PASS, "Clicked on About Us");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on About Us");
            test.fail("Clicked on About Us");
            test.log(Status.FAIL, "Clicked on About Us");
        }
    }

    /*
     * Method Name: clickOnWhyReliance
     * Author Name: Deekshitha
     * Description: This method clicks on Why Reliance, verifies URL and title, and
     * navigates back.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnWhyReliance() {
        try {
            helper.clickOnElement(ShippingPageLocators.whyReliance);
            assertion.verifyUrl("https://www.reliancejewels.com/s/why-reliancejewels");
            assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
            Base.driver.navigate().back();
            LoggerHandler.info("Clicked on Reliance");
            test.info("Clicked on Reliance");
            test.log(Status.PASS, "Clicked on Reliance");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Reliance");
            test.fail("Clicked on Reliance");
            test.log(Status.FAIL, "Clicked on Reliance");
        }
    }

    /*
     * Method Name: clickOnCertifications
     * Author Name: Deekshitha
     * Description: This method clicks on Certifications, verifies URL and title,
     * and navigates back.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnCertifications() {
        try {
            helper.clickOnElement(ShippingPageLocators.certifications);
            assertion.verifyUrl("https://www.reliancejewels.com/s/certification");
            assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
            Base.driver.navigate().back();
            LoggerHandler.info("Clicked on Certifications");
            test.info("Clicked on Certifications");
            test.log(Status.PASS, "Clicked on Certifications");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Certifications");
            test.fail("Clicked on Certifications");
            test.log(Status.FAIL, "Clicked on Certifications");
        }
    }

    /*
     * Method Name: clickOnOurShowrooms
     * Author Name: Deekshitha
     * Description: This method clicks on Our Showrooms, verifies URL, and navigates
     * back.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnOurShowrooms() {
        try {
            helper.clickOnElement(ShippingPageLocators.ourShowRooms);
            assertion.verifyUrl("https://stores.reliancejewels.com/");
            Base.driver.navigate().back();
            LoggerHandler.info("Clicked on Our Showrooms");
            test.info("Clicked on Our Showrooms");
            test.log(Status.PASS, "Clicked on Our Showrooms");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Our Showrooms");
            test.fail("Clicked on Our Showrooms");
            test.log(Status.FAIL, "Clicked on Our Showrooms");
        }
    }

    /*
     * Method Name: clickOnMedia
     * Author Name: Deekshitha
     * Description: This method clicks on Media, verifies URL and title, and
     * navigates back.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnMedia() {
        try {
            helper.clickOnElement(ShippingPageLocators.media);
            assertion.verifyUrl("https://m.reliancejewels.com/static/MediasecM2023.mobi");
            assertion.verifyTitle("Reliancejewels Media");
            Base.driver.navigate().back();
            LoggerHandler.info("Clicked on Media");
            test.info("Clicked on Media");
            test.log(Status.PASS, "Clicked on Media");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Media");
            test.fail("Clicked on Media");
            test.log(Status.FAIL, "Clicked on Media");
        }
    }

    /*
     * Method Name: clickOnBlog
     * Author Name: Deekshitha
     * Description: This method clicks on Blog and verifies URL and navigates back.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnBlog() {
        try {
            helper.clickOnElement(ShippingPageLocators.blog);
            assertion.verifyUrl("https://reliancejewels.com/blog/");
            Base.driver.navigate().back();
            LoggerHandler.info("Clicked on Blogs");
            test.info("Clicked on Blogs");
            test.log(Status.PASS, "Clicked on Blogs");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Blogs");
            test.fail("Clicked on Blogs");
            test.log(Status.FAIL, "Clicked on Blogs");
        }
    }

    /*
     * Method Name: clickOnFAQs
     * Author Name: Deekshitha
     * Description: This method clicks on FAQs, verifies URL and title, and
     * navigates back.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnFAQs() {
        try {
            helper.clickOnElement(ShippingPageLocators.faqs);
            assertion.verifyUrl("https://www.reliancejewels.com/s/faq");
            assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
            Base.driver.navigate().back();
            LoggerHandler.info("Clicked on FAQs");
            test.info("Clicked on FAQs");
            test.log(Status.PASS, "Clicked on FAQs");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on FAQs");
            test.fail("Clicked on FAQs");
            test.log(Status.FAIL, "Clicked on FAQs");
        }
    }

    /*
     * Method Name: clickOnTrackAnOrder
     * Author Name: Deekshitha
     * Description: This method clicks on Track an Order, verifies URL, title, and
     * text, and navigates back.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnTrackAnOrder() {
        try {
            helper.clickOnElement(ShippingPageLocators.trackAnOrder);
            assertion.verifyUrl("https://www.reliancejewels.com/track-your-order.html");
            assertion.verifyTitle("Reliance Jewels : Track an order");
            Base.driver.navigate().back();
            assertion.verifyText(ShippingPageLocators.fastShipping, "Fast Shipping");
            Screenshot.takeScreenshotWithTimestamp("reliancejewels");
            Reporter.addScreenshotToReport("reliancejewels", test, "Reliance jewels screenshot", Base.driver);
            LoggerHandler.info("Clicked on Track an Order");
            test.info("Clicked on Track an Order");
            test.log(Status.PASS, "Clicked on Track an Order");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Track an Order");
            test.fail("Clicked on Track an Order");
            test.log(Status.FAIL, "Clicked on Track an Order");
        }
    }

    /*
     * Method Name: TestCase2
     * Author Name: Deekshitha
     * Description: This method executes Test Case 2 by performing a series of
     * actions.
     * Return Type: void
     * Parameter List: NA
     */
    public void test8() {
        clickOnAboutUs();
        clickOnWhyReliance();
    public void clickOnAboutUs(){
       helper.clickOnElement(ShippingPageLocators.aboutUs);
        Base.driver.navigate().back();
    }
    public void clickOnWhyReliance(){
        helper.clickOnElement(ShippingPageLocators.whyReliance);
        assertion.verifyTitle("Reliance Jewels - Buy Gold & Diamond Jewellery Online For Women & Men");
        Base.driver.navigate().back();
    }
    public void clickOnCertifications(){
        helper.clickOnElement(ShippingPageLocators.certifications);
        assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
        Base.driver.navigate().back();
    }
    public void clickOnOurShowrooms(){
        helper.clickOnElement(ShippingPageLocators.ourShowRooms);
        //assertion.verifyTitle("Reliance Jewel Locator/Finder | Jewelry Store");
        Base.driver.navigate().back();
    }
    public void clickOnMedia(){
        helper.clickOnElement(ShippingPageLocators.media);
        //assertion.verifyTitle("Reliancejewels Media");
        Base.driver.navigate().back();
    }
    public void clickOnBlog(){
        helper.clickOnElement(ShippingPageLocators.blog);
        //assertion.verifyTitle("Reliance Jewels Blogs – Reliance Jewels is a part of Reliance Retail, which is amongst 'Top 10 Trusted Retail Brands In India' We have made a mark in the jewellery Retail market by offering a wide range of Gold, Diamond, Silver, and Platinum Jewellery collections. Reliance Jewels owns flagship showrooms and Shop-In-Shops and is successfully delivering a uniform customer experience throughout the nation.");
        Base.driver.navigate().back();
    }
    public void clickOnFAQs(){
        helper.clickOnElement(ShippingPageLocators.faqs);
        //assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
        Base.driver.navigate().back();
    }
    public void clickOnTrackAnOrder(){
        helper.clickOnElement(ShippingPageLocators.trackAnOrder);
        // assertion.verifyTitle("Reliance Jewels : Track an order");
        Base.driver.navigate().back();
        // assertion.verifyText(HomePageLocators_Deekshitha02.fastShipping, "Fast Shipping");
        Screenshot.takeScreenshotWithTimestamp("reliancejewels");
        Reporter.addScreenshotToReport("reliancejewels", test, "Reliance jewels screenshot",Base.driver);
    }
    public void test8(){
        clickOnAboutUs();
        clickOnTrackAnOrder();
        clickOnCertifications();
        clickOnOurShowrooms();
        clickOnMedia();
        clickOnBlog();
        clickOnFAQs();
        clickOnTrackAnOrder();
    }
}
