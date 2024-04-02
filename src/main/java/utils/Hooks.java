package utils;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.Reporter;


import java.util.Properties;

public class Hooks {
    AppiumDriver driver;
    Properties properties;

    @Before
    public void before(){
        String deviceSystem = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("deviceSystem");
        properties = ConfigReader.initialize_Properites();
        driver = DriverFactory.initializeDriver(deviceSystem);
    }

    @After
    public void after(){
        driver.quit();
    }
}