import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class TestMain {
    private static WebDriver browser;

    @Before
    public void setup() {
        browser = new FirefoxDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
    @Test
    public void orderTest() {
        MyOrder myOrder = new MyOrder(browser);
        myOrder.clickOrderButton();
        myOrder.openChecking(browser);
        myOrder.tabChecking(browser);
    }

    @Test
    public void scrollingTest(){
        Scrolling scrolling = new Scrolling(browser);
        scrolling.scrollDown((FirefoxDriver) browser);
        scrolling.click();
        scrolling.openChecking(browser);
        scrolling.tabChecking(browser);
    }
    @After
    public void tearDown() {
        browser.quit();

    }
}
