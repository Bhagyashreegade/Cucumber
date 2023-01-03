package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobject.CustomerPageObject;
import pageobject.EcommerceLogin1;
import pageobject.SearchCustomerPageObject;
import utilities.ReadConfig;

import java.io.File;
import java.io.IOException;


public class CustomerStepDef extends BaseClass {  //Concept of Inheritance

    @Before(order = 1)
    public void setup() {

        log = LogManager.getLogger("CustomerStepDef");
        System.out.println("Setup Method executed");

        readConfig = new ReadConfig();
        String browser = readConfig.getBrowser();

        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "msedge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new
                        FirefoxDriver();
                break;
            default:
                driver = null;
                break;

        }

        log.info("Setup 1 executed .......");
    }

    /*@Before(order=0)
    public void setup2() {
        System.out.println("Setup2 Method executed");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @BeforeStep
    public void beforeStep() {
        System.out.println("This is before steps....");
    }*/


    @Given("User Launch Chrome browser")
    public void userLaunchChromeBrowser() {

        loginPg = new EcommerceLogin1(driver);
        cstPg = new CustomerPageObject(driver);
        searchCustomerPage = new SearchCustomerPageObject(driver);
        log.info("User launch chrome browser");

    }

    @When("User opens URL {string}")
    public void userOpensURL(String url) {
        driver.get(url);
        log.info("URL opened");
    }

    @And("User enters Email as {string} and Password as {string}")
    public void userEntersEmailAsAndPasswordAs(String email, String pass) {
        loginPg.enterEmail(email);
        loginPg.enterPassword(pass);
        log.info("Email & Password entered");
    }

    @And("Click on Login")
    public void clickOnLogin() {
        loginPg.clickOnLoginButton();
        log.info("Login in button clicked");
    }

    //Login Feature

    @Then("Page Title should be {string}")
    public void pageTitleShouldBe(String expectedTitle) {
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            log.warn("Login feature: Page title matched");
            Assert.assertTrue(true);
        } else {
            log.warn("Login feature: Page Title not matched");
            Assert.assertTrue(false);
        }
    }

    @When("User click on Log out link")
    public void userClickOnLogOutLink() {
        loginPg.clickOnLogOutButton();
    }

    //Add New Customer
    @Then("User can view Dashboard")
    public void user_can_view_Dashboard() {
        String actTitle = cstPg.getPageTitle();
        String expTitle = "Dashboard / nopCommerce administration";

        if (actTitle.equals(expTitle)) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
    }

    @When("User click on customers Menu")
    public void user_click_on_customers_Menu() {
        cstPg.clickOnCustomersMenu();

    }

    @When("click on customers Menu Item")
    public void click_on_customers_Menu_Item() {
        cstPg.clickOnCustomersMenuItem();
    }

    @When("click on Add new button")
    public void click_on_Add_new_button() {
        cstPg.clickOnAddnew();
    }

    @Then("User can view Add new customer page")
    public void user_can_view_Add_new_customer_page() {
        String actTitle = cstPg.getPageTitle();
        String expTitle = "Add a new customer / nopCommerce administration";
        if (actTitle.equals(expTitle)) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
    }

    @When("User enter customer info")
    public void user_enter_customer_info() {
        //cstPg.enterEmail("test128@gmail.com");
        cstPg.enterEmail(genearateEmailId() + "@gmail.com"); //will generate new email id every time the scenario is executed.
        cstPg.enterPassword("test1");
        cstPg.enterFirstName("Bhagyashree");
        cstPg.enterLastName("Gade");
        cstPg.enterGender("Female");
        cstPg.enterDob("03/11/1991");
        cstPg.enterCompanyName("Code Studio");
        cstPg.enterAdminContent("Admin Content");
        cstPg.enterManagerOfVendor("Vendor 1");

    }

    @When("click on Save button")
    public void click_on_Save_button() {
        cstPg.clickOnSave();

    }

    @Then("User can view confirmation message {string}")
    public void user_can_view_confirmation_message(String expConf) {

        String bodyTag = driver.findElement(By.tagName("Body")).getText();

        if (bodyTag.contains(expConf)) {

            Assert.assertTrue(true);

        } else {

            Assert.assertTrue(false);
        }
    }

    //Search customer methods

    @When("Enter customer EMail")
    public void enter_customer_EMail() {
        searchCustomerPage.enterEmailAddress("victoria_victoria@nopCommerce.com");
    }

    @Then("Click on search button")
    public void click_on_search_button() {
        searchCustomerPage.clickOnSearchBtn();

    }

    @Then("User should found Email in the Search table")
    public void user_should_found_Email_in_the_Search_table() {
        String expectedEmail = "victoria_victoria@nopCommerce.com";

        Assert.assertTrue(searchCustomerPage.searchCustomerByEmail(expectedEmail));

    }

   /* @AfterStep
    public void afterStep() {
        System.out.println("This is after steps....");
    }*/

    @After
    public void teardown(Scenario sc) {
        System.out.println("Tear Down method executed");
        if (sc.isFailed() == true) {


            String fileWithPath = "C:\\Users\\Bhagyashree\\IdeaProjects\\BDD\\Screenshot\\failedScreenshot.png";
            TakesScreenshot scrShot = ((TakesScreenshot) driver);

            //Call getScreenshotAs method to create image file
            File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination
            File DestFile = new File(fileWithPath);

            //Copy file at destination

            try {
                FileUtils.copyFile(SrcFile, DestFile);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        driver.quit();
    }


   /* @After (order=2)
    public void teardown2() {
        System.out.println("Tear Down 2 method executed");
        driver.quit();
    }*/


    @And("close browser")
    public void closeBrowser() {
        log.info("Browser closed");
        driver.close();
        //driver.quit();
    }
}