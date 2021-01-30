package co.uk.zoopla.pages;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SearchResultPage extends BasePage
{
    public SearchResultPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

   // @FindBy(tagName = "h1")
    @FindBy(css = ".css-mh5azd-Heading1.e1s8jdjv5")
    private WebElement pageTitle;
    @FindBy(css = ".e2uk8e4.css-16zqmgg-StyledLink-Link-FullCardLink.e33dvwd0")
    private List<WebElement> searchResults;


    public void isSearchResultCorrect(String text)
    {
        pageTitle.getText().contains(text);
    }

//    public void isResultDisplayed()
//    {
//        //Verify
//        Assert.assertTrue(results.size() > 0);
//    }
//
//    public ProductDetailPage clickOnRandomResult()
//    {
//
//        Random ran = new Random();
//        int randomNumber = ran.nextInt(results.size()-1);
//        results.get(randomNumber).click();
//
//        return new ProductDetailPage(driver);
//    }

    public void isResultDisplayed()
    {
        int resultSize = searchResults.size();

        Assert.assertTrue(resultSize > 0);
    }

    public ProductDetailPage clickOnRandomResult()
    {
        Random random = new Random();
        int resultSize = searchResults.size();
        int randomNumber = random.nextInt(resultSize -1);

        searchResults.get(randomNumber).click();

        return new ProductDetailPage(driver);
    }

}
