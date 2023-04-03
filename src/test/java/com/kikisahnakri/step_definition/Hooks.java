package com.kikisahnakri.step_definition;

import com.mashape.unirest.http.exceptions.UnirestException;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.Setting;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks {

    private static final long IMPLICIT_WAIT = 10;
    //public static WebDriver driver;
    public static AppiumDriver driver;

    @Before
    public void openBrowser() throws MalformedURLException, InterruptedException {

        // WEB
//        System.setProperty("webdriver.chrome.driver", "I:\\__driver\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://www.google.com/");

        // Mobile
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "8430ca72");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "staging.cicle");
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("appActivity", "staging.cicle.MainActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url,capabilities);
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.setSetting(Setting.WAIT_FOR_IDLE_TIMEOUT,40);

        Thread.sleep(5000);
    }

    @After
    public void closeBrowser(Scenario scenario) throws UnirestException, IOException {

        if (scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotBytes, "image/png", scenario.getName());
        }
        driver.quit();

    }
}
