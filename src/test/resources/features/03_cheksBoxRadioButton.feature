@checkbox
Feature: checkbox ve Radio buttton
  Scenario: TC01 checkbos
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=checkboxes"adrsine gider
    And "Checkbox 1" secili degilse sec
    And "Checkbox 2" iki secili degilse sec
    Then sayfayi acik tutar

    @red
    Scenario: TC02 Radio Button
      Given kullanici "https://testcenter.techproeducation.com/index.php?page=radio-buttons"adrsine gider
      And "Red" secili degilse sec
      Then sayfayi acik tutar

  @Football
  Scenario: TC03 Radio Button
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=radio-buttons"adrsine gider
    And "Football" secili degilse sec
    Then sayfayi acik tutar

