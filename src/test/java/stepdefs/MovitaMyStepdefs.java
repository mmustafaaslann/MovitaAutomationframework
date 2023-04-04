package stepdefs;

import Base.BaseMovita;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MovitaMyStepdefs extends BaseMovita {
    @Given("users goto url{string}")
    public void usersGotoUrl(String   url) {
        driver.get(url);
    }

    @When("users clicked the movita logo")
    public void usersClickedTheMovitaLogo() {
        click(llogo);
    }

    @And("Mobile Vechile Tracking system SHould be visible")
    public void mobileVechileTrackingSystemSHouldBeVisible() {
        visible(lMobilVasıta);

    }

    @Then("Should be success")
    public void shouldBeSuccess() {
        getScreenshot("Mobil Vasıta");

    }
}
