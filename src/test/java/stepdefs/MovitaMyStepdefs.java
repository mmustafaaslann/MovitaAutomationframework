package stepdefs;

import Base.BaseMovita;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MovitaMyStepdefs extends BaseMovita {
    @Given("users goto url{string}")
    public void usersGotoUrl(String url) {
        driver.get(url);
    }

    @When("users clicked the movita logo")
    public void usersClickedTheMovitaLogo() {
        click(llogo);
    }

    @And("Mobile Vechile Tracking system SHould be visible")
    public void mobileVechileTrackingSystemSHouldBeVisible() {


    }

    @Then("Should be success")
    public void shouldBeSuccess() {
        getScreenshot("Mobil Vasıta");

    }


    @Given("users navigate to {string}")
    public void usersNavigateTo(String url) {
        driver.get(url);
    }

    @When("user clicks the enter button")
    public void userClicksTheEnterButton() {
        click(lEnterButton);
    }

    @And("user clicks the Turkish language button")
    public void userClicksTheTurkishLanguageButton() {
        click(lTurkishLang);
    }

    @And("user String verify Türkce → “Mobil Vasita izleme takip Sistemi” yazisini verify et")
    public void userStringVerifyTürkceMobilVasitaIzlemeTakipSistemiYazisiniVerifyEt() {
        bekle(500);
        visible(lMobilVasıtaTurkish);
        getScreenshot("Mobil Vasita izleme takip Sistemi");
    }

    @And("user clicks the english language button")
    public void userClicksTheEnglishLanguageButton() {
        click(lEnglishLang);
    }

    @And("user String verify English → “Mobile Vehicle Tracking System” yazisini verify et")
    public void userStringVerifyEnglishMobileVehicleTrackingSystemYazisiniVerifyEt() {
        visible(lMobilVasıtaEnglish);
        getScreenshot("Mobile Vehicle Tracking System");
    }
}


