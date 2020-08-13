package org.example;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
    public ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/users/Марина/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @After
    public void close(){
         driver.quit();
   }
}
