package uistore;

import org.openqa.selenium.By;

public class HomePageLocators_arun02 {
    public static By search = By.xpath("//input[@id='q']");
    public static By necklace = By.xpath("(//p[@class='product_image'])[1]//img");
    public static By quick = By.xpath("(//a[text()='QUICK VIEW'])[1]");
    public static By weight = By.xpath("//select[@class='form-select selectsize']");
    public static By close = By.xpath("//a[@class='fancybox-item fancybox-close']");
    public static By buy = By.xpath("(//a[@id='btnBuyNow'])[2]");
    public static By necklaceText = By.xpath("//span[@id='breadcrumbNavigationLast']");
}
