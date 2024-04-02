package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import utils.ElementHelper;

public class ProductDetailPage {
    public static AppiumDriver driver = DriverFactory.getDriver();
    public static By urunDetaySepeteEkleButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepete ekle\")");

    public static void SepeteEkleButonuKontrolu() {
        driver.findElement(urunDetaySepeteEkleButonu).isDisplayed();

    }
}
