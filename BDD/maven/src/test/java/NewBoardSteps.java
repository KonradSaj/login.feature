import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class NewBoardSteps {
    WebDriver webDriver;
    WebDriverWait wait;

    @Given("Jestem na stronie")
    public void jestem_na_stronie() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\WebDrivers\\chromedriver.exe");
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver, 10);
        webDriver.manage().window().maximize();
        webDriver.get("https://trello.com/u/boards");
    }

    @When("Klikam Utwórz nową tablicę")
    public void klikam_utwórz_nową_tablicę() {

    }

    @When("Podaję tytuł tablicy")
    public void podaję_tytuł_tablicy() {

    }

    @When("Klikam Utwórz")
    public void klikam_utwórz() {

    }

    @Then("Tworzy się nowa tablica")
    public void tworzy_się_nowa_tablica() {

    }
}
