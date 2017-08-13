package com.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Bohdan.Havrylyshyn on 04.08.2017.
 */
public class SeleniumPage extends BasePage {

    public WebDriver driver;

    public SeleniumPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDisplayed(By locator) {
       return driver.findElement(locator).isDisplayed();
    }
}
