package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import utils.ElementHelper;

public class SearchPage {
    public static AppiumDriver driver = DriverFactory.getDriver();
    public static By aramaAlani = By.id("com.pozitron.hepsiburada:id/etSearchBox");
    public static By ilkSecenek= By.xpath("//android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
    public static void aramaAlaninaTiklanir() {
        driver.findElement(aramaAlani).click();
    }

    public static void urunYazilir(String product) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(aramaAlani)).sendKeys(product);
    }

    public static void urunAranir() {
        driver.findElement(ilkSecenek).click();

    }
}
