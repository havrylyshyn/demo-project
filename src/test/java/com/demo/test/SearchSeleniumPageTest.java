package com.demo.test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.demo.test.interfaces.GooglePage.*;
import static com.demo.test.interfaces.SeleniumPage.*;

/**
 * Created by Bohdan.Havrylyshyn on 31.07.2017.
 */

public class SearchSeleniumPageTest extends BaseTest{

    @Test
    public void gotoSeleniumPage() {
        HomePage homePage = new HomePage(driver);
        GooglePage googlePage = homePage.goToGooglePage();
        googlePage.setValue(SEARCH_FLD, "Selenium");
        googlePage.click(GOOGLE_LOGO);
        googlePage.click(SEARCH_BTN);
        SeleniumPage seleniumPage = googlePage.goToSeleniumPage();
        Assert.assertEquals(seleniumPage.isDisplayed(SELENIUM_LOGO), true);
    }

}
