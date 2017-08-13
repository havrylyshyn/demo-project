package com.demo.test;

import org.openqa.selenium.WebDriver;

/**
 * Created by Bohdan.Havrylyshyn on 02.08.2017.
 */

public class HomePage extends BasePage {

    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public GooglePage goToGooglePage() {
        driver.get("https://google.com/");
        return new GooglePage(driver);
    }
}
