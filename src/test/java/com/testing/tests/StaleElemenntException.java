package com.testing.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElemenntException {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        WebElement search_textarea = driver.findElement(By.name("q"));
        driver.navigate().refresh();
        WebElement search_textarea1 = driver.findElement(By.name("q"));
        search_textarea1.sendKeys("thetestingacademy");

    }

}
