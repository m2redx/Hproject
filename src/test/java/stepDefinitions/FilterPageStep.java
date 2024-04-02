package stepDefinitions;

import io.cucumber.java.en.When;
import pages.FilterPage;

public class FilterPageStep {
    @When("Yapilacak filtre secilir")
    public void yapilacakFiltreSecilir() {
        FilterPage.fiyatAraliginaTiklanir();
    }

    @When("Urunleri gor butonuna tıklanır")
    public void urunleriGorButonunaTıklanır() {
        FilterPage.urunleriGorButonunaTiklanir();
    }
}
