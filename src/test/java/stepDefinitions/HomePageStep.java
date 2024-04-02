package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.DriverFactory;

public class HomePageStep extends DriverFactory {

    @When("Hesabima tiklanir")
    public void hesabimaTiklanir() {
        HomePage.hesabimaTikla();
    }

    @When("Bildirimlere izin verilir")
    public void bildirimlereIzinVerilir() {
        HomePage.izinVer();
    }

    @When("Var ise Popup kapatilir")
    public void popupKapatilir() {
        HomePage.popUpKapatma();
    }

    @Then("Giris yapildigi {string} mesajı ile dogrulanir")
    public void girisYapildigiDogrulanir(String checkMessage) {
        HomePage.girisYapildigiDogrulanir(checkMessage);
    }

    @When("Tum kategoriler butonuna tiklanir")
    public void tumKategorilerButonunaTiklanir() {
        HomePage.tumKategorilerButonunaTiklanir();
    }
}