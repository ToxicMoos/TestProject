package com.ilcarro.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app/search");
    }
    @Test
    public void openIlcarroWebSite() {
        System.out.println("Site is opened!");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    //update from Sergey

}
