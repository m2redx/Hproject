package stepDefinitions;

import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;
import utils.DriverFactory;

public class ProfilePageStep extends DriverFactory {

    @When("Giris yap butonuna tiklanir")
    public void girisYapButonunaTiklanir() {
        ProfilePage.girisYapButonunaTikla();

    }


}
