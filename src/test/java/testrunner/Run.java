package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= "C:/Users/Bhagyashree/IdeaProjects/BDD/src/test/resources/features/EcommerceLogin.feature",
        glue= "stepdefinition",
        dryRun = false,    //when true = will check whether the steps of feature file is implemented in step definition or not
        monochrome = true, //makes the console output readable
        plugin = {"pretty", "html:target/cucumber-reports/reports_html.html"}
)

public class Run {

    /*this class will be empty*/
}
