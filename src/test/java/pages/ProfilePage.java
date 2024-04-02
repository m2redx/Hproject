package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import utils.ElementHelper;

public class ProfilePage extends DriverFactory {
    public static AppiumDriver driver = DriverFactory.getDriver();
    public static By girisYapButonu =  By.xpath( "//android.view.ViewGroup[@content-desc=\"account_menu_button_1\"]");
    public static void girisYapButonunaTikla() {
        driver.findElement(girisYapButonu).click();

    }
}
