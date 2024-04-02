package stepDefinitions;

import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginPageStep extends DriverFactory {



    @When("Uyelik bilgileri girilir")
    public void uyelikBilgileriGirilir() {
        LoginPage loginPage = new LoginPage();
        loginPage.emailGiris();
        loginPage.sifreGiris();
    }

    @When("Giris yapilir")
    public static void girisYapilir() {
        LoginPage.girisYapilir();

    }


}
