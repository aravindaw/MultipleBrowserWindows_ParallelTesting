package com.aravinda.app;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * Created by Aravinda on 02-Oct-16.
 */
public class TestBase {
    private final static Logger logger = Logger.getLogger("MainTest.class");
    WebDriver webDriver;

    @BeforeMethod
    public void openBrowser() throws IOException {
        logger.info("'OPEN-BROWSER' METHOD CALLED ..");
        Properties prop = new Properties();
        InputStream input;
        File file = new File("src/main/properties/path.properties");
        input = new FileInputStream(file);
        prop.load(input);

        File path = new File(prop.getProperty("chromeDriverPath"));
        System.setProperty("webDriver.chrome.driver", path.getAbsolutePath());

        webDriver = new ChromeDriver();
        webDriver.get("http://facebook.com");
    }

    @AfterMethod
    public void closeTheDrive() {
        logger.info("CLOSING THE WEB_DRIVER ..");
        webDriver.quit();
    }
}
