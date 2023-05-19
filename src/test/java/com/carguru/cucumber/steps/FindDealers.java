package com.carguru.cucumber.steps;

import com.carguru.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FindDealers {
    @When("^I mouse hover on the buy\\+sell tab$")
    public void iMouseHoverOnTheBuySellTab() {
        new HomePage().mouseHoverOnBuySell();
    }

    @And("^I click ‘Find a Dealer’$")
    public void iClickFindADealer() {
        new HomePage().mouseHoverOnFindADealerAndClick();
    }

    @Then("^I navigate to ‘car-dealers’ page$")
    public void iNavigateToCarDealersPage() {

    }

    @And("^I should see the dealer names \"([^\"]*)\" are display on page$")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(String arg0)  {

    }
}
