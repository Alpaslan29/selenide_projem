@google
Feature: navigasyonlar
  Scenario: TC 01 navigasyon testi
    Given kullanici "https://www.google.com/" adresine gider
    Then kullanici "https://www.amazon.com/" adresine gider
    And 5 sn bekler
   Then onceki sayfaya gider
    And 5 sn bekler
   Then sonraki sayfaya gider
    And 5 sn bekler
    Then sayfayi yeniler
    And 5 sn bekler
    Then sayfayi acik tutar


