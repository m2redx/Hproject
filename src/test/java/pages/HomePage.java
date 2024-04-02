package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import utils.ElementHelper;

public class HomePage extends DriverFactory {

   public static AppiumDriver driver = DriverFactory.getDriver();

    public static By hesabimButonu = By.id("com.pozitron.hepsiburada:id/nav_graph_account_menu");
    public static By izinVerButonu =  By.id("com.android.permissioncontroller:id/permission_allow_button");
    public static By hosgeldinText = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"android:id/message\")");

    public static By arkaPlan = By.id("com.pozitron.hepsiburada:id/content_wrapper");
    public static By tumKategoriler = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Tüm Kategoriler\")");

    public static void hesabimaTikla() {

        driver.findElement(hesabimButonu).click();
    }

    public static void girisYapildigiDogrulanir(String checkMessage) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(hosgeldinText)).isDisplayed();
    }

    public static void izinVer() {
        driver.findElement(izinVerButonu).click();

    }

    public static void popUpKapatma() {
        driver.findElement(arkaPlan).click();
    }

    public static void tumKategorilerButonunaTiklanir() {
        driver.findElement(tumKategoriler).click();
    }
}