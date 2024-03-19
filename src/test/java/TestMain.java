import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestMain {
    private static WebDriver browser;
    @Before
    public void setup() {
        browser = new FirefoxDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
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
