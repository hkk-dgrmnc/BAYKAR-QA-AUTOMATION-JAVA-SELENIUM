import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class HomePage extends BasePage {

    private final By enterButtonlocator = new By.ByCssSelector("div.button>ul>li>a");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickEnterForLoginPage() {

        getAllButtons().get(1).click();

    }





    private List<WebElement> getAllButtons() {
        return findAll(enterButtonlocator);
    }
}