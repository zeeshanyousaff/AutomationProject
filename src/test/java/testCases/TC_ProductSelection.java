package testCases;

import com.amazon.Utilities.Utilities;

import pageObjects.PDP;
import pageObjects.PLP;
import org.testng.annotations.Test;
import pageObjects.homePage;

public class TC_ProductSelection extends baseClass {


    @Test(invocationCount = 1)
    public void ProductSelection() {

        Utilities ul = new Utilities(driver);
        homePage hp = new homePage(driver);
        PDP pdp = new PDP(driver);

        ul.navigateURL(URL);
        ul.verifyPageTitle(HomePageTitle);
        ul.clickOnElement(hp.getHamburgerMenu());
        ul.scrollIntoViewAndClick(hp.getTVAppliancesCategory());
        PLP plp = hp.getTelevisionCategory();
        ul.selectBrandFilter("Brands", "Samsung");
        ul.clickOnElement(plp.getsortByDropdown());
        ul.clickOnElement(plp.gethighToLowPrice());
        plp.getProduct(1);
        ul.switchtoNewWindow();
        ul.scrollElementIntoView(pdp.getAboutThisItemTitle());
        pdp.VerifyAndPrintAboutThisItemsection();
    }
}

