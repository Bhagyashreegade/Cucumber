package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchCustomerPageObject {

    WebDriver ldriver;

    public SearchCustomerPageObject(WebDriver rDriver) {
        ldriver = rDriver;

        PageFactory.initElements(rDriver, this);
    }


    @FindBy(id = "SearchEmail")
    WebElement emailAdd;
    @FindBy(id = "search-customers")
    WebElement searchBtn;
    @FindBy(xpath = "//table[@role='grid']")
    WebElement searchResult;
    @FindBy(xpath = "//table[@id='customers-grid']//tbody/tr")
    List<WebElement> tableRows;
    // @FindBy(xpath = "//table[@id='customers-grid']//tbody/tr[1]/td")
    //List<WebElement> tableColumns;


    public void enterEmailAddress(String email) {
        emailAdd.sendKeys(email);
    }

    public void clickOnSearchBtn() {
        searchBtn.click();
    }

    public boolean searchCustomerByEmail(String email) {

        boolean found = false;
        //searchResult.click();

        //total no. of rows in a grid
        int ttlRows = tableRows.size();

        for (int i = 1; i <= ttlRows; i++)//to iterate all the rows of the grid
        {
            System.out.println("Searching row:" + i);

            WebElement webElementEmail = ldriver.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr[" + i + "]/td[2]"));
            // String actualEmailAdd = webElementEmail.getText();
            System.out.println(webElementEmail);

            if (webElementEmail.equals(email)) {
                found = true;
            }


        }

        return found;


    }
}



