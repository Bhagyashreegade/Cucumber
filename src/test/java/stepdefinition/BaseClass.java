package stepdefinition;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import pageobject.CustomerPageObject;
import pageobject.EcommerceLogin1;
import pageobject.SearchCustomerPageObject;
import org.apache.logging.log4j.*;
import utilities.ReadConfig;

import java.util.Properties;

public class BaseClass {

    public WebDriver driver;
    public EcommerceLogin1 loginPg;
    public CustomerPageObject cstPg;
    public SearchCustomerPageObject searchCustomerPage;
    public static Logger log;
    public ReadConfig readConfig;

    public String genearateEmailId(){

        return(RandomStringUtils.randomAlphabetic(5));

    }

}