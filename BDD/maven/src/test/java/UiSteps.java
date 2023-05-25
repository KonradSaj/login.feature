import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UiSteps {
    WebDriver webDriver;
    WebDriverWait wait;

    @Given("Widoczna strona główna sklepu")
    public void widocznaStronaGłównaSklepu() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\WebDrivers\\chromedriver.exe");
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver, 4);
        webDriver.manage().window().maximize();
        webDriver.get("https://automationexercise.com");
    }

    @When("Przechodzę do Products")
    public void przechodzęDoProducts() {

        webDriver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
/*        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")))
        webDriver.switchTo().alert().dismiss();*/



        By POPUP_BUTTON = By.cssSelector("div[id=dismiss-button]");
        WebElement popup = wait.until(ExpectedConditions.elementToBeClickable(POPUP_BUTTON));

       /* if (popup)
        {
            webDriver.findElement(POPUP_BUTTON).click();
        }
        else {
        }*/

        }
        @And("Przechodzę do Cart")
        public void przechodzęDoCart () {
            webDriver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
        }

    @Then("Wracam do Home")
    public void wracammDoHome() {
        webDriver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")).click();
    }
}
