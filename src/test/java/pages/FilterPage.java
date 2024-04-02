package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import utils.ElementHelper;

public class FilterPage  extends DriverFactory {
    public static AppiumDriver driver = DriverFactory.getDriver();

    public static By fiyatAraligiTabi = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Fiyat Aralığı\")");
    public static By urunleriGorButonu = By.id("com.pozitron.hepsiburada:id/tvApplyFilterButton");
    public static void fiyatAraliginaTiklanir() {
        driver.findElement(fiyatAraligiTabi).click();

    }

    public static void urunleriGorButonunaTiklanir() {
        driver.findElement(urunleriGorButonu).click();
    }
}
