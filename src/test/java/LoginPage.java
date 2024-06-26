import Units.Locators;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public static Locators locators;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        locators = new Locators(driver);
    }


    public void inputLogin(String login) {locators.loginTextField.sendKeys(login);}
    public void inputPassword(String password) {locators.passwordTextField.sendKeys(password);}
    public void clickPersonalArea() {locators.personalArea.click();}
    public void clickLoginButton() {locators.loginButton.click();}
    public void errorChecking() {
        Assert.assertEquals(locators.labelTextError.getText(), "Неверный адрес электронной почты");
    }
}
