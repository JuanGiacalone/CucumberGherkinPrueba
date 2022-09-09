package testRunner;


import io.cucumber.java.BeforeAll;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Features",
        glue = "stepDefinitions"
)

public class TestRunner {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/home/juan/selenium/drivers/geckodriver");
    }
}
