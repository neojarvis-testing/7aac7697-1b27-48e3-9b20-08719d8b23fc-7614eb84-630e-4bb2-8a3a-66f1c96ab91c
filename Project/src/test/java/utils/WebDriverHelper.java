package utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverHelper {
    public WebDriver driver;

    public List<WebElement> getElementsByPath(By locator) {

        List<WebElement> elements = new ArrayList<>();
        try {
            elements = driver.findElements(locator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return elements;
    }

    public void iterate(String text, By locator) {
        try {
            List<WebElement> products = getElementsByPath(locator);
            for (WebElement product : products) {
                String label = product.getText();
                if (label.contains(text)) {
                    product.click();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hoverOverElement(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void selectDropDown(By locator,String str){
        try {
            WebElement element=driver.findElement(locator);
            Select dropdown=new Select(element);
            dropdown.selectByVisibleText(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
      
    }
}
