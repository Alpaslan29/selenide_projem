package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.selector.ByDeepShadow.cssSelector;

public class TestCenterPages {

    // kullanici adi
    public SelenideElement kullaniciAdi =$(By.id("exampleInputEmail1"));
    // kullanici sifresi

    public SelenideElement kullaniciSifre =$(cssSelector("#exampleInputPassword1"));
    // submit butonu

    public SelenideElement submitButton = $(By.xpath("//button[@type='submit']"));

    public SelenideElement girisMesaji =$(By.xpath("//*[contains(text(),'You logged into a secure area!')]"));

    //Checkbox1
    public SelenideElement checkbox1 =$(By.id("box1"));

    //Checkbox2
    public  SelenideElement checkbox2 =$(By.id("box2"));

    // Radio Elementler

    public  SelenideElement redButton =$(By.id("red"));

    public SelenideElement futbollButton =$(By.id("football"));



}
