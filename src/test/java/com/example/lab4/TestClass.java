package com.example.lab4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TestClass {
    public static LoginPage loginPage;
    private static WebDriver browser;
    @Before
    public void setup() {
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        browser.get(ConfProperties.getProperty("loginpage"));

    }
    @Test
    public void loginTest() {
        loginPage = new LoginPage(browser);
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
