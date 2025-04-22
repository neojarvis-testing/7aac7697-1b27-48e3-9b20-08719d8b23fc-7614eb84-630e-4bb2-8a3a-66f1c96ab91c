package pages;



import com.aventstack.extentreports.ExtentTest;

import uistore.HomePageLocators_Deekshitha02;
import utils.Assertion;
import utils.Base;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomePageActions_Deekshitha02 {
    WebDriverHelper helper;
    Assertion assertion;
    static ExtentTest test;

    public HomePageActions_Deekshitha02(ExtentTest test) {
        try {
            helper = new WebDriverHelper(Base.driver);
            assertion = new Assertion(Base.driver);
            this.test=test;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void clickOnAboutUs(){
       helper.clickOnElement(HomePageLocators_Deekshitha02.aboutUs);
        Base.driver.navigate().back();
    }
    public void clickOnWhyReliance(){
        helper.clickOnElement(HomePageLocators_Deekshitha02.whyReliance);
        assertion.verifyTitle("Reliance Jewels - Buy Gold & Diamond Jewellery Online For Women & Men");
        Base.driver.navigate().back();
    }
    public void clickOnCertifications(){
        helper.clickOnElement(HomePageLocators_Deekshitha02.certifications);
        assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
        Base.driver.navigate().back();
    }
    public void clickOnOurShowrooms(){
        helper.clickOnElement(HomePageLocators_Deekshitha02.ourShowRooms);
        //assertion.verifyTitle("Reliance Jewel Locator/Finder | Jewelry Store");
        Base.driver.navigate().back();
    }
    public void clickOnMedia(){
        helper.clickOnElement(HomePageLocators_Deekshitha02.media);
        //assertion.verifyTitle("Reliancejewels Media");
        Base.driver.navigate().back();
    }
    public void clickOnBlog(){
        helper.clickOnElement(HomePageLocators_Deekshitha02.blog);
        //assertion.verifyTitle("Reliance Jewels Blogs – Reliance Jewels is a part of Reliance Retail, which is amongst 'Top 10 Trusted Retail Brands In India' We have made a mark in the jewellery Retail market by offering a wide range of Gold, Diamond, Silver, and Platinum Jewellery collections. Reliance Jewels owns flagship showrooms and Shop-In-Shops and is successfully delivering a uniform customer experience throughout the nation.");
        Base.driver.navigate().back();
    }
    public void clickOnFAQs(){
        helper.clickOnElement(HomePageLocators_Deekshitha02.faqs);
        //assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
        Base.driver.navigate().back();
    }
    public void clickOnTrackAnOrder(){
        helper.clickOnElement(HomePageLocators_Deekshitha02.trackAnOrder);
        // assertion.verifyTitle("Reliance Jewels : Track an order");
        Base.driver.navigate().back();
        // assertion.verifyText(HomePageLocators_Deekshitha02.fastShipping, "Fast Shipping");
        Screenshot.takeScreenshotWithTimestamp("reliancejewels");
        Reporter.addScreenshotToReport("reliancejewels", test, "Reliance jewels screenshot",Base.driver);
    }
    public void TestCase2(){
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
