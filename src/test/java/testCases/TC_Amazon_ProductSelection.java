package testCases;

import com.amazon.Utilities.Utilities;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.PLP;
import pageObjects.homePage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TC_Amazon_ProductSelection extends baseClass
{
    @Test
    public void ProductSelection() {

        driver.get("https://www.amazon.in/");

        String ExpectedPageTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(ExpectedPageTitle, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

        //Utilities object initialization
        Utilities ul = new Utilities(driver);

        //homePage object initialization
        homePage hp = new homePage(driver);

        hp.getHamburgerMenu().click();

        //bringing the TV, Appliance, Electronics webelement into view and then clicking on it.
        ul.scrollElementIntoView(driver, hp.getTVAppliancesCategory());
        hp.getTVAppliancesCategory().click();
        hp.getTelevisionCategory().click();

        ul.selectBrandFilter("Brands", "Samsung");

        //PLP object initialization

        PLP plp = new PLP(driver);

        plp.getsortByDropdown().click();
        plp.gethighToLowPrice().click();

        List<WebElement> Products = plp.getSortedProducts();
        //since we only need the product on the second index, therefore, checking the list size and after that selecting product.
        if (Products.size() > 1)
        {
            Products.get(1).click();
        }

//        else {
//            Assert.assertTrue(false);
//        }



        //getting active window handles
        Set<String> s=driver.getWindowHandles();
        Iterator<String> I1 = s.iterator();
        while (I1.hasNext())
        {
            String handle=I1.next();
            System.out.println(driver.switchTo().window(handle).getTitle());


        }


        }


    }


