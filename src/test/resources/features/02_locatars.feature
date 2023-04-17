@locators
  Feature: 
    Scenario: TC01 locators
      Given kullanici "https://testcenter.techproeducation.com/index.php?page=form-authentication"adrsine gider
      And 3 sn bekler
      And kullanici adini gir
      And 3 sn bekler
      And kullanici sifresini gir
      And 3 sn bekler
      When submit butonuna tıkla
      And 3 sn bekler
      Then giris yapildigini test et

# 1.feature file oluştur
# 2.test  caseleri yaz
# 3. yeni test adimlari icin step definitions(javametotlari) olustur
# 4. page class olustur pages klasorunun altında
# 5. kullanici adi sifresi ve submit butonunu o sayfada bul

