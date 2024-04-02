package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SearchPage;
import utils.DriverFactory;

public class SearchPageStep  extends DriverFactory {



    @When("Arama alanina {string} yazilir ve aranir")
    public void aramaAlaninaYazilirVeAranir(String product) {
        SearchPage.aramaAlaninaTiklanir();
        SearchPage.urunYazilir(product);
        SearchPage.urunAranir();

    }


}
