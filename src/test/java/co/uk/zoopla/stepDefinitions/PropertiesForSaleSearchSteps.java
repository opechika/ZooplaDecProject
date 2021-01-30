package co.uk.zoopla.stepDefinitions;

import co.uk.zoopla.pages.BasePage;
import co.uk.zoopla.pages.HomePage;
import co.uk.zoopla.pages.PropertiesForSalePage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.PageFactory;

public class PropertiesForSaleSearchSteps extends BasePage
{
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    PropertiesForSalePage propertiesForSalePage = PageFactory.initElements(driver, PropertiesForSalePage.class);

    @Given("I click on For Sale tab")
    public void andIClickOnForSaleTab()
    {
        homePage.hooverOverForSaleTab();
        propertiesForSalePage = homePage.clickOnForSaleTab();
    }
}
