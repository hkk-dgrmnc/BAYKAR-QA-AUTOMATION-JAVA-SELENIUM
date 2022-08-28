import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;


public class HomePageSteps extends BaseTest {


    public HomePage homePage;
    public LoginPage loginPage;


    @BeforeStep
    public void getAlls() {

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);

    }

    @Step("TC2.1 : Go Login Page and Check it.")
    public void clickHomeLoginButon() throws InterruptedException {
        homePage.clickEnterForLoginPage();

    }

}