package lv.acodemy.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import lv.acodemy.utils.LocalDriverManager;
import org.testng.annotations.AfterMethod;


@CucumberOptions(tags = "",
        features = {"src/test/resources/features"},
        glue = {"lv.acodemy.step_definitions"},
        plugin = { "pretty", "html:target/cucumber-reports.html"})


public class CucumberRunner extends AbstractTestNGCucumberTests {

    @AfterMethod()
    public static void afterTest() {
        LocalDriverManager.closeDriver();
    }
}
