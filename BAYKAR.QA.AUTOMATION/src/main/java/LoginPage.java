import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class LoginPage extends BasePage {

    private final By userNameLocator = new By.ByCssSelector("input[name='login']");
    private final By passwordLocator = new By.ByCssSelector("input[name='password']");
    private final By captchaCheckboxLocator = new By.ByCssSelector("[style='width: 304px; height: 78px;'] > div > iframe");
    private final By enterButtonLocator = By.id("kt_sign_in_submit");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void addLoginInformation(String gmail, String password) throws InterruptedException {


        find(userNameLocator).sendKeys(gmail);
        find(passwordLocator).sendKeys(password);
        Thread.sleep(3000);

    }
    public void clickCaptcha() throws InterruptedException {
        find(captchaCheckboxLocator).click();
        Thread.sleep(3000);
    }
    public void clickEnter() throws InterruptedException {
        find(enterButtonLocator).click();
        Thread.sleep(3000);
    }
}