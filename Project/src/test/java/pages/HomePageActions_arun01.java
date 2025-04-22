package pages;

import utils.WebDriverHelper;
import uistore.HomePageLocators_arun01;
import utils.Assertion;
import utils.Base;

public class HomePageActions_arun01 {
    WebDriverHelper helper;
    Assertion asserts;

    public HomePageActions_arun01() {
        helper = new WebDriverHelper(Base.driver);
        asserts = new Assertion(Base.driver);
    }

    public void clickSearch() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun01.search, 10);
            helper.clickOnElement(HomePageLocators_arun01.search);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterRings() {
        try {
            helper.sendKeys(HomePageLocators_arun01.search, "Rings");
            helper.enterAction(HomePageLocators_arun01.search);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyRings() {
        try {
            asserts.verifyTitle("Rings");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void applyGender() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun01.gender, 10);
            helper.clickOnElement(HomePageLocators_arun01.gender);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void applyMen() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun01.men, 10);
            helper.clickOnElement(HomePageLocators_arun01.men);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void applyMetal() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun01.metal, 10);
            helper.clickOnElement(HomePageLocators_arun01.metal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void applyGold() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun01.gold, 10);
            helper.clickOnElement(HomePageLocators_arun01.gold);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickProduct() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun01.product, 10);
            helper.clickOnElement(HomePageLocators_arun01.product);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickCart() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun01.cart, 10);
            helper.clickOnElement(HomePageLocators_arun01.cart);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test1() {
        clickSearch();
        enterRings();
        applyGender();
        applyMen();
        applyMetal();
        applyGold();
        clickCart();
    }
}
