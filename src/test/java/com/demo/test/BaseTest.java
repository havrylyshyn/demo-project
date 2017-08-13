package com.demo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by Bohdan.Havrylyshyn on 31.07.2017.
 */

public class BaseTest {

    public WebDriver driver;
    private String geckoDriverPath = PropertyLoader.loadProperty("geckoDriver.path");
    private String chromeDriverPath = PropertyLoader.loadProperty("chromeDriver.path");
    private String ieDriverPath = PropertyLoader.loadProperty("ieDriver.path");

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", geckoDriverPath);
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
