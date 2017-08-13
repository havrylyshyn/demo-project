package com.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Bohdan.Havrylyshyn on 31.07.2017.
 */

public class GooglePage extends BasePage implements com.demo.test.interfaces.GooglePage{

    public WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void setValue(By locator, String value) {
        driver.findElement(locator).sendKeys(value);
    }

    public SeleniumPage goToSeleniumPage() {
        driver.findElement(SELENIUM_PAGE).click();
        return new SeleniumPage(driver);
    }

}
