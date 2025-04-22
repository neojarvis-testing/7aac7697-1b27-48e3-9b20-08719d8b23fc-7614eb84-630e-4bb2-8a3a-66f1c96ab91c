package pages;

import org.openqa.selenium.WebDriver;

import uistore.HomePageLocators_Deekshitha01;
import utils.Assertion;
import utils.Base;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomePageActions_Deekshitha01 {
    WebDriverHelper helper;
    Assertion assertion;

    public HomePageActions_Deekshitha01() {
        try {
            helper = new WebDriverHelper(Base.driver);
            assertion = new Assertion(Base.driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnCoins() {
        try {
            // assertion.verifyLogo(HomePageLocators_Deekshitha01.logo);
            //assertion.verifyLogo(HomePageLocators_Deekshitha01.logo);
            helper.hoverOverElement(HomePageLocators_Deekshitha01.coins);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnSilver() {
        try {
            helper.clickOnElement(HomePageLocators_Deekshitha01.silver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnGender() {
        try {
            // assertion.verifyText(HomePageLocators_Deekshitha01.categories, "categories");
            //assertion.verifyText(HomePageLocators_Deekshitha01.categories, "categories");
            helper.clickOnElement(HomePageLocators_Deekshitha01.gender);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnWomen() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_Deekshitha01.women,10);
            helper.clickOnElement(HomePageLocators_Deekshitha01.women);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnMoreFilters() {
        try {
            helper.clickOnElement(HomePageLocators_Deekshitha01.morefilters);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnTryOnAvailable() {
        try {
            helper.clickOnElement(HomePageLocators_Deekshitha01.tryOnAvailable);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnYes() {
        try {
            helper.clickOnElement(HomePageLocators_Deekshitha01.yes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnFirstProduct() {
        try {
            helper.clickOnElement(HomePageLocators_Deekshitha01.firstProduct);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnBuyNow() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_Deekshitha01.productCode, 10);
            helper.clickOnElement(HomePageLocators_Deekshitha01.buyNow);
            // assertion.verifyText(HomePageLocators_Deekshitha01.productCode, "508198");
            //assertion.verifyText(HomePageLocators_Deekshitha01.productCode, "508198");
            Screenshot.takeScreenshotWithTimestamp("Screenshot1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void TestCase1() {
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
