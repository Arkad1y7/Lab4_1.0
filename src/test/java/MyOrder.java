import Units.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class MyOrder {

    public static Locators locators;

    public MyOrder(WebDriver driver){
        PageFactory.initElements(driver, this);
        locators = new Locators(driver);
    }
    public void clickOrderButton() {locators.orderButton.click();}

    public void openChecking(WebDriver browser) {
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        List<String> browserTabs = new ArrayList<String>(browser.getWindowHandles());
        browser.switchTo().window(browserTabs .get(1));
    }
    public void tabChecking(WebDriver browser){
        String expectedURL = "https://www.onetwotrip.com/ru/ticket/";
        String actualUrl = browser.getCurrentUrl();

        if(actualUrl.equals(expectedURL)){
            System.out.println("Тест пройден");
        }else{
            System.out.println("Тест не пройден");
        }
    }
}
