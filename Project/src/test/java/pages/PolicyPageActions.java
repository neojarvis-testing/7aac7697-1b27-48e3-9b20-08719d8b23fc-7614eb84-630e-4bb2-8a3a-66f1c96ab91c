package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.PolicyPageLocators;

import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class PolicyPageActions {
    WebDriverHelper helper;
    ExtentTest test;
    Assertion assertion;

    public PolicyPageActions(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        assertion = new Assertion(Base.driver);
        this.test = test;

    }
    /*
     * Method Name: clickOnReturnRefund
     * Author Name: Shambhavi
     * Description: This method clicks on the "Return and Refund Policy" section.
     * Return Type: void
     * Parameter List: NA
     */
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
            assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
            assertion.verifyUrl("https://www.reliancejewels.com/s/return-policy");
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

    /*
     * Method Name: clickOnShippingPolicy
     * Author Name: Shambhavi
     * Description: This method clicks on the "Shipping Policy" section.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnShippingPolicy() {
        try {
            helper.waitForTheElementToBeVisible(PolicyPageLocators.shippingPolicy, 10);
            helper.clickOnElement(PolicyPageLocators.shippingPolicy);
            LoggerHandler.info("clicked on Shipping Policy");
            test.info("clicked on Shipping Policy");
            test.log(Status.PASS, "clicked on Shipping Policy");
            assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
            assertion.verifyUrl("https://www.reliancejewels.com/s/shipping-policy");
            test.log(Status.PASS, "clicked on Shipping Policy");  
            // ast.verifyTitle();
            // ast.verifyUrl("https://www.reliancejewels.com/s/shipping-policy");
        } catch (Exception e) {
            LoggerHandler.error("clicked on Shipping policy");
            test.fail("clicked on Shipping policy");
            test.log(Status.FAIL, "clicked on Shipping policy");
        }
    }
    /*
     * Method Name: clickOnPrivacyPolicy
     * Author Name: Shambhavi
     * Description: This method clicks on the "Privacy Policy" section.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnPrivacyPolicy() {
        try {
            helper.waitForTheElementToBeVisible(PolicyPageLocators.privacyPolicy, 10);
            helper.clickOnElement(PolicyPageLocators.privacyPolicy);
            LoggerHandler.info("clicked on Privacy policy");
            test.info("clicked on Privacy policy");
            test.log(Status.PASS, "clicked on Privacy policy");
            assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
            assertion.verifyUrl("https://www.reliancejewels.com/s/privacy-policy");
            test.log(Status.PASS, "clicked on Privacy policy");  
            // ast.verifyTitle();
            // ast.verifyUrl("https://www.reliancejewels.com/s/privacy-policy");
        } catch (Exception e) {
            LoggerHandler.error("clicked on Privacy policy");
            test.fail("clicked on Privacy policy");
            test.log(Status.FAIL, "clicked on Privacy policy");
        }
    }
    /*
     * Method Name: clickOnExchange
     * Author Name: Shambhavi
     * Description: This method clicks on the "Old Gold Exchange Policy" section.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnExchange() {
        try {
            helper.waitForTheElementToBeVisible(PolicyPageLocators.oldGoldExchangePolicy, 10);
            helper.clickOnElement(PolicyPageLocators.oldGoldExchangePolicy);
            LoggerHandler.info("clicked on Old Gold Exchange Policy");
            test.info("clicked on Old Gold Exchange Policy");
            test.log(Status.PASS, "clicked on Old Gold Exchange Policy");
            assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
            assertion.verifyUrl("https://www.reliancejewels.com/s/OldGoldExchange");

            test.log(Status.PASS, "clicked on Old Gold Exchange Policy");  
            // ast.verifyTitle(null);
            // ast.verifyUrl("https://www.reliancejewels.com/s/OldGoldExchange");
        } catch (Exception e) {
            LoggerHandler.error("clicked on Old Gold Exchange Policy");
            test.fail("clicked on Old Gold Exchange Policy");
            test.log(Status.FAIL, "clicked on Old Gold Exchange Policy");
        }
    }
    /*
     * Method Name: clickOnfeesAndPaymentPolicy
     * Author Name: Shambhavi
     * Description: This method clicks on the "Fees and Payments Policy" section.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnfeesAndPaymentPolicy() {
        try {
            helper.waitForTheElementToBeVisible(PolicyPageLocators.feesAndPaymentsPolicy, 10);
            helper.clickOnElement(PolicyPageLocators.feesAndPaymentsPolicy);
            LoggerHandler.info("clicked on Fees and Payments policy");
            test.info("clicked on Fees and Payments policy");
            test.log(Status.PASS, "clicked on Fees and Payments policy");
            assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
            assertion.verifyUrl("https://www.reliancejewels.com/s/feesandpayments-policy");
            test.log(Status.PASS, "clicked on Fees and Payments policy");  
            // ast.verifyTitle(null);
            // ast.verifyUrl("https://www.reliancejewels.com/s/feesandpayments-policy");
        } catch (Exception e) {
            LoggerHandler.error("clicked on Fees and Payments policy");
            test.fail("clicked on Fees and Payments policy");
            test.log(Status.FAIL, "clicked on Fees and Payments policy");
        }
    }
    /*
     * Method Name: clickOnTermsandConditions
     * Author Name: Shambhavi
     * Description: This method clicks on the "Terms and Conditions" section.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnTermsandConditions() {
        try {
            helper.waitForTheElementToBeVisible(PolicyPageLocators.termsAndConditions, 10);
            helper.clickOnElement(PolicyPageLocators.termsAndConditions);
            LoggerHandler.info("clicked on Terms and Conditions");
            test.info("clicked on Terms and Conditions");
            test.log(Status.PASS, "clicked on Terms and Conditions");
            assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
            assertion.verifyUrl("https://www.reliancejewels.com/s/tandc-policy");
            test.log(Status.PASS, "clicked on Terms and Conditions");  
            // ast.verifyTitle();
            // ast.verifyUrl("https://www.reliancejewels.com/s/tandc-policy");
        } catch (Exception e) {
            LoggerHandler.error("clicked on Terms and Conditions");
            test.fail("clicked on Terms and Conditions");
            test.log(Status.FAIL, "clicked on Terms and Conditions");
        }
    }
    /*
     * Method Name: clickOnRelianceLoyalty
     * Author Name: Shambhavi
     * Description: This method clicks on the "RelianceOne Loyalty T & C" section.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickOnRelianceLoyalty() {
        try {
            helper.waitForTheElementToBeVisible(PolicyPageLocators.relianceLoyalty, 10);
            helper.clickOnElement(PolicyPageLocators.relianceLoyalty);
            LoggerHandler.info("clicked on RelianceOne Loyalty T & C");
            test.info("clicked on RelianceOne Loyalty T & C");
            test.log(Status.PASS, "clicked on RelianceOne Loyalty T & C");
            assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
            assertion.verifyUrl("ttps://www.reliancejewels.com/s/rone-tc");
            test.log(Status.PASS, "clicked on RelianceOne Loyalty T & C");  
            // ast.verifyTitle();
            // ast.verifyUrl("ttps://www.reliancejewels.com/s/rone-tc");
        } catch (Exception e) {
            LoggerHandler.error("clicked on RelianceOne Loyalty T & C");
            test.fail("clicked on RelianceOne Loyalty T & C");
            test.log(Status.FAIL, "clicked on RelianceOne Loyalty T & C");
        }
    }
    /*
     * Method Name: clickOnDisclaimer
     * Author Name: Shambhavi
     * Description: This method clicks on the "Disclaimer" section.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnDisclaimer() {
        try {
            helper.waitForTheElementToBeVisible(PolicyPageLocators.disclaimer, 10);
            helper.clickOnElement(PolicyPageLocators.disclaimer);
            LoggerHandler.info("clicked on Disclaimer");
            test.info("clicked on Disclaimer");
            test.log(Status.PASS, "clicked on Disclaimer");
            assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
            assertion.verifyUrl("https://www.reliancejewels.com/s/disclaimer");
            test.log(Status.PASS, "clicked on Disclaimer");  
            // ast.verifyTitle();
            // ast.verifyUrl("https://www.reliancejewels.com/s/disclaimer");

        } catch (Exception e) {
            LoggerHandler.error("clicked on Disclaimer");
            test.fail("clicked on Disclaimer");
            test.log(Status.FAIL, "clicked on Disclaimer");
        }
    }
    /*
     * Method Name: verify
     * Author Name: Shambhavi
     * Description: This method verifies the presence of the keyword "Call Back" and
     * takes a screenshot.
     * Return Type: void
     * Parameter List: NA
     */
    public void verify() {
        try {
            assertion.verifyText(PolicyPageLocators.callBack, "Call Back");
            Screenshot.takeScreenshotWithTimestamp("POLICIES");
            LoggerHandler.info("Verified keyword Call Back");
            test.info("Verified keyword Call Back");
            test.log(Status.PASS, "Verified keyword Call Back");

        } catch (Exception e) {
            LoggerHandler.error("Verified keyword Call Back");
            test.fail("Verified keyword Call Back");
            test.log(Status.FAIL, "Verified keyword Call Back");
        }
    }

    /*
     * Method Name: testCase9
     * Author Name: Shambhavi
     * Description: This method executes test case 9 by clicking on various policy
     * sections and performing verification.
     * Return Type: void
     * Parameter List: NA
     */
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
