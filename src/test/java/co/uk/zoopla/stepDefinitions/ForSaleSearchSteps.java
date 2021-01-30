package co.uk.zoopla.stepDefinitions;

import co.uk.zoopla.pages.BasePage;
import co.uk.zoopla.pages.HomePage;
import co.uk.zoopla.pages.ProductDetailPage;
import co.uk.zoopla.pages.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class ForSaleSearchSteps extends BasePage
{
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SearchResultPage searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
    ProductDetailPage productDetailPage = PageFactory.initElements(driver, ProductDetailPage.class);


    @Given("I navigate to Zoopla homepage")
    public void i_navigate_to_zoopla_homepage() {
           launchUrl();
           homePage.clickOnCookiePolicy();
    }

    @When("I enter {string} into the search field")
    public void i_enter_into_the_search_field(String location) {
        homePage.enterLocation(location);
    }

    @When("I select minimum price as {string}")
    public void i_select_minimum_price_as(String minPrice) {
        homePage.selectMinimumPrice(minPrice);
    }

    @When("I select maximum price as {string}")
    public void i_select_maximum_price_as(String mPrice) {
        homePage.selectMaximumPrice(mPrice);
    }

    @When("I select {string} as property type")
    public void i_select_as_property_type(String propertyType) {
        homePage.selectPropertyType(propertyType);
    }

    @When("I select {string} bedrooms type")
    public void i_select_bedrooms_type(String bed) {
        homePage.selectBedroom(bed);
    }

    @When("I click on Search button")
    public void i_click_on_search_button() {
        //baton exchange
        //handshake
        searchResultPage = homePage.clickOnSearchButton();
    }

    @Then("the result for {string} for sale in {string} is displayed")
    public void the_result_for_for_sale_in_is_displayed(String propertyType, String location) {
        searchResultPage.isSearchResultCorrect(propertyType);
        searchResultPage.isSearchResultCorrect(location);
    }

    @When("result is displayed for search made above")
    public void result_is_displayed_for_search_made_above() {
        searchResultPage.isResultDisplayed();
    }

    @When("I click on one of the result displayed")
    public void i_click_on_one_of_the_result_displayed() {
        productDetailPage = searchResultPage.clickOnRandomResult();
    }
    @Then("the details of the property clicked on is displayed")
    public void the_details_of_the_property_clicked_on_is_displayed() {

    }


}




