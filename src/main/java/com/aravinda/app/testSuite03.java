package com.aravinda.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by Aravinda on 02-Oct-16.
 */
public class testSuite03 {


    public class Test01 extends TestBase {

        @Test
        public void loginTest()throws Exception{
            WebElement email=  webDriver.findElement(By.id("email"));
            email.click();
            email.sendKeys("userID3");
            Thread.sleep(2000);
            WebElement pass =  webDriver.findElement(By.id("pass"));
            pass.click();
            pass.sendKeys("password3");
            Thread.sleep(2000);
        }
    }
}
