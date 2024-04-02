package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import utils.ElementHelper;

public class LoginPage extends DriverFactory {

    public  static AppiumDriver driver = DriverFactory.getDriver();
    WebDriverWait wait;
    ElementHelper elementHelper;

    public LoginPage(){
        elementHelper = new ElementHelper(driver);
    }

    public static By epostaBox = By.xpath("//android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    public static  By loginPageGirisYapButonu = By.xpath("//android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.Button");
    public static By passwordBox =  By.xpath("//android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText");


    public void emailGiris() {
        driver.findElement(epostaBox).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(epostaBox)).sendKeys("hepsiburadatestdenemesi@gmail.com");
        driver.findElement(loginPageGirisYapButonu).click();
    }

    public void sifreGiris() {
        driver.findElement(passwordBox);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(passwordBox)).sendKeys("HepsiBurada24");

    }

    public static void girisYapilir() {
        driver.findElement(loginPageGirisYapButonu).click();
    }
}
