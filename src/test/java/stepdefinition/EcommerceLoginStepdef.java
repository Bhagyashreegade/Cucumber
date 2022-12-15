package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.EcommerceLogin1;

public class EcommerceLoginStepdef {


    public WebDriver driver;
    public EcommerceLogin1 loginPg;


    @Given("User Launch Chrome browser")
    public void userLaunchChromeBrowser() {
     WebDriverManager.chromedriver().setup();
     driver= new ChromeDriver();
     loginPg= new EcommerceLogin1(driver);
    }

    @When("User opens URL {string}")
    public void userOpensURL(String url) {
     driver.get(url);
    }

    @And("User enters Email as {string} and Password as {string}")
    public void userEntersEmailAsAndPasswordAs(String email, String pass) {
     loginPg.enterEmail(email);
     loginPg.enterPassword(pass);
    }

    @And("Click on Login")
    public void clickOnLogin() {
     loginPg.clickOnLoginButton();
    }

    @Then("Page Title should be {string}")
    public void pageTitleShouldBe(String expectedTitle) {
        String actualTitle= driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            Assert.assertTrue(true);
        } else{
            Assert.assertTrue(false);
        }
    }

    @When("User click on Log out link")
    public void userClickOnLogOutLink() {
        loginPg.clickOnLogOutButton();
    }

    @And("close browser")
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }


}
