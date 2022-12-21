package testCases;

import com.amazon.Utilities.Utilities;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.PDP;
import pageObjects.PLP;
import pageObjects.homePage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TC_ProductSelection extends baseClass {
    @Test
    public void ProductSelection() {

        driver.get("https://www.amazon.in/");
        //Utilities object initialization
        Utilities ul = new Utilities(driver);
        String ExpectedPageTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        ul.VerifyPageTitle(driver.getTitle(), ExpectedPageTitle);

        homePage hp = new homePage(driver);
        hp.getHamburgerMenu().click();

        ul.scrollElementIntoView(driver, hp.getTVAppliancesCategory());
        ul.clickOnElement(hp.getTVAppliancesCategory());
        //click on category and initialize PLP.
        PLP plp = hp.getTelevisionCategory();
        ul.selectBrandFilter("Brands", "Samsung");

        ul.clickOnElement(plp.getsortByDropdown());
        ul.clickOnElement(plp.gethighToLowPrice());
        plp.getProduct(1);

        ul.switchtoNewWindow(driver);

        PDP pdp = new PDP(driver);
        ul.scrollElementIntoView(driver, pdp.getAboutThisItemTitle());
        pdp.VerifyAndPrintAboutThisItemsection();
    }
}