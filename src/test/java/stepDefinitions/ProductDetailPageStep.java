package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.ProductDetailPage;

public class ProductDetailPageStep {
    @Then("Sepete ekle butonu kontrol edilir")
    public void sepeteEkleButonuKontrolEdilir() {
        ProductDetailPage.SepeteEkleButonuKontrolu();
    }
}
