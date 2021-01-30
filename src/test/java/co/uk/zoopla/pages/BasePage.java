package co.uk.zoopla.pages;


import co.uk.zoopla.commons.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverManager
{
   // public String old_BASE_URL = "https://www.zoopla.co.uk/";
    public String BASE_URL = "https://www.zoopla.co.uk/";
    public Select select;
    public Actions actions;

    public void launchUrl() {
        driver.navigate().to(BASE_URL);
    }


    //selectByIndex
    //selectByValue

    public void selectElementByText(WebElement element, String text)
    {
        select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void hooverOverElement(WebElement element)
    {
       actions = new Actions(driver);
       actions.moveToElement(element).build().perform();
    }

}
