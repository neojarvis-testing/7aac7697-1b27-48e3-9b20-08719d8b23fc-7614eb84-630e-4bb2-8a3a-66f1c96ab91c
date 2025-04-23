package runner;
 
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
 
import pages.CoinPageActions;
import pages.DiamondPageActions;
import pages.DropPageActions;
import pages.NecklacePageActions;
import pages.PendantPageActions;
import pages.PlatinumPageActions;
import pages.PolicyPageActions;
import pages.RingPageActions;
import pages.ShippingPageActions;
import pages.VivahamPageActions;
import utils.Base;
import utils.Reporter;
 
public class TestRunner extends Base {
    ExtentTest test;
    ExtentReports reports;
 
    @BeforeClass
    public void createReport() {
        reports = Reporter.generateTestReport("Reliance_Report");
    }
 
    @BeforeMethod
    public void openReliance() {
        openBrowser();
    }
 
    @Test(priority = 1)
    public void executeTestCase1() {
        test = reports.createTest("TestCase 1");
        RingPageActions ringObj = new RingPageActions(test);
        ringObj.test1();
    }
 
    @Test(priority = 2)
    public void executeTestCase2() {
        test = reports.createTest("TestCase 2");
        NecklacePageActions necklaceObj = new NecklacePageActions(test);
        necklaceObj.test2();
    }
 
    @Test(priority = 3)
    public void executeTestCase3() {
        test = reports.createTest("TestCase 3");
        VivahamPageActions vivahamObj = new VivahamPageActions(driver, test);
        vivahamObj.test3();
    }
 
    @Test(priority = 4)
    public void executeTestCase4() {
        test = reports.createTest("TestCase 4");
        DiamondPageActions diamondObj = new DiamondPageActions(driver, test);
        diamondObj.test4();
    }
 
    @Test(priority = 5)
    public void executeTestCase5() {
        test = reports.createTest("TestCase 5");
        DropPageActions dropObj = new DropPageActions(test);
        dropObj.test5();
    }
 
    @Test(priority = 6)
    public void executeTestCase6() {
        test = reports.createTest("TestCase 6");
        PlatinumPageActions platinumObj = new PlatinumPageActions(test);
        platinumObj.test6();
    }
 
    @Test(priority = 7)
    public void executeTestCase7() {
        test = reports.createTest("TestCase 7");
        CoinPageActions coinObj = new CoinPageActions(test);
        coinObj.test7();
    }
 
    @Test(priority = 8)
    public void executeTestCase8() {
        test = reports.createTest("TestCase 8");
        ShippingPageActions shippingObj = new ShippingPageActions(test);
        shippingObj.test8();
    }
 
    @Test(priority = 9)
    public void executeTestCase9() {
        test = reports.createTest("TestCase 9");
        PolicyPageActions policyObj = new PolicyPageActions(test);
        policyObj.test9();
    }
 
    @Test(priority = 10)
    public void executeTestCase10() {
        test = reports.createTest("TestCase 10");
        PendantPageActions pendantObj = new PendantPageActions(test);
        pendantObj.test10();
    }
 
    @AfterMethod
    public void closeReliance() {
        driver.quit();
    }
 
    @AfterClass
    public void closeReport() {
        reports.flush();
    }
}