package uistore;

import org.openqa.selenium.By;

public class PendantPageLocators {
    public static By pendants=By.xpath("//a[text()='PENDANTS']");
    public static By gifting=By.xpath("(//a[text()='Gifting'])[3]");
    public static By gender=By.xpath("//div[text()='Gender']");
    public static By kids=By.xpath("//a[text()=' Kids ']");
    public static By moreFilters=By.cssSelector("#myBtn");
    public static By type=By.cssSelector("#filter_4");
    public static By checkBoxPendant = By.xpath("(//div[@class='ez-checkbox'])[5]");
    public static By firstProduct=By.xpath("//a[text()='18 Karat Gold Pendant']");
    public static By addToCart=By.xpath("(//a[@title='Buy 18 Karat Gold Pendant'])[1]");
}
