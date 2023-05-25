import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSteps {
    WebDriver webDriver;
    WebDriverWait wait;
/*  *//*  @Before
    public void otwieramPrzeglądarke() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\WebDrivers\\chromedriver.exe");
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver, 10);
        webDriver.manage().window().maximize();*//*
    }*/
  @And("OpenBrowser") public void otwieramPrzeglądarke() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\WebDrivers\\chromedriver.exe");
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver, 10);
        webDriver.manage().window().maximize();
    }

    @After
    public void zamykamPrzeglądarke() {
        webDriver.quit();
    }

    @Given("Wchodzę na strone")

    public void wchodzęNaStrone() {
        webDriver.get("https://trello.com/login");
    }

    @When("Wpisuję email i klikam kontynuuj")
    public void wpisujęEmail() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[value=Kontynuuj]")));
        //webDriver.findElement(By.cssSelector("input[id=login]")).click();
       /*WebElement textField = webDriver.findElement(By.cssSelector("input[id=login]"));
       textField.sendKeys("TrelloJira@interia.pl");*/
        webDriver.findElement(By.cssSelector("input[id=user]")).sendKeys("TrelloJira@interia.pl");
        webDriver.findElement(By.cssSelector("input[value=Kontynuuj]")).click();
    }

    @And("Wpisuję hasło {string} i klikam Zaloguj się")
    public void wpisujęHasło(String string) {
        wait.until(ExpectedConditions.urlContains("application"));
        webDriver.findElement(By.cssSelector("input[id=password]")).sendKeys(string);
        webDriver.findElement(By.cssSelector("span[class=css-178ag6o]")).click();
    }

    @Then("Zostaje zalogowany")
    public void zostajeZalogowany() {
    // webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div[3]/h3"));
      wait.until(ExpectedConditions.urlContains("https://trello.com/u/userjira15/boards"));
  }

    @Then("Nie zostaje zalogowany")
    public void nieZostajeZalogowany() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/section/div[2]/div/section/div/div[2]/span/span/a")));

    }

}

