package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.CustomerPageObject;
import pageobject.EcommerceLogin1;
import pageobject.SearchCustomerPageObject;

public class CustomerStepDef {
    public WebDriver driver;
    public EcommerceLogin1 loginPg;
    public CustomerPageObject cstPg;
    public SearchCustomerPageObject searchCustomerPage;


    @Given("User Launch Chrome browser")
    public void userLaunchChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPg = new EcommerceLogin1(driver);
        cstPg = new CustomerPageObject(driver);
        searchCustomerPage = new SearchCustomerPageObject(driver);
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

    //Login Feature

    @Then("Page Title should be {string}")
    public void pageTitleShouldBe(String expectedTitle) {
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            Assert.assertTrue(true);
        } else {
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
        cstPg.enterEmail("test128@gmail.com");
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
        searchCustomerPage.enterEmailAddress("test128@gmail.com");
    }

    @Then("Click on search button")
    public void click_on_search_button() {
        searchCustomerPage.clickOnSearchBtn();

    }

    @Then("User should found Email in the Search table")
    public void user_should_found_Email_in_the_Search_table() {
        String expectedEmail = "test128@gmail.com";

        Assert.assertTrue(searchCustomerPage.searchCustomerByEmail(expectedEmail));

    }

        @And("close browser")
        public void closeBrowser () {
            driver.close();
            driver.quit();
        }
    }

