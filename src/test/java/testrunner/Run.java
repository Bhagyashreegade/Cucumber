package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        // to run SPECIFIC(more than one) feature file from features folder
        //features = {"C:/Users/Bhagyashree/IdeaProjects/BDD/src/test/resources/features/EcommerceLogin.feature", "C:/Users/Bhagyashree/IdeaProjects/BDD/src/test/resources/features/Customer.feature"},
        features= "C:/Users/Bhagyashree/IdeaProjects/BDD/src/test/resources/features/Customer.feature", //to run ONE feature file
        //features= "C:/Users/Bhagyashree/IdeaProjects/BDD/src/test/resources/features/",    //to run ALL feature files parallelly
        glue = "stepdefinition",
        dryRun = false,    //when true = will check whether the steps of feature file is implemented in step definition or not
        monochrome = true, //makes the console output readable
        tags = "@Regression",  //will run regression
        // tags= "@Regression and @Sanity", //will run only that scenarios which have both tags
        //tags= "@Regression or @Sanity", //will run both of them
        //tags= "@Regression and not @Sanity", //will include Regression but not Sanity
        plugin = {"pretty", "html:target/cucumber-reports/reports_html.html"} //will create report in html format
        //plugin = {"pretty", "xml:target/cucumber-reports/reports_xml.xml"} //will create report in xml format
        // plugin = {"pretty", "json:target/cucumber-reports/reports_json.json"} //will create report in json format

)

public class Run {

    /*this class will be empty*/
}
