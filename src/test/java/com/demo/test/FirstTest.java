package com.demo.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Bohdan.Havrylyshyn on 31.07.2017.
 */
public class FirstTest extends BaseTest{

    @Test
    public void goToGoogle() {
        driver.get("https://google.com/");
        driver.findElement(By.xpath(".//div//input[@class='gsfi']")).sendKeys("Selenium");
        driver.findElement(By.xpath(".//div//input[@name='btnK']")).click();
    }
}
