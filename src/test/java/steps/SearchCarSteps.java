package steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarSearchPageActions;
import pages.actions.CarsGuideHomePageActions;
import utils.SeleniumDriver;

import java.util.List;

public class SearchCarSteps {

    CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
    CarSearchPageActions carSearchPageActions = new CarSearchPageActions();

    @Given("^I am on the Home Page \"([^\"]*)\" of Cars Guide website$")
    public void i_am_on_the_Home_Page_of_Cars_Guide_website(String websiteURL)  {
        SeleniumDriver.openPage(websiteURL);
    }

    @When("^I move to the menu$")
    public void i_move_to_the_menu(List<String> list) {
        String menu = list.get(1);
        System.out.println("Menu --->" +menu);
        carsGuideHomePageActions.moveToBuySellMenu();
    }

    @And("^click on \"([^\"]*)\" link$")
    public void click_on_link(String searchCars)  {
        carsGuideHomePageActions.clickOnSearchCarsMenu();
    }

    @And("^select carbrand as \"([^\"]*)\" from AnyMake dropdown$")
    public void select_carbrand_as_from_AnyMake_dropdown(String carBrand)  {
        carSearchPageActions.selectCarMake(carBrand);
    }

    @And("^select carmodel as \"([^\"]*)\" from AnyModel dropdown$")
    public void select_carmodel_as_from_AnyModel_dropdown(String carModel) {
        carSearchPageActions.selectCarModel(carModel);
    }

    @And("^select location as \"([^\"]*)\" from AnyLocation dropdown$")
    public void select_location_as_from_AnyLocation_dropdown(String location)  {
        carSearchPageActions.selectLocation(location);
    }

    @And("^select price as \"([^\"]*)\" from Price dropdown$")
    public void select_price_as_from_Price_dropdown(String carPrice)  {
        carSearchPageActions.selectCarPrice(carPrice);
    }

    @And("^click on Find_My_Next_Car button$")
    public void click_on_Find_My_Next_Car_button() {
        carSearchPageActions.clickOnFindMyNextCarBtn();
    }

    @Then("^I should see list of searched cars$")
    public void i_should_see_list_of_searched_cars()  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^the page title should be \"([^\"]*)\"$")
    public void the_page_title_should_be(String arg1)  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
