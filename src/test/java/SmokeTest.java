import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class SmokeTest {
    private static WebDriver browser;
    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/arkadi/Documents/chromedriver-mac-arm64/chromedriver");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        browser.get("https://www.onetwotrip.com/");

    }
    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(browser);
        loginPage.clickPersonalArea();
        loginPage.inputLogin("test");
        loginPage.inputPassword("test");
        loginPage.clickLoginButton();
        loginPage.errorChecking();
    }

    @After
    public void tearDown() {
        browser.quit();
    }
}
