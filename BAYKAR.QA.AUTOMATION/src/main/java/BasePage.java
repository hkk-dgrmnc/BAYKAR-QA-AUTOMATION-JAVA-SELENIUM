

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;


public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;

    }

    public WebElement find(By locator) {

        return driver.findElement(locator);
    }


    public List<WebElement> findAll(By locator) {
        return driver.findElements(locator);


    }


}