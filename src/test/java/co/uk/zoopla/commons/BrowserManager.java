package co.uk.zoopla.commons;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends DriverManager
{

  private WebDriver initialiseChrome()
  {
     WebDriverManager.chromedriver().setup();

     return new ChromeDriver();
  }

  private WebDriver initialiseFirefox()
  {
      WebDriverManager.firefoxdriver().setup();
      return new FirefoxDriver();
  }

  private WebDriver initialiseIE()
  {
      WebDriverManager.iedriver().setup();
      return new InternetExplorerDriver();
  }

  private WebDriver initialiseHeadlessChrome()
  {
      WebDriverManager.chromedriver().setup();

      //instantiate an object of ChromeOptions
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--disable-gpu", "--headless");

      return new ChromeDriver(options);

  }

  private WebDriver initialiseHeadlessFirefox()
  {
      WebDriverManager.firefoxdriver().setup();

      FirefoxOptions options = new FirefoxOptions();
      options.addArguments("--disable-gpu", "--headless");

      return new FirefoxDriver(options);
  }

  //Cross browser testing
  public void launchBrowser(String browser)
  {
      switch(browser)
      {
          case "Chrome":
              driver = initialiseChrome();
              break;
          case "Firefox":
              driver = initialiseFirefox();
              break;
          case "ie":
          case "internetExplorer":
              driver = initialiseIE();
              break;
          case "HeadlessChrome":
              driver = initialiseHeadlessChrome();
              break;
          case "HeadlessFirefox":
              driver = initialiseHeadlessFirefox();
              break;
          default:
              driver = initialiseChrome();
              break;
      }

      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
  }


 public void closeBrowser()
 {
     driver.manage().deleteAllCookies();
     driver.quit();
 }


}
