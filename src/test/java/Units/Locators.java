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

    @FindBy(xpath = "//*[contains (@name, 'email')]")
    public WebElement loginTextField;

    @FindBy(xpath = "//*[contains (@data-locator, 'Button profileLogin')]")
    public WebElement personalArea;

    @FindBy(xpath = "//*[contains (@name, 'password')]")
    public WebElement passwordTextField;

    @FindBy(xpath = "//*[contains(@data-locator, 'Button SigninForm--submit')]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[contains(text(), 'Неверный адрес электронной почты')]")
    public WebElement labelTextError;

    @FindBy(xpath = "//*[@class = '_3DD68'][6]")
    public WebElement orderButton;

    @FindBy(xpath = "//*[@class = \"NdQaF\"][3]")
    public WebElement appGallery;
}
