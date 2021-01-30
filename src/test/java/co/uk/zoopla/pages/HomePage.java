package co.uk.zoopla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
    //Constructor
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Declaration
    @FindBy(id = "search-input-location")
    private WebElement searchField;
    @FindBy(css = "button.ui-button-primary.ui-cookie-accept-all-medium-large")
    private WebElement cookiePolicy;
    @FindBy(name = "price_min")
    private WebElement minPrice;
    @FindBy(name = "price_max")
    private WebElement maxPrice;
    @FindBy(name = "property_type")
    private WebElement propertyType;
    @FindBy(id = "beds_min")
    private WebElement noOfBed;
    @FindBy(id = "search-submit")
    private WebElement searchButton;
    @FindBy(css = "[href=\"/for-sale/\"]")
    private WebElement forSaleTab;


    //To use
   public void enterLocation(String location)
   {
       if(searchButton != null){
           searchField.sendKeys(location);
           searchField.click();
       }

   }

    public void clickOnCookiePolicy()
   {
       if(cookiePolicy != null) {
           cookiePolicy.click();
       }
   }

   public void selectMinimumPrice(String text)
   {
       if(minPrice != null)
       {
           selectElementByText(minPrice, text);
       }

   }

   public void selectMaximumPrice(String text)
   {
       if(maxPrice != null) {
           selectElementByText(maxPrice, text);
       }
   }

   public void selectPropertyType(String text)
   {
       selectElementByText(propertyType, text);
   }

   //to use
    public void selectBedroom(String text)
    {
        selectElementByText(noOfBed, text);
    }

    public SearchResultPage clickOnSearchButton()
    {
        searchButton.click();
        return new SearchResultPage(driver);
    }

    public void hooverOverForSaleTab()
    {
        hooverOverElement(forSaleTab);
    }

    public PropertiesForSalePage clickOnForSaleTab()
    {
        forSaleTab.click();
        return new PropertiesForSalePage(driver);
    }


}
