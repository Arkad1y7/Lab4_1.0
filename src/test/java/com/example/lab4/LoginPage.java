package com.example.lab4;

import Units.Locators;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        locators = new Locators(driver);
    }

    public static Locators locators;

    public void inputLogin(String login) {locators.loginTextField.sendKeys(login);}
    public void inputPassword(String password) {locators.passwordTextField.sendKeys(password);}
    public void clickPersonalArea() {locators.personalArea.click();}
    public void clickLoginButton() {locators.LoginButton.click();}
    public void errorChecking() {
        Assertions.assertEquals(locators.labelTextError.getText(), "Неверный адрес электронной почты");
    }
}
