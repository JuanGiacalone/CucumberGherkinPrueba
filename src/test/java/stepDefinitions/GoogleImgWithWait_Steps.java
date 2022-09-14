package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import testRunner.SetDriver;

import java.time.Duration;

public class GoogleImgWithWait_Steps {

    {SetDriver.setup();}

    WebDriver driver = new FirefoxDriver();

    @Given("I am on the Google search page")
    public void i_am_on_the_google_search_page() {

        driver.get("https://www.google.com/");

        throw new io.cucumber.java.PendingException();
    }
    @When("I search for a {string}")
    public void i_search_for_a(String string) {

        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys(string);
        element.submit();

        throw new io.cucumber.java.PendingException();
    }
    @Then("the page title should start with {string}")
    public void the_page_title_should_start_with(String string) {

        // Waiting 4 google to answer the request
        new WebDriverWait(driver, Duration.ofSeconds(10L)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith(string);
            }
        });
        throw new io.cucumber.java.PendingException();
    }

    @After()
    public void closeBrowser() {
        driver.quit();
    }
}
