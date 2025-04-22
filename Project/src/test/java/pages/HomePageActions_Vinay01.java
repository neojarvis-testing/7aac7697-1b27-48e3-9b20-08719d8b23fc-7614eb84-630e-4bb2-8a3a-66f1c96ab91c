package pages;

import uistore.HomePageLocators_Vinay01;
import utils.Assertion;
import utils.Base;
import utils.WebDriverHelper;

public class HomePageActions_Vinay01 {

    WebDriverHelper helper;
    Assertion asserts;

    public HomePageActions_Vinay01() {
        helper = new WebDriverHelper(Base.driver);
        asserts = new Assertion(Base.driver);
    }

    public void validateLogo() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_Vinay01.logoCheck, 10);
            asserts.verifyLogo(HomePageLocators_Vinay01.logoCheck);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void hoverOverEarRings() {
        try {
            helper.hoverOverElement(HomePageLocators_Vinay01.earRings);
            helper.waitForTheElementToBeVisible(HomePageLocators_Vinay01.drops, 10);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void clickOnDrops() {
        try {
            helper.clickOnElement(HomePageLocators_Vinay01.drops);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void verifyDrops() {
        try {
            asserts.verifyUrl("Drops");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnCategories() {
        try {
            helper.clickOnElement(HomePageLocators_Vinay01.categories);
            helper.waitForTheElementToBeVisible(HomePageLocators_Vinay01.gold, 10);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void clickOnGold() {
        try {
            helper.clickOnElement(HomePageLocators_Vinay01.gold);
            helper.waitForTheElementToBeVisible(HomePageLocators_Vinay01.morefilters, 10);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void clickOnMoreFilters() {
        try {
            helper.clickOnElement(HomePageLocators_Vinay01.morefilters);
            helper.waitForTheElementToBeVisible(HomePageLocators_Vinay01.metalPurity, 10);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void clickMetalPurity() {
        try {
            helper.clickOnElement(HomePageLocators_Vinay01.metalPurity);
            helper.waitForTheElementToBeVisible(HomePageLocators_Vinay01.purity22kt, 10);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void clickOn22Kt() {
        try {
            helper.clickOnElement(HomePageLocators_Vinay01.purity22kt);
            helper.waitForTheElementToBeVisible(HomePageLocators_Vinay01.firstProduct, 10);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void clickOnFirstproduct() {
        try {
            helper.clickOnElement(HomePageLocators_Vinay01.firstProduct);
            helper.waitForTheElementToBeVisible(HomePageLocators_Vinay01.keyFeatures, 10);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void verifyFeatures() {
        try {
            asserts.verifyText(HomePageLocators_Vinay01.keyFeatures, "Key Features");
            helper.waitForTheElementToBeVisible(HomePageLocators_Vinay01.buyNow, 10);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnBuynow() {
        try {
            helper.clickOnElement(HomePageLocators_Vinay01.buyNow);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void test1() {
        validateLogo();
        hoverOverEarRings();
        clickOnDrops();
        verifyDrops();
        clickOnCategories();
        clickOnGold();
        clickOnMoreFilters();
        clickMetalPurity();
        clickOn22Kt();
        clickOnFirstproduct();
        verifyFeatures();
        clickOnBuynow();
    }
}
