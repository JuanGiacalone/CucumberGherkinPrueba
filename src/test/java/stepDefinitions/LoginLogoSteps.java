package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import testRunner.SetDriver;

import java.util.Set;


public class LoginLogoSteps {

    @Before
    void setup() {
        SetDriver.setup();
    }

    private WebDriver driver;

    @Given("I launch browser")
    public void iLaunchBrowser() throws Throwable{
        driver = new FirefoxDriver();
    }

    @When("I Open  the homepage")
    public void iOpenTheHomepage() throws Throwable{

        driver.get("https://cafecito.app/");

    }

    @Then("I verify logo presence")
    public void iVerifyLogoPresence() throws Throwable {
        Boolean status = driver.findElement(By.xpath("//img[@class='header_logoDesktop__1UHgj']")).isDisplayed();
        Assert.assertEquals(true,status);
    }

    @And("End")
    public void end() throws Throwable {

        driver.quit();
    }
}
