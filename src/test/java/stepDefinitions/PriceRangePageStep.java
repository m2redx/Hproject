package stepDefinitions;

import io.cucumber.java.en.When;
import pages.PriceRangePage;

public class PriceRangePageStep {

    @When("Min {string} ve Max {string} deger girilir")
    public void minVeMaxDegerGirilir(String minDeger, String maxDeger) {
        PriceRangePage.minDegerGirilir(minDeger);
        PriceRangePage.maxDegerGirilir(maxDeger);
        PriceRangePage.uygulaButonunaBasilir();
    }
}
