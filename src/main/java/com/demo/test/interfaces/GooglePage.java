package com.demo.test.interfaces;

import org.openqa.selenium.By;

/**
 * Created by Bohdan.Havrylyshyn on 04.08.2017.
 */
public interface GooglePage {

    By GOOGLE_LOGO = By.xpath(".//div[@title='Google']");
    By SELENIUM_PAGE = By.xpath(".//a[@href='http://www.seleniumhq.org/']");
    By SEARCH_FLD = By.xpath(".//div//input[@id='lst-ib']");
    By SEARCH_BTN = By.xpath(".//div//input[@name='btnK']");
}
