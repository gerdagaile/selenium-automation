package lv.acodemy.step_definitions;

import io.cucumber.java.en.Given;
import lv.acodemy.utils.LocalDriverManager;
import org.openqa.selenium.WebDriver;

import static lv.acodemy.utils.ConfigurationProperties.getConfiguration;

public class CommonStepDefs {

    WebDriver driver = LocalDriverManager.getInstance();


    @Given("user open main page")
    public void openMainPage() {
        driver.get(getConfiguration().getString("sauce.demo.url"));

    }
}
