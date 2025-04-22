package uistore;

import org.openqa.selenium.By;

public class HomePageLocators_arun01 {
    public static By search = By.xpath("//input[@id='q']");
    public static By gender = By.xpath("//div[text()='Gender']");
    public static By men = By.xpath("//a[text()=' Men ']");
    public static By metal = By.xpath("//div[text()='Metal']");
    public static By gold = By.xpath("//a[text()=' Gold ']");
    public static By product = By.xpath("(//p[@class='product_image'])[1]//img");
    public static By cart = By.xpath("(//a[@id='btnBuyNow'])[1]");
}
