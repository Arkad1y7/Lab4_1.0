package com.example.lab4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Main {
    public static LoginPage loginPage;
    public static WebDriver driver;
    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver",ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("loginpage"));

    }
    @Test
    public void loginTest() {
        loginPage = new LoginPage(driver);
        loginPage.clickPersonalArea();
        loginPage.inputLogin("test");
        loginPage.inputPassword("test");
        loginPage.clickLoginButton();
        loginPage.errorChecking();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
