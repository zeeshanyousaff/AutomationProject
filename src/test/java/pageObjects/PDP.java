package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class PDP {
    WebDriver driver;

    public PDP(WebDriver driver) {
        this.driver = driver;
    }

    By aboutThisItemTitle = By.cssSelector("#feature-bullets>h1");
    By aboutThisItemDetails = By.cssSelector("#feature-bullets>ul>li");

    public WebElement getAboutThisItemTitle() {
        Assert.assertTrue(driver.findElement(aboutThisItemTitle).isDisplayed());
        return driver.findElement(aboutThisItemTitle);
    }

    public List<WebElement> getAboutThisItemDetails() {
        Assert.assertNotNull(driver.findElements(aboutThisItemDetails));
        return driver.findElements(aboutThisItemDetails);
    }

    public void VerifyAndPrintAboutThisItemsection() {

        if (driver.findElement(aboutThisItemTitle).isDisplayed()) {

            Assert.assertTrue(true);

            for (int i = 0; i < driver.findElements(aboutThisItemDetails).size(); i++) {
                System.out.println(driver.findElements(aboutThisItemDetails).get(i).getText());
            }
        } else {
            Assert.assertTrue(false);
        }

    }

}
