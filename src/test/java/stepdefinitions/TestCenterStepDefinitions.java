package stepdefinitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TestCenterPages;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class TestCenterStepDefinitions {
    TestCenterPages testCenterPages =new TestCenterPages();

    @Given("kullanici {string}adrsine gider")
    public void kullaniciAdrsineGider(String String) {
        open(String);

    }

    @And("kullanici adini gir")
    public void kullaniciAdiniGir() {
        testCenterPages.kullaniciAdi.setValue("techproed");

    }

    @And("kullanici sifresini gir")
    public void kullaniciSifresiniGir() {
        testCenterPages.kullaniciSifre.setValue("SuperSecretPassword");

    }

    @When("submit butonuna tıkla")
    public void submitButonunaTıkla() {
        testCenterPages.submitButton.click();

    }

    @Then("giris yapildigini test et")
    public void girisYapildiginiTestEt() {
      //  Assert.assertTrue(testCenterPages.girisMesaji.isDisplayed());//  junit dogrulama
        testCenterPages.girisMesaji.shouldBe(visible);// selenide assertion fail ederse ekran görüntüsü ototomatik alınır build dosyasına kaydeder


    }

  //  @Given("kullanici{string}adresine gider")
  //  public void kullaniciAdresineGider(String String) {
     //   open(String);

   // }

    @And("{string} secili degilse sec")
    public void seciliDegilseSec(String text) {
        //eger text= Checkbox1 ve checkbox 1 secili değilse checkbok1 e tıkla

        if(text.equals("Checkbox 1")&& !testCenterPages.checkbox1.isSelected()){

            testCenterPages.checkbox1.click();
            // Assert.assertTrue(testCenterPages.checkbox1.isSelected());//j unit
           // testCenterPages.checkbox1.shouldBe(checked); // selenide uzun versiyon
            testCenterPages.checkbox1.shouldBe(checked); // selenide kısa versiyon
        }
        if (text.equals("Checkbox 2")&& !testCenterPages.checkbox2.isSelected()) {
            testCenterPages.checkbox2.shouldNotBe(checked);
            testCenterPages.checkbox2.click();
            testCenterPages.checkbox2.shouldBe(checked);
            
        }

        if (text.equals("Red")&& !testCenterPages.redButton.isSelected() ){
            testCenterPages.redButton.shouldNotBe(checked);//secili olmadıgını test et
            testCenterPages.redButton.click();// sec
            testCenterPages.redButton.shouldBe(checked);// secili oldugunu test et
        }
        if (text.equals("Football")&& !testCenterPages.futbollButton.isSelected() ){
            testCenterPages.futbollButton.shouldNotBe(checked);//secili olmadıgını test et
            testCenterPages.futbollButton.click();// sec
            testCenterPages.futbollButton.shouldBe(checked);// secili oldugunu test et
        }

    }

    @And("{string} iki secili degilse sec")
    public void ikiSeciliDegilseSec(String arg0) {
    }


}
