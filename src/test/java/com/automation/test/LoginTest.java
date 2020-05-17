package com.automation.test;

import com.automation.DriverSetup;
import com.automation.FindElement;
import com.automation.ObjectInteractions;
import com.automation.pom.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Connection;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.Log;
import org.openqa.selenium.devtools.network.Network;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class LoginTest extends testNGHooks{

    @Test(groups = {"myTest"},description = "Test To Login to application")
    public static void Login() throws Exception
    {
        DriverSetup.getDriver().get("http://www.amazon.co.uk");
        com.automation.pom.LandingPage.clickSignIn();
        com.automation.pom.Login.enterUserName("abc@gmail.com");
        com.automation.pom.Login.clickContinue();
        com.automation.pom.Login.enterPassword("test");
        com.automation.pom.Login.clickLogin();
        Thread.sleep(4000);
    }

}
