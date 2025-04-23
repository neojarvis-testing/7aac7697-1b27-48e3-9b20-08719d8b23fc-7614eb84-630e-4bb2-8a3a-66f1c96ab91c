package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.PolicyPageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class PolicyPageActions {
    WebDriverHelper helper;
    ExtentTest test;
    public PolicyPageActions(ExtentTest test) {
            helper = new WebDriverHelper(Base.driver);
            this.test=test;
            
    }

    public void clickOnReturnRefund() {
        try {
            helper.waitForTheElementToBeVisible(PolicyPageLocators.returnAndrefund, 10);
            helper.clickOnElement(PolicyPageLocators.returnAndrefund);
            LoggerHandler.info("clicked on Return and Refund Policy");
            test.info("clicked on Return and Refund Policy");
            test.log(Status.PASS, "clicked on Return and Refund Policy");  
            // assertion.verifyTitle("Best Online Shopping Offers In India - Reliance
            // Jewels");
            // assertion.verifyUrl("https://www.reliancejewels.com/s/return-policy");

        } catch (Exception e) {
            LoggerHandler.error("clicked on Return and Refund Policy");
            test.fail("clicked on Return and Refund Policy");
            test.log(Status.FAIL, "clicked on Return and Refund Policy");
        }

    }

    public void clickOnShippingPolicy() {
        try {
            helper.waitForTheElementToBeVisible(PolicyPageLocators.shippingPolicy, 10);
            helper.clickOnElement(PolicyPageLocators.shippingPolicy);
            LoggerHandler.info("clicked on Shipping Policy");
            test.info("clicked on Shipping Policy");
            test.log(Status.PASS, "clicked on Shipping Policy");  
            // ast.verifyTitle();
            // ast.verifyUrl("https://www.reliancejewels.com/s/shipping-policy");
        } catch (Exception e) {
            LoggerHandler.error("clicked on Shipping policy");
            test.fail("clicked on Shipping policy");
            test.log(Status.FAIL, "clicked on Shipping policy");
        }
    }

    public void clickOnPrivacyPolicy() {
        try {
            helper.waitForTheElementToBeVisible(PolicyPageLocators.privacyPolicy, 10);
            helper.clickOnElement(PolicyPageLocators.privacyPolicy);
            LoggerHandler.info("clicked on Privacy policy");
            test.info("clicked on Privacy policy");
            test.log(Status.PASS, "clicked on Privacy policy");  
            // ast.verifyTitle();
            // ast.verifyUrl("https://www.reliancejewels.com/s/privacy-policy");
        } catch (Exception e) {
            LoggerHandler.error("clicked on Privacy policy");
            test.fail("clicked on Privacy policy");
            test.log(Status.FAIL, "clicked on Privacy policy");
        }
    }

    public void clickOnExchange() {
        try {
            helper.waitForTheElementToBeVisible(PolicyPageLocators.oldGoldExchangePolicy, 10);
            helper.clickOnElement(PolicyPageLocators.oldGoldExchangePolicy);
            LoggerHandler.info("clicked on Old Gold Exchange Policy");
            test.info("clicked on Old Gold Exchange Policy");
            test.log(Status.PASS, "clicked on Old Gold Exchange Policy");  
            // ast.verifyTitle(null);
            // ast.verifyUrl("https://www.reliancejewels.com/s/OldGoldExchange");
        } catch (Exception e) {
            LoggerHandler.error("clicked on Old Gold Exchange Policy");
            test.fail("clicked on Old Gold Exchange Policy");
            test.log(Status.FAIL, "clicked on Old Gold Exchange Policy");
        }
    }

    public void clickOnfeesAndPaymentPolicy() {
        try {
            helper.waitForTheElementToBeVisible(PolicyPageLocators.feesAndPaymentsPolicy, 10);
            helper.clickOnElement(PolicyPageLocators.feesAndPaymentsPolicy);
            LoggerHandler.info("clicked on Fees and Payments policy");
            test.info("clicked on Fees and Payments policy");
            test.log(Status.PASS, "clicked on Fees and Payments policy");  
            // ast.verifyTitle(null);
            // ast.verifyUrl("https://www.reliancejewels.com/s/feesandpayments-policy");
        } catch (Exception e) {
            LoggerHandler.error("clicked on Fees and Payments policy");
            test.fail("clicked on Fees and Payments policy");
            test.log(Status.FAIL, "clicked on Fees and Payments policy");
        }
    }

    public void clickOnTermsandConditions() {
        try {
            helper.waitForTheElementToBeVisible(PolicyPageLocators.termsAndConditions, 10);
            helper.clickOnElement(PolicyPageLocators.termsAndConditions);
            LoggerHandler.info("clicked on Terms and Conditions");
            test.info("clicked on Terms and Conditions");
            test.log(Status.PASS, "clicked on Terms and Conditions");  
            // ast.verifyTitle();
            // ast.verifyUrl("https://www.reliancejewels.com/s/tandc-policy");
        } catch (Exception e) {
            LoggerHandler.error("clicked on Terms and Conditions");
            test.fail("clicked on Terms and Conditions");
            test.log(Status.FAIL, "clicked on Terms and Conditions");
        }
    }

    public void clickOnRelianceLoyalty() {
        try {
            helper.waitForTheElementToBeVisible(PolicyPageLocators.relianceLoyalty, 10);
            helper.clickOnElement(PolicyPageLocators.relianceLoyalty);
            LoggerHandler.info("clicked on RelianceOne Loyalty T & C");
            test.info("clicked on RelianceOne Loyalty T & C");
            test.log(Status.PASS, "clicked on RelianceOne Loyalty T & C");  
            // ast.verifyTitle();
            // ast.verifyUrl("ttps://www.reliancejewels.com/s/rone-tc");
        } catch (Exception e) {
            LoggerHandler.error("clicked on RelianceOne Loyalty T & C");
            test.fail("clicked on RelianceOne Loyalty T & C");
            test.log(Status.FAIL, "clicked on RelianceOne Loyalty T & C");
        }
    }

    public void clickOnDisclaimer() {
        try {
            helper.waitForTheElementToBeVisible(PolicyPageLocators.disclaimer, 10);
            helper.clickOnElement(PolicyPageLocators.disclaimer);
            LoggerHandler.info("clicked on Disclaimer");
            test.info("clicked on Disclaimer");
            test.log(Status.PASS, "clicked on Disclaimer");  
            // ast.verifyTitle();
            // ast.verifyUrl("https://www.reliancejewels.com/s/disclaimer");

        } catch (Exception e) {
            LoggerHandler.error("clicked on Disclaimer");
            test.fail("clicked on Disclaimer");
            test.log(Status.FAIL, "clicked on Disclaimer");
        }
    }

    public void test9() {
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
