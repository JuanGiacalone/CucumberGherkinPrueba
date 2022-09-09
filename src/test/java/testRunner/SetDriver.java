package testRunner;

import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.runner.RunWith;

public class SetDriver {

    public static void setup() {
        WebDriverManager.firefoxdriver().setup();
    }

}
