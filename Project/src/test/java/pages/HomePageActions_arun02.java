package pages;

import uistore.HomePageLocators_arun02;
import utils.Assertion;
import utils.Base;
import utils.WebDriverHelper;

public class HomePageActions_arun02 {
    WebDriverHelper helper;
    Assertion asserts;

    public HomePageActions_arun02() {
        helper = new WebDriverHelper(Base.driver);
    }

    public void clickSearch() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun02.search, 10);
            helper.clickOnElement(HomePageLocators_arun02.search);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterNecklace() {
        try {
            helper.sendKeys(HomePageLocators_arun02.search, "Necklace");
            helper.enterAction(HomePageLocators_arun02.search);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyNecklace() {
        try {
            asserts.verifyText(HomePageLocators_arun02.necklaceText, "Necklace");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hoverProduct() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun02.necklace, 15);
            helper.hoverOverElement(HomePageLocators_arun02.necklace);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickQuickView() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun02.quick, 10);
            helper.clickOnElement(HomePageLocators_arun02.quick);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickPopup() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun02.close, 10);
            helper.clickOnElement(HomePageLocators_arun02.close);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickNecklaceProduct() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun02.necklace, 10);
            helper.clickOnElement(HomePageLocators_arun02.necklace);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectWeight() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun02.weight, 10);
            helper.clickOnElement(HomePageLocators_arun02.weight);
            helper.selectDropDown(HomePageLocators_arun02.weight, "Gross Weight-2.34g");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickBuyNow() {
        try {
            helper.waitForTheElementToBeVisible(HomePageLocators_arun02.buy, 10);
            helper.clickOnElement(HomePageLocators_arun02.buy);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test2() {
        clickSearch();
        enterNecklace();
        verifyNecklace();
        hoverProduct();
        clickPopup();
        clickNecklaceProduct();
        selectWeight();
        clickBuyNow();
    }
}
