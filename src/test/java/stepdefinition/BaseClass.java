package stepdefinition;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import pageobject.CustomerPageObject;
import pageobject.EcommerceLogin1;
import pageobject.SearchCustomerPageObject;

public class BaseClass {

    public WebDriver driver;
    public EcommerceLogin1 loginPg;
    public CustomerPageObject cstPg;
    public SearchCustomerPageObject searchCustomerPage;

    public String genearateEmailId(){

        return(RandomStringUtils.randomAlphabetic(5));

    }

}
