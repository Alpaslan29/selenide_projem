package stepdefinitions;



import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.*;

public class CommonStepDefinitions {

    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String string) {
        open(string);

    }


    @Then("{int} sn bekler")
    public void sn_bekler(Integer int1) {
        /*
        selenide default olarak 4 saniye bekler
        4 saniyeden fazla beklemek için sleep metodu kullanılır
        sleep fonksiyonu millisecond kabul eder . saniye çevirmek için 1000 ile çarpılır
         */
        sleep(int1*1000);

    }
    @Then("onceki sayfaya gider")
    public void onceki_sayfaya_gider() {
        back();
    }
    @Then("sonraki sayfaya gider")
    public void sonraki_sayfaya_gider() {
        forward();

    }
    @Then("sayfayi yeniler")
    public void sayfayi_yeniler() {
        refresh();
    }
    @Then("sayfayi acik tutar")
    public void sayfayi_acik_tutar() {
        // var sayılan selenide  ayaralarda browser otomatik kapanmaktadır
        // engellemek icin
        Configuration.holdBrowserOpen=true;
//
    }












}
