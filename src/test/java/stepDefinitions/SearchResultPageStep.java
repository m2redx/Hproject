package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchResultPage;

public class SearchResultPageStep {

    @When("Filtreye girilir")
    public void filtreyeGirilir() {
        SearchResultPage.filtreyeTiklanir();
    }

    @When("Urun detayina gidilir")
    public void urunDetayinaGidilir() {
        SearchResultPage.urunDetayaGidilir();
    }
}
