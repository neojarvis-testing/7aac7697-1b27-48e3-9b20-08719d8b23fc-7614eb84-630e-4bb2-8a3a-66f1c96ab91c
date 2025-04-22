package pages;

import uistore.HomePageLocators_Shambhavi01;
//import utils.Assertion;
import utils.Base;
import utils.WebDriverHelper;

public class HomePageActions_Shambhavi01 {
    WebDriverHelper helper;

    // Assertion assertion;
    public HomePageActions_Shambhavi01() {
        try {
            helper = new WebDriverHelper(Base.driver);
            // assertion=new Assertion(Base.driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnReturnRefund() {
        try {
            helper.clickOnElement(HomePageLocators_Shambhavi01.returnAndrefund);
            // assertion.verifyTitle("Best Online Shopping Offers In India - Reliance
            // Jewels");
            // assertion.verifyUrl("https://www.reliancejewels.com/s/return-policy");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void clickOnShippingPolicy() {
        try {
            helper.clickOnElement(HomePageLocators_Shambhavi01.shippingPolicy);
            // ast.verifyTitle();
            // ast.verifyUrl("https://www.reliancejewels.com/s/shipping-policy");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnPrivacyPolicy() {
        try {
            helper.clickOnElement(HomePageLocators_Shambhavi01.privacyPolicy);
            // ast.verifyTitle();
            // ast.verifyUrl("https://www.reliancejewels.com/s/privacy-policy");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnExchange() {
        try {
            helper.clickOnElement(HomePageLocators_Shambhavi01.oldGoldExchangePolicy);
            // ast.verifyTitle(null);
            // ast.verifyUrl("https://www.reliancejewels.com/s/OldGoldExchange");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnfeesAndPaymentPolicy() {
        try {
            helper.clickOnElement(HomePageLocators_Shambhavi01.feesAndPaymentsPolicy);
            // ast.verifyTitle(null);
            // ast.verifyUrl("https://www.reliancejewels.com/s/feesandpayments-policy");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnTermsandConditions() {
        try {
            helper.clickOnElement(HomePageLocators_Shambhavi01.termsAndConditions);
            // ast.verifyTitle();
            // ast.verifyUrl("https://www.reliancejewels.com/s/tandc-policy");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnRelianceLoyalty() {
        try {
            helper.clickOnElement(HomePageLocators_Shambhavi01.relianceLoyalty);
            // ast.verifyTitle();
            // ast.verifyUrl("ttps://www.reliancejewels.com/s/rone-tc");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnDisclaimer() {
        try {
            helper.clickOnElement(HomePageLocators_Shambhavi01.disclaimer);
            // ast.verifyTitle();
            // ast.verifyUrl("https://www.reliancejewels.com/s/disclaimer");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testcase1() {
        clickOnReturnRefund();
        clickOnShippingPolicy();
        clickOnPrivacyPolicy();
        clickOnExchange();
        clickOnfeesAndPaymentPolicy();
        clickOnTermsandConditions();
        clickOnRelianceLoyalty();
        clickOnDisclaimer();

    }

}
