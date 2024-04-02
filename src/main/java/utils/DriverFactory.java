package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.PublicKey;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    static AppiumDriver driver;
    static Properties properties;
    static DesiredCapabilities capabilities;

    public static AppiumDriver initializeDriver(String deviceSystem){
        properties = ConfigReader.getProperties();

        capabilities = new DesiredCapabilities();
        if (deviceSystem.equals("Android")){
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("udid" , "652a895d");
            capabilities.setCapability("appPackage", "com.pozitron.hepsiburada");
            capabilities.setCapability("appActivity", "com.hepsiburada.ui.startup.SplashActivity");
        }else if (deviceSystem.equals("IOS")){
            capabilities.setCapability("platformName","IOS");
            capabilities.setCapability("udid" , "");
            capabilities.setCapability("appPackage", "");
            capabilities.setCapability("appActivity", "");
        }
        try {
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        int impWait = Integer.parseInt(properties.getProperty("implicityWait"));
        driver.manage().timeouts().implicitlyWait(impWait, TimeUnit.SECONDS);
        return getDriver();

    }
    public  static AppiumDriver getDriver(){
        return driver;
    }
}
