@Search
Feature:Search
  Scenario:Urun arama
    When Bildirimlere izin verilir
    When Var ise Popup kapatilir
    When Tum kategoriler butonuna tiklanir
    When Arama alanina "<product>" yazilir ve aranir
    When Filtreye girilir
    When Yapilacak filtre secilir
    When Min "<minDeger>" ve Max "<maxDeger>" deger girilir
    When Urunleri gor butonuna tıklanır
    When Urun detayina gidilir
    Then Sepete ekle butonu kontrol edilir
    Examples:
      | product | minDeger | maxDeger |
      | Lenovo  | 8000     | 20000    |