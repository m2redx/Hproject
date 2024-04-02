package pages;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import utils.ElementHelper;

public class SearchResultPage extends DriverFactory {
    public static AppiumDriver driver = DriverFactory.getDriver();
    public static By filtreButonu = By.id("com.pozitron.hepsiburada:id/txtOptionBarFilters");
    public static By ilkUrun = By.xpath("//android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.GridView/androidx.cardview.widget.CardView[1]");

    public static void filtreyeTiklanir() {
        driver.findElement(filtreButonu).click();
    }


    public static void urunDetayaGidilir() {
        driver.findElement(ilkUrun).click();
    }
}
