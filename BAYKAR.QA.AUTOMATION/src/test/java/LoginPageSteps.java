import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;


public class LoginPageSteps extends BaseTest {


    public HomePage homePage;
    public LoginPage loginPage;


    @BeforeStep
    public void getAlls() {

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);

    }
    @Step("Fill gmail <gmail> and password <password> informations .")
    public void fillLoginInformation(String gmail,String password) throws InterruptedException {
        loginPage.addLoginInformation(gmail,password);
    }
    @Step("Click Captcha .")
    public void clickCaptcha() throws InterruptedException {
        loginPage.clickCaptcha();
    }
    @Step("Click Enter .")
    public void clickEnter() throws InterruptedException {
        loginPage.clickEnter();

    }
}
