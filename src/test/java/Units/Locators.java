package Units;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators {
    public WebDriver driver;
    public Locators(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body[@class='appContainer']/div[@class='Lisl6 modal']/div[@class='BU7s4']/div[@class='_9vOEs OJYla']/div[@class='TwHhH aV4fh']/div[@class='wedma']/div[@class='ww4qi']/form/div[@class='feElt'][1]/label[@class='_5-8Ry PBeyC CTM7X hwZgG']/div[@class='DPoZ5']/input[@class='GaXkX']")
    public WebElement loginTextField;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/header/div/div[2]/div[2]/div/button")
    public WebElement personalArea;

    @FindBy(xpath = "/html/body[@class='appContainer']/div[@class='Lisl6 modal']/div[@class='BU7s4']/div[@class='_9vOEs OJYla']/div[@class='TwHhH aV4fh']/div[@class='wedma']/div[@class='ww4qi']/form/div[@class='feElt'][2]/label[@class='_5-8Ry PBeyC CTM7X']/div[@class='DPoZ5']/input[@class='GaXkX']")
    public WebElement passwordTextField;

    @FindBy(xpath = "//*[contains(@data-locator, 'Button SigninForm--submit')]")
    public WebElement LoginButton;

    @FindBy(xpath = "/html/body[@class='appContainer']/div[@class='Lisl6 modal']/div[@class='BU7s4']/div[@class='_9vOEs OJYla']/div[@class='TwHhH aV4fh']/div[@class='wedma']/div[@class='ww4qi']/form/div[9]/div/div[@class='bwJ4A AWvFV']/div[@class='ssXpn']/div[@class='text']")
    public WebElement labelTextError;
}
