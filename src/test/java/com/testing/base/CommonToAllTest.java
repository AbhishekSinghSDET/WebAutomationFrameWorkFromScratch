package com.testing.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.testing.driver.DriverManager;

public class CommonToAllTest {
    // To call the Start the Webdriver
    // Down the WebDriver
    // Start Webdirver start

    @BeforeMethod
    public void setup(){
        DriverManager.init();
//        DriverManagerSelenoid.init();
    }

    @AfterMethod
    public void tearDown(){
        DriverManager.down();
//        DriverManagerSelenoid.down();
    }
}
