import Units.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Scrolling {
    public static Locators locators;
    public Scrolling(WebDriver browser){
        PageFactory.initElements(browser, this);
        locators = new Locators(browser);
    }

    public void scrollDown(FirefoxDriver browser){
        browser.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    public void click(){ locators.appGallery.click(); }
    public void openChecking(WebDriver browser) {
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        List<String> browserTabs = new ArrayList<String>(browser.getWindowHandles());
        browser.switchTo().window(browserTabs .get(1));
    }

    public void tabChecking(WebDriver browser){
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));
        String expectedURL = "https://appgallery.huawei.com/app/C103308519?sharePrepath=ag&channelId=Website&id=5b4f8c4b34f44a3e9841688b730a99c9&s=4752CFF79DF3BAE0F7A7372E6AC3F9BAEF20DD6CF61B1E60AB603FE54D752CB3&detailType=0&v=";
        wait.until(ExpectedConditions.urlToBe(expectedURL));
        String actualUrl = browser.getCurrentUrl();

        if(actualUrl.equals(expectedURL)){
            System.out.println("Тест пройден");
        }else{
            System.out.println("Тест не пройден");
        }
    }
}
