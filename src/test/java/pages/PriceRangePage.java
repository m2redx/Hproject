package pages;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import utils.ElementHelper;

public class PriceRangePage extends DriverFactory {
    public static AppiumDriver driver = DriverFactory.getDriver();
    public static By minDegerAlani = By.id("com.pozitron.hepsiburada:id/editTextPriceMin");
    public static By maxDegerAlani = By.id("com.pozitron.hepsiburada:id/editTextPriceMax");
    public static By uygulaButonu = By.id("com.pozitron.hepsiburada:id/btnFiltersApply");


    public static void minDegerGirilir(String minDeger) {
        driver.findElement(minDegerAlani).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(minDegerAlani)).sendKeys(minDeger);
    }

    public static void maxDegerGirilir(String maxDeger) {
        driver.findElement(maxDegerAlani).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(maxDegerAlani)).sendKeys(maxDeger);
    }

    public static void uygulaButonunaBasilir() {
        driver.findElement(uygulaButonu).click();
    }
}
