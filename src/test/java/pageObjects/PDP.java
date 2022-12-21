package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class PDP {
    WebDriver driver;

    public PDP(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#feature-bullets>h1")
    WebElement aboutThisItemTitle;
    @FindBy(css = ("#feature-bullets>ul>li"))   //this locator returns all the <li> elements containing bullet point info.
    List<WebElement> aboutThisItemDetails;

    //getter methods for PDP elements
    public WebElement getAboutThisItemTitle() {
        return aboutThisItemTitle;
    }

    public List<WebElement> getAboutThisItemDetails() {
        return aboutThisItemDetails;
    }


    public void VerifyAndPrintAboutThisItemsection()
    {

        if (aboutThisItemTitle.isDisplayed()) {

            Assert.assertTrue(true);

            for (int i = 0; i < aboutThisItemDetails.size(); i++) {
                System.out.println(aboutThisItemDetails.get(i).getText());
            }
        } else
        {
            Assert.assertTrue(false);
        }



    }

}
